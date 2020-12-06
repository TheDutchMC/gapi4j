package nl.thedutchmc.gapi4j.apis.youtubedatav3.captions;

import nl.thedutchmc.gapi4j.apis.RequestParameters;
import nl.thedutchmc.gapi4j.apis.RequestPart;

public class InsertParameters extends RequestParameters {

	private String onBehalfOfContentOwner, requestBody;
	private boolean sync;
	
	/**
	 * The part parameter specifies the caption resource parts that the API response will include. Set the parameter value to snippet. <br>
	 * <br>
	 * The following list contains the part names that you can include in the parameter value:<br>
	 * - id<br>
	 * - snippet<br>
	 * @param requestParts Supported: id, snippet
	 */
	public InsertParameters(RequestPart[] requestParts) {
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
	 * Provide a <a href="https://developers.google.com/youtube/v3/docs/captions#resource">caption resource</a> in the request body. For that resource: <br>
	 *<br>
	 * You must specify a value for these properties:<br>
	 * - snippet.videoId<br>
	 * - snippet.language<br>
	 * - snippet.name<br>
	 * You can set values for these properties:<br>
	 * - snippet.videoId<br>
	 * - snippet.language<br>
	 * - snippet.name<br>
	 * - snippet.isDraft<br>
	 * 
	 */
	public String getRequestBody() {
		return this.requestBody;
	}
	
	/**
	 * Provide a <a href="https://developers.google.com/youtube/v3/docs/captions#resource">caption resource</a> in the request body. For that resource: <br>
	 *<br>
	 * You must specify a value for these properties:<br>
	 * - snippet.videoId<br>
	 * - snippet.language<br>
	 * - snippet.name<br>
	 * You can set values for these properties:<br>
	 * - snippet.videoId<br>
	 * - snippet.language<br>
	 * - snippet.name<br>
	 * - snippet.isDraft<br>
	 * 
	 * @param requestBody
	 */
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	
	/**
	 * The sync parameter indicates whether YouTube should automatically synchronize the caption file with the audio track of the video. If you set the value to true, YouTube will disregard any time codes that are in the uploaded caption file and generate new time codes for the captions.<br>
	 * <br>
	 * You should set the sync parameter to true if you are uploading a transcript, which has no time codes, or if you suspect the time codes in your file are incorrect and want YouTube to try to fix them.<br>
	 * 
	 */
	public boolean getSync() {
		return this.sync;
	}
	
	/**
	 * The sync parameter indicates whether YouTube should automatically synchronize the caption file with the audio track of the video. If you set the value to true, YouTube will disregard any time codes that are in the uploaded caption file and generate new time codes for the captions.<br>
	 * <br>
	 * You should set the sync parameter to true if you are uploading a transcript, which has no time codes, or if you suspect the time codes in your file are incorrect and want YouTube to try to fix them.<br>
	 * 
	 * @param sync
	 */
	public void setSync(boolean sync) {
		this.sync = sync;
	}
}
