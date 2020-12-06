package nl.thedutchmc.gapi4j.apis.youtubedatav3.captions;

import nl.thedutchmc.gapi4j.apis.RequestParameters;
import nl.thedutchmc.gapi4j.apis.RequestPart;

public class UpdateParameters extends RequestParameters {

	private String onBehalfOfContentOwner, requestBody;
	private boolean sync;
	
	/**
	 * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. Set the property value to snippet if you are updating the track's <a href="https://developers.google.com/youtube/v3/docs/captions#snippet.isDraft">draft status</a>. Otherwise, set the property value to id. <br>
	 *<br>
	 * The following list contains the part names that you can include in the parameter value:<br>
	 * - id<br>
	 * - snippet<br>
	 * @param requestParts Supported: id, snippet
	 */
	public UpdateParameters(RequestPart[] requestParts) {
		super(requestParts);
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Note: This parameter is intended exclusively for YouTube content partners. <br>
	 * <br>
     * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.<br>
     * <br>
	 */
	public String getOnBehalfOfContentOwner() {
		return this.onBehalfOfContentOwner;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Note: This parameter is intended exclusively for YouTube content partners. <br>
	 * <br>
     * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.<br>
     * <br>
     * @param contentOwner
	 */
	public void setOnBehalfOfContentOwner(String contentOwner) {
		this.onBehalfOfContentOwner = contentOwner;
	}
	
	/**
	 * Note: The API server only processes the parameter value if the request contains an updated caption file. <br>
	 * <br>
	 * The sync parameter indicates whether YouTube should automatically synchronize the caption file with the audio track of the video. If you set the value to true, YouTube will automatically synchronize the caption track with the audio track.<br>
	 */
	public boolean getSync() {
		return this.sync;
	}
	
	/**
	 * Note: The API server only processes the parameter value if the request contains an updated caption file. <br>
	 * <br>
	 * The sync parameter indicates whether YouTube should automatically synchronize the caption file with the audio track of the video. If you set the value to true, YouTube will automatically synchronize the caption track with the audio track.<br>
	 * @param sync
	 */
	public void setSync(boolean sync) {
		this.sync = sync;
	}
	
	/**
	 * Provide a caption resource in the request body. For that resource: <br>
	 * <br>
	 * You must specify a value for these properties:<br>
	 * - id<br>
	 * You can set values for these properties:<br>
	 * - snippet.isDraft<br>
	 * <br>
	 * If you are submitting an update request, and your request does not specify a value for a property that already has a value, the property's existing value will be deleted.<br>
	 */
	public String getRequestBody() {
		return this.requestBody;
	}
	
	/**
	 * Provide a caption resource in the request body. For that resource: <br>
	 * <br>
	 * You must specify a value for these properties:<br>
	 * - id<br>
	 * You can set values for these properties:<br>
	 * - snippet.isDraft<br>
	 * <br>
	 * If you are submitting an update request, and your request does not specify a value for a property that already has a value, the property's existing value will be deleted.<br>
	 * @param requestBody
	 */
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	
	
}
