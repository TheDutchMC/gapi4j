package nl.thedutchmc.gapi4j.apis.youtubedatav3.channels;

import java.io.IOException;
import java.util.HashMap;

import nl.thedutchmc.gapi4j.apis.youtubedatav3.OAuthObject;
import nl.thedutchmc.gapi4j.apis.youtubedatav3.OAuthObject.OAuthScope;
import nl.thedutchmc.gapi4j.exceptions.RequestException;
import nl.thedutchmc.gapi4j.http.Http;
import nl.thedutchmc.gapi4j.http.Http.RequestMethod;
import nl.thedutchmc.gapi4j.http.Http.ResponseObject;

public class Channels {

	/**
	 * Returns a collection of zero or more channel resources that match the request criteria. <br>
	 * Quata cost: 1 unit<br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/channels/list"> Google documentation</a>
	 * @param params Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject getList(ListParameters params) throws RequestException, IOException {
		
		HashMap<String, String> urlParams = new HashMap<>();
		urlParams.put("part", params.getRequestPartsAsString());
		
		boolean requiredParamSet = false;
		if(params.getForUsername() != null) {
			urlParams.put("forUsername", params.getForUsername());
			requiredParamSet = true;
		}
		
		if(params.getId() != null) {
			if(requiredParamSet) {
				throw new RequestException("Multiple filters set, this is now allowed.");
			}
			
			urlParams.put("id", params.getId());
			requiredParamSet = true;
		}
		
		if(params.getManagedByMe()) {
			if(requiredParamSet) {
				throw new RequestException("Multiple filters set, this is now allowed.");
			}
			
			if(params.getOauthObject() == null) {
				throw new RequestException("OAuth is required for managedByMe parameter");
			}
			
			urlParams.put("managedByMe", String.valueOf(params.getManagedByMe()));
			requiredParamSet = true;
		}
		
		if(params.getMine()) {
			if(requiredParamSet) {
				throw new RequestException("Multiple filters set, this is now allowed.");
			}
			
			if(params.getOauthObject() == null) {
				throw new RequestException("OAuth is required for mine parameter");
			}
			
			urlParams.put("mine", String.valueOf(params.getMine()));
			requiredParamSet = true;
		}
		
		if(!requiredParamSet) {
			throw new RequestException("No filter set, you must set at least one");
		}
		
		if(params.getHl() != null) {
			urlParams.put("hl", params.getHl());
		}
		
		if(params.getOnBehalfOfContentOwner() != null) {
			if(params.getOauthObject() == null) {
				throw new RequestException("OAuth is required for onBehalfOfContentOwner parameter");
			}
			
			urlParams.put("onBehalfOfContentOwner", params.getOnBehalfOfContentOwner());
		}
		
		if(params.getPageToken() != null) {
			urlParams.put("pageToken", params.getPageToken());
		}
		
		if(params.getNextPageToken() != null) {
			urlParams.put("nextPageToken", params.getNextPageToken());
		}
		
		if(params.getPrevPageToken() != null) {
			urlParams.put("prevPageToken", params.getPrevPageToken());
		}
		
		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.GET, "https://www.googleapis.com/youtube/v3/channels", urlParams, null);
	
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}
		
		return apiResponse;
	}
	
	/**
	 * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings, invideoPromotion, and localizations objects and their child properties.<br>
	 * <br>
	 * Requires any of the following OAuth scopes:<br>
	 * - {@link OAuthObject.OAuthScope#youtube_partner} <br>
	 * - {@link OAuthObject.OAuthScope#youtube} <br>
	 * - {@link OAuthObject.OAuthScope#youtube_force_ssl} <br>
	 * <br>
	 * Quata cost: 50 units<br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/channels/update"> Google documentation</a>
	 * @param params Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject putUpdate(UpdateParemeters params) throws IOException, RequestException {
		
		HashMap<String, String> urlParams = new HashMap<>();
		urlParams.put("part", params.getRequestPartsAsString());
		
		if(params.getOnBehalfOfContentOwner() != null) {
			if(params.getOauthObject() == null) {
				throw new RequestException("OAuth is required for onBehalfOfContentOwner parameter");
			}
			
			urlParams.put("onBehalfOfContentOwner", params.getOnBehalfOfContentOwner());
		}
		
		if(params.getRequestBody() == null) {
			throw new RequestException("RequestBody cannot be null");
		}
		
		if(!params.getOauthObject().areSomeScopesEnabled(OAuthScope.youtube_partner, OAuthScope.youtube, OAuthScope.youtube_force_ssl)) {
			throw new RequestException("Missing required OAuth scopes");
		}
		
		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.PUT, "https://www.googleapis.com/youtube/v3/channels", urlParams, params.getRequestBody());
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}
		
		return apiResponse;
	}
}
