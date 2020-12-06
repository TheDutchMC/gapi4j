package nl.thedutchmc.gapi4j.apis.youtubedatav3.captions;

import nl.thedutchmc.gapi4j.apis.RequestParameters;

public class DeleteParameters extends RequestParameters {

	private String id, onBehalfOfContentOwner;
	
	/**
	 * The id parameter identifies the caption track that is being deleted. The value is a caption track ID as identified by the <a href="https://developers.google.com/youtube/v3/docs/captions#id">id</a> property in a caption resource.
	 * @param id
	 */
	public DeleteParameters(String id) {
		this.id = id;
	}
	
	/**
	 * The id parameter identifies the caption track that is being deleted. The value is a caption track ID as identified by the <a href="https://developers.google.com/youtube/v3/docs/captions#id">id</a> property in a caption resource.
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * The id parameter identifies the caption track that is being deleted. The value is a caption track ID as identified by the <a href="https://developers.google.com/youtube/v3/docs/captions#id">id</a> property in a caption resource.
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Note: This parameter is intended exclusively for YouTube content partners. <br>
	 * <br>
	 * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.<br>
	 */
	public String getOnBehalfOfContentOwner() {
		return this.onBehalfOfContentOwner;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Note: This parameter is intended exclusively for YouTube content partners. <br>
	 * <br>
	 * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.<br>
	 * @param contentOwner
	 */
	public void setOnBehalfOfContentOwner(String contentOwner) {
		this.onBehalfOfContentOwner = contentOwner;
	}
}
