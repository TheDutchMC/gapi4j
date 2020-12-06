package nl.thedutchmc.gapi4j.apis.youtubedatav3.captions;

import nl.thedutchmc.gapi4j.apis.RequestParameters;
import nl.thedutchmc.gapi4j.apis.RequestPart;

public class ListParameters extends RequestParameters {

	private String videoId, id, onBehalfOfContentOwner;
	
	/**
	 * The part parameter specifies the caption resource parts that the API response will include. <br>
	 * <br>
	 * The list below contains the part names that you can include in the parameter value:<br>
	 * - id<br>
	 * - snippet<br>
	 * @param requestParts Supported: id, snippet
	 */
	public ListParameters(RequestPart... requestParts) {
		super(requestParts);
	}
	
	/**
	 * The videoId parameter specifies the YouTube video ID of the video for which the API should return caption tracks.
	 * 
	 */
	public String getVideoId() {
		return this.videoId;
	}
	
	/**
	 * The videoId parameter specifies the YouTube video ID of the video for which the API should return caption tracks.
	 * @param videoId
	 */
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	
	/**
	 * The id parameter specifies a comma-separated list of IDs that identify the caption resources that should be retrieved. Each ID must identify a caption track associated with the specified video.
	 * 
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * The id parameter specifies a comma-separated list of IDs that identify the caption resources that should be retrieved. Each ID must identify a caption track associated with the specified video.
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
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
	

	
	
}
