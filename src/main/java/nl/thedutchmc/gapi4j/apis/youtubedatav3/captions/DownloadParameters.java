package nl.thedutchmc.gapi4j.apis.youtubedatav3.captions;

import nl.thedutchmc.gapi4j.apis.RequestParameters;

public class DownloadParameters extends RequestParameters {

	private String id, onBehalfOfContentOwner, tlang;
	private Tfmt tfmt;
	
	/**
	 * The id parameter identifies the caption track that is being retrieved. The value is a caption track ID as identified by the <a href="https://developers.google.com/youtube/v3/docs/captions#id">id</a> property in a caption resource.
	 * @param id
	 */
	public DownloadParameters(String id) {
		this.id = id;
	}
	
	/**
	 * The id parameter identifies the caption track that is being retrieved. The value is a caption track ID as identified by the <a href="https://developers.google.com/youtube/v3/docs/captions#id">id</a> property in a caption resource.
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * The id parameter identifies the caption track that is being retrieved. The value is a caption track ID as identified by the <a href="https://developers.google.com/youtube/v3/docs/captions#id">id</a> property in a caption resource.
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
	
	/**
	 * The tfmt parameter specifies that the caption track should be returned in a specific format. If the parameter is not included in the request, the track is returned in its original format.<br>
	 *<br>
	 * Supported values are:<br>
	 * - sbv � SubViewer subtitle<br>
	 * - scc � Scenarist Closed Caption format<br>
	 * - srt � SubRip subtitle<br>
	 * - ttml � Timed Text Markup Language caption<br>
	 * - vtt � Web Video Text Tracks caption<br>
	 */
	public Tfmt getTfmt() {
		return this.tfmt;
	}
	
	/**
	 * The tfmt parameter specifies that the caption track should be returned in a specific format. If the parameter is not included in the request, the track is returned in its original format. <br>
	 *<br>
	 * Supported values are:<br>
	 * - sbv � SubViewer subtitle<br>
	 * - scc � Scenarist Closed Caption format<br>
	 * - srt � SubRip subtitle<br>
	 * - ttml � Timed Text Markup Language caption<br>
	 * - vtt � Web Video Text Tracks caption<br>
	 */
	public void setTfmt(Tfmt tfmt) {
		this.tfmt = tfmt;
	}
	
	/**
	 * The tlang parameter specifies that the API response should return a translation of the specified caption track. The parameter value is an <a href="http://www.loc.gov/standards/iso639-2/php/code_list.php">ISO 639-1 two-letter language code</a> that identifies the desired caption language. The translation is generated by using machine translation, such as Google Translate.<br>
	 */
	public String getTlang() {
		return this.tlang;
	}
	
	/**
	 * The tlang parameter specifies that the API response should return a translation of the specified caption track. The parameter value is an <a href="http://www.loc.gov/standards/iso639-2/php/code_list.php">ISO 639-1 two-letter language code</a> that identifies the desired caption language. The translation is generated by using machine translation, such as Google Translate.<br>
	 * @param tlang
	 */
	public void setTlang(String tlang) {
		this.tlang = tlang;
	}
	
	/** 
	 * - sbv � SubViewer subtitle<br>
	 * - scc � Scenarist Closed Caption format<br>
	 * - srt � SubRip subtitle<br>
	 * - ttml � Timed Text Markup Language caption<br>
	 * - vtt � Web Video Text Tracks caption<br>
	 */
	public enum Tfmt {
		sbv,
		scc,
		srt,
		ttml,
		vtt
	}
}
