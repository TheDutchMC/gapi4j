package nl.thedutchmc.gapi4j.apis.youtubedatav3.channelbanners;

import java.io.IOException;
import java.util.HashMap;

import nl.thedutchmc.gapi4j.apis.youtubedatav3.OAuthObject.OAuthScope;
import nl.thedutchmc.gapi4j.exceptions.RequestException;
import nl.thedutchmc.gapi4j.http.Http;
import nl.thedutchmc.gapi4j.http.Http.RequestMethod;
import nl.thedutchmc.gapi4j.http.Http.ResponseObject;

public class ChannelBanners {

	//TODO Correct javadoc once method Channels#update() is implemented
	
	/**
	 * Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel: <br>
	 * 1. Call the {@link #postInsert(InsertParameters)} method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2048x1152 pixels. We recommend uploading a 2560px by 1440px image.<br>
	 * 2. Extract the url property's value from the response that the API returns for step 1. <br>
	 * 3. Call the {@link Channels#update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2. <br>
	 * This method supports media upload. Uploaded files must conform to these constraints: <br>
	 * - Maximum file size: 6MB <br>
	 * Quata cost: 50 units<br>
	 * @param listParameters Parameters to send along with the request
	 * @return Returns the response from the API
	 * @throws IOException
	 * @throws RequestException Thrown when anything other than a HTTP 200 status is returned
	 */
	public static ResponseObject postInsert(InsertParameters params) throws IOException, RequestException {
		
		HashMap<String, String> urlParams = new HashMap<String, String>();
		
		if(params.getOnBehalfOfContentOwner() != null) {
			urlParams.put("onBehalfOfContentOwner", params.getOnBehalfOfContentOwner());
		}
		
		if(params.getOauthObject() == null) {
			throw new RequestException("This request requires OAuth");
		}
		
		if(!params.getOauthObject().areSomeScopesEnabled(OAuthScope.youtube_force_ssl, OAuthScope.youtube, OAuthScope.youtube_upload)) {
			throw new RequestException("Required OAuth scopes are missing");
		}
		
		urlParams.put("key", params.getOauthObject().getAuthToken());
		
		ResponseObject apiResponse = Http.makeRequestFile(RequestMethod.POST, "https://www.googleapis.com/upload/youtube/v3/channelBanners/insert", urlParams, params.getMediaFormat(), params.getBanner());
		
		if(apiResponse.getResponseCode() != 200) {
			throw new RequestException(apiResponse.getMessage());
		}
		
		return apiResponse;
		
	}
}
