package nl.thedutchmc.gapi4j.apis.youtubedatav3.activities;

import java.io.IOException;
import java.util.HashMap;

import nl.thedutchmc.gapi4j.exceptions.RequestException;
import nl.thedutchmc.gapi4j.http.Http;
import nl.thedutchmc.gapi4j.http.Http.RequestMethod;
import nl.thedutchmc.gapi4j.http.Http.ResponseObject;

public class Activities {
	
	/**
	 * Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel or with the user's own channel.<br>
	 * <br>
	 * Quota cost: 1 unit<br>
	 * <br>
	 * <a href="https://developers.google.com/youtube/v3/docs/activities/list"> Google documentation</a>
	 * @param listParameters Parameters to send along with the request
	 * @param apiKey API key to use to authorize the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject getList(ListParameters listParameters) throws IOException, RequestException {
		
		HashMap<String, String> parameters = new HashMap<>();
		parameters.put("part", listParameters.getRequestPartsAsString());
		parameters.put("maxResults", String.valueOf(listParameters.getMaxResults()));
		
		if(listParameters.getChannelId() != null) {
			parameters.put("channelId", listParameters.getChannelId());
		}
		
		if(listParameters.getPageToken() != null) {
			parameters.put("pageToken", listParameters.getPageToken());
		}
			
		if(listParameters.getPublishedAfter() != null) {
			parameters.put("publishedAfter", listParameters.getPublishedAfter().toString());
		}
		
		if(listParameters.getPublishedBefore() != null) {
			parameters.put("publishedBefore", listParameters.getPublishedBefore().toString());
		}
			
		if(listParameters.getRegionCode() != null) {
			parameters.put("regionCode", listParameters.getRegionCode());
		}
		
		if(listParameters.getOauthObject() != null) {
			parameters.put("key", listParameters.getOauthObject().getAuthToken());
			
			if(listParameters.getChannelId() == null) {
				parameters.put("mine", String.valueOf(listParameters.getMine()));
			}
		} else if(listParameters.getApiKey() != null) {
			parameters.put("key", listParameters.getApiKey());
		} else {
			throw new RequestException("No authentication method provided.");
		}
		
		ResponseObject apiResponse = new Http().makeRequest(RequestMethod.GET, "https://www.googleapis.com/youtube/v3/activities", parameters, null);
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}

		return apiResponse;
	}
}