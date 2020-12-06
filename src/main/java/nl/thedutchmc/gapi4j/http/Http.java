/**
 * HTTP Library for sending HTTP requests
 * @author Tobias de Bruijn
 */

package nl.thedutchmc.gapi4j.http;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import nl.thedutchmc.gapi4j.Gapi4j;

public class Http {

	/**
	 * Send a HTTP Request
	 * @param method Method to use (e.g POST)
	 * @param targetUrl URL to send the request to (e.g https://example.com)
	 * @param params URL Parameters to be used
	 * @return Returns a ResponseObject
	 * @throws MalformedURLException Thrown when an invalid URL is given
	 * @throws IOException Thrown when an IOException occurs
	 */
	public ResponseObject makeRequest(RequestMethod method, String targetUrl, HashMap<String, String> params, String requestBody) throws MalformedURLException, IOException {
		//Turn the HashMap of parameters into a String
		final String sParams = hashMapToString(params);
		
		//Determine the request method
		String sMethod = "";
		switch(method) {
		case GET: 
			sMethod = "GET"; 
			break;
		case POST: 
			sMethod = "POST"; 
			break;
		case PUT:
			sMethod = "PUT";
			break;
		case DELETE:
			sMethod = "DELETE";
			break;
		}
		
		//Create the URL, open a connection and connect.
    	final URL url = new URL(targetUrl + sParams);
    	final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    	conn.setRequestMethod(sMethod);
    	conn.connect();
    	
    	if(requestBody != null) {
        	conn.setDoOutput(true);
    		conn.setRequestProperty("Content-Type", "application/json; utf-8");
    		
    		OutputStream os = conn.getOutputStream();
    		byte[] input = requestBody.getBytes("utf-8");
    		os.write(input, 0, input.length);
    	}
    	                	
    	//Get the response message from the server
    	String result = "";
        try {
        	BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            result = reader.lines().collect(Collectors.joining("\n"));

        } catch(IOException e) {
            Gapi4j.logDebug("HttpRequest: " + method + "::" + targetUrl);
            Gapi4j.logDebug("HttpRequest: " + conn.getResponseCode() + "::" + conn.getResponseMessage());
            Gapi4j.logDebug("HttpRequest ErrorStream: \n" + new BufferedReader(new InputStreamReader(conn.getErrorStream())).lines().collect(Collectors.joining("\n")));
            
            e.printStackTrace();
        }
        
        conn.disconnect();
        
        Http http = new Http();
		return http.new ResponseObject(result, conn.getResponseCode(), conn.getResponseMessage());
	}
	
	public static ResponseObject makeRequestFile(RequestMethod method, String targetUrl, HashMap<String, String> params, MediaFormat format, File file) throws MalformedURLException, IOException {
		//Turn the HashMap of parameters into a String
		final String sParams = hashMapToString(params);
		
		//Determine the request method
		String sMethod = "";
		switch(method) {
		case GET: 
			sMethod = "GET"; 
			break;
		case POST: 
			sMethod = "POST"; 
			break;
		case PUT:
			sMethod = "PUT";
			break;
		case DELETE:
			sMethod = "DELETE";
			break;
		}
		
		//Create the URL, open a connection and connect.
    	final URL url = new URL(targetUrl + sParams);
    	final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    	conn.setRequestMethod(sMethod);
    	conn.connect();
    	
    	conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", format.getApplicationType());
		
		OutputStream os = conn.getOutputStream();
		byte[] fileBytes = Files.readAllBytes(file.toPath());
		os.write(fileBytes, 0, fileBytes.length);
    	                	
    	//Get the response message from the server
    	String result = "";
        try {
        	BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            result = reader.lines().collect(Collectors.joining("\n"));

        } catch(IOException e) {
            Gapi4j.logDebug("HttpRequest: " + method + "::" + targetUrl);
            Gapi4j.logDebug("HttpRequest: " + conn.getResponseCode() + "::" + conn.getResponseMessage());
            Gapi4j.logDebug("HttpRequest ErrorStream: \n" + new BufferedReader(new InputStreamReader(conn.getErrorStream())).lines().collect(Collectors.joining("\n")));
            
            e.printStackTrace();
        }
        
        conn.disconnect();
        
        Http http = new Http();
		return http.new ResponseObject(result, conn.getResponseCode(), conn.getResponseMessage());
	}
	
	private static String hashMapToString(HashMap<String, String> input) {
		final StringBuilder result = new StringBuilder();
		int index = 1;
		
		for(Map.Entry<String, String> entry : input.entrySet()) {
			
			//If we're on the first iteration,
			//add the '?' character
			if(index == 1) {
				result.append("?");
			}
			
			//Add the key, a '=' and the value.
			result.append(entry.getKey());
			result.append("=");
			result.append(entry.getValue());
			
			//Check if we're not yet on the last iteration
			//If not, add the '&' character.
			if(index != input.size()) {
				result.append("&");
			}
			
			index++;
		}
		
		return result.toString();
	}
	
	public enum RequestMethod {
		GET,
		POST, 
		PUT,
		DELETE
	}
	
	public enum MediaFormat {
		JSON("application/json"),
		JPEG("application/jpeg"),
		PNG("application/png"),
		XML("application/xml");
		
		private String applicationType;
		private MediaFormat(String applicationType) {
			this.applicationType = applicationType;
		}
		
		public String getApplicationType() {
			return this.applicationType;
		}
	}
	
	public class ResponseObject {
		
		private String content, connectionMessage;
		private int responseCode;
		
		public ResponseObject(String content, int responseCode, String connectionMessage) {
			this.content = content;
			this.responseCode = responseCode;
			this.connectionMessage = connectionMessage;
		}
		
		public String getMessage() {
			return this.content;
		}
		
		public int getResponseCode() {
			return this.responseCode;
		}
		
		public String getConnectionMessage() {
			return this.connectionMessage;
		}
	}
}