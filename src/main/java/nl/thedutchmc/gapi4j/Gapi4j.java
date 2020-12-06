/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package nl.thedutchmc.gapi4j;

import java.io.IOException;

import nl.thedutchmc.gapi4j.apis.RequestPart;
import nl.thedutchmc.gapi4j.apis.youtubedatav3.captions.Captions;
import nl.thedutchmc.gapi4j.apis.youtubedatav3.captions.ListParameters;
import nl.thedutchmc.gapi4j.exceptions.RequestException;

public class Gapi4j {

	private static boolean DEBUG_MODE = true;
	
	//TODO This is a debug method and not to be added to releases
	public static void main(String[] args) {
		
		String apiKey = "";
		String channelId = "";
		String videoId = "";
		
		ListParameters params = new ListParameters(RequestPart.snippet);
		params.setApiKey(apiKey);
		params.setVideoId(videoId);
		
		try {
			String response = Captions.getList(params).getMessage();
			
			logInfo(response);
			
		} catch (RequestException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void logError(Object log) {
		System.err.println("[Error] " + log.toString());
	}
	
	public static void logDebug(Object log) {
		if(DEBUG_MODE) {
			System.out.println("[DEBUG] " + log.toString());
		}
	}
	
	public static void logInfo(Object log) {
		System.out.println("[INFO] " + log.toString());
	}
}