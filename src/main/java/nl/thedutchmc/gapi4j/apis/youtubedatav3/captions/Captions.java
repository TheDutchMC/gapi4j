package nl.thedutchmc.gapi4j.apis.youtubedatav3.captions;

import java.io.IOException;
import java.util.HashMap;

import nl.thedutchmc.gapi4j.apis.youtubedatav3.OAuthObject.OAuthScope;
import nl.thedutchmc.gapi4j.exceptions.RequestException;
import nl.thedutchmc.gapi4j.http.Http;
import nl.thedutchmc.gapi4j.http.Http.RequestMethod;
import nl.thedutchmc.gapi4j.http.Http.ResponseObject;

public class Captions {
	
	/**
	 * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that the Captions.getDownload() method provides the ability to retrieve a caption track.<br>
	 * <br>
	 * Quata cost: 50 units<br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/captions/list"> Google documentation</a>
	 * @param params Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject getList(ListParameters params) throws IOException, RequestException {
		
		HashMap<String, String> urlParams = new HashMap<>();
		urlParams.put("part", params.getRequestPartsAsString());
		
		if(params.getVideoId() != null) {
			urlParams.put("videoId", params.getVideoId());
		} else {
			throw new RequestException("videoId cannot be empty");
		}
		
		if(params.getId() != null) {
			urlParams.put("id", params.getId());
		}
		if(params.getOauthObject() == null) {
			throw new RequestException("This request requires OAuth");
		}
		
		if(!params.getOauthObject().areSomeScopesEnabled(OAuthScope.youtube_force_ssl, OAuthScope.youtube_partner)) {
			throw new RequestException("Required OAuth scopes are missing");
		}
		
		urlParams.put("key", params.getOauthObject().getAuthToken());
		
		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.GET, "https://www.googleapis.com/youtube/v3/captions", urlParams, null);
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}
		
		return apiResponse;
	}
	
	//TODO Figure out how to send both a request body and a file for this method to work
	
	/**Uploads a caption track.<br>
	 * <br>
	 * <strong> A request body must be provided using {@link InsertParameters#setRequestBody(String)} </strong><br>
	 * <br>
	 * Quata cost: 400 units<br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/captions/insert"> Google documentation</a>
	 * @param params Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject postInsert(InsertParameters params) throws IOException, RequestException {
		
		HashMap<String, String> urlParams = new HashMap<>();
		urlParams.put("part", params.getRequestPartsAsString());
		urlParams.put("sync", String.valueOf(params.getSync()));
		
		if(params.getOnBehalfOfContentOwner() != null) {
			urlParams.put("onBehalfOfContentOwner", params.getOnBehalfOfContentOwner());
		}

		if(params.getOauthObject() == null) {
			throw new RequestException("This request requires OAuth");
		}
		
		if(!params.getOauthObject().areSomeScopesEnabled(OAuthScope.youtube_force_ssl, OAuthScope.youtube_partner)) {
			throw new RequestException("Required OAuth scopes are missing");
		}
		
		if(params.getRequestBody() == null) {
			throw new RequestException("No request body provided");
		}
		
		urlParams.put("key", params.getOauthObject().getAuthToken());
		
		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.POST, "https://www.googleapis.com/upload/youtube/v3/captions", urlParams, params.getRequestBody());
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}
		
		return apiResponse;
	}
	
	//TODO Figure out how to send both a request body and a file for this method to work
	
	/**
	 * Updates a caption track. When updating a caption track, you can change the track's <a href="https://developers.google.com/youtube/v3/docs/captions#snippet.isDraft">draft status</a>, upload a new caption file for the track, or both.<br>
	 * <br>
	 * This method supports media upload. Uploaded files must conform to these constraints:<br>
	 * Maximum file size: 100MB<br>
	 * <br>
	 * <strong> A request body must be provided using {@link InsertParameters#setRequestBody(String)} </strong><br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/captions/update"> Google documentation</a>
	 * Quata cost: 450 units<br>
	 * @param params Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject putUpdate(UpdateParameters params) throws IOException, RequestException {
		
		HashMap<String, String> urlParams = new HashMap<>();
		urlParams.put("part", params.getRequestPartsAsString());
		urlParams.put("sync", String.valueOf(params.getSync()));
		
		if(params.getOnBehalfOfContentOwner() != null) {
			urlParams.put("onBehalfOfContentOwner", params.getOnBehalfOfContentOwner());
		}
		
		if(params.getOauthObject() == null) {
			throw new RequestException("This request requires OAuth");
		}
		
		if(!params.getOauthObject().areSomeScopesEnabled(OAuthScope.youtube_force_ssl, OAuthScope.youtube_partner)) {
			throw new RequestException("Required OAuth scopes are missing");
		}
		
		if(params.getRequestBody() == null) {
			throw new RequestException("No request body provided");
		}
		
		urlParams.put("key", params.getOauthObject().getAuthToken());

		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.PUT, "https://www.googleapis.com/upload/youtube/v3/captions", urlParams, params.getRequestBody());
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}
		
		return apiResponse;
	}
	
	/**
	 * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its original language unless the request specifies a value for the tlang parameter.<br>
	 * Quata cost: 200 units<br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/captions/download"> Google documentation</a>
	 * @param params Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject getDownload(DownloadParameters params) throws IOException, RequestException {
		
		HashMap<String, String> urlParams = new HashMap<>();
		
		if(params.getOnBehalfOfContentOwner() != null) {
			urlParams.put("onBehalfOfContentOwner", params.getOnBehalfOfContentOwner());
		}
		
		if(params.getOauthObject() == null) {
			throw new RequestException("This request requires OAuth");
		}
		
		if(!params.getOauthObject().areSomeScopesEnabled(OAuthScope.youtube_force_ssl, OAuthScope.youtube_partner)) {
			throw new RequestException("Required OAuth scopes are missing");
		}
		
		if(params.getTfmt() != null) {
			urlParams.put("tfmt", params.getTfmt().toString());
		}
		
		if(params.getTlang() != null) {
			urlParams.put("tlang", params.getTlang());
		}
		
		if(params.getId() == null) {
			throw new RequestException("No id provided");
		}
		
		urlParams.put("key", params.getOauthObject().getAuthToken());

		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.GET, "https://www.googleapis.com/youtube/v3/captions/" + params.getId(), urlParams, null);
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}

		return apiResponse;
	}
	
	/**
	 * Deletes a specified caption track. <br>
	 * Quata cost: 50 units<br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/captions/delete"> Google documentation</a>
	 * @param params Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject delete(DownloadParameters params) throws IOException, RequestException {
		HashMap<String, String> urlParams = new HashMap<>();
		
		if(params.getId() != null) {
			urlParams.put("id", params.getId());
		} else {
			throw new RequestException("No id provided");
		}
		
		if(params.getOnBehalfOfContentOwner() != null) {
			urlParams.put("onBehalfOfContentOwner", params.getOnBehalfOfContentOwner());
		}
		
		if(params.getOauthObject() == null) {
			throw new RequestException("This request requires OAuth");
		}
		
		if(!params.getOauthObject().areSomeScopesEnabled(OAuthScope.youtube_force_ssl, OAuthScope.youtube_partner)) {
			throw new RequestException("Required OAuth scopes are missing");
		}
		
		urlParams.put("key", params.getOauthObject().getAuthToken());
		
		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.DELETE, "https://www.googleapis.com/youtube/v3/captions", urlParams, null);
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}

		return apiResponse;
	}
}
