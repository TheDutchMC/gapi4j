package nl.thedutchmc.gapi4j.apis.youtubedatav3.channelbanners;

import java.io.File;

import nl.thedutchmc.gapi4j.apis.RequestParameters;
import nl.thedutchmc.gapi4j.http.Http.MediaFormat;

public class InsertParameters extends RequestParameters {

	private String onBehalfOfContentOwner;
	private File banner;
	private MediaFormat mediaFormat;
	
	/**
	 * The media format used for the banner. See: {@link #getBanner()}
	 */
	public MediaFormat getMediaFormat() {
		return this.mediaFormat;
	}
	
	/**
	 * The media format used for the banner. See: {@link #setBanner(File)}
	 * @param mediaFormat Accepted formats: JPEG, PNG
	 */
	public void setMediaFormat(MediaFormat mediaFormat) {
		this.mediaFormat = mediaFormat;
	}
	
	/**
	 * The banner to send to the API.
	 */
	public File getBanner() {
		return this.banner;
	}
	
	/**
	 * The banner to send to the API.
	 * @param banner Accepted formats: JPEG, PNG
	 */
	public void setBanner(File banner) {
		this.banner = banner;
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
