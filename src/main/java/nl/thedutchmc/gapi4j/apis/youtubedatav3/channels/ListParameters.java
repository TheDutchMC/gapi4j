package nl.thedutchmc.gapi4j.apis.youtubedatav3.channels;

import nl.thedutchmc.gapi4j.apis.RequestParameters;
import nl.thedutchmc.gapi4j.apis.RequestPart;

public class ListParameters extends RequestParameters{

	private String forUsername, id, hl, onBehalfOfContentOwner, pageToken, nextPageToken, prevPageToken;
	private boolean managedByMe, mine;
	private int maxResults = 5;
	
	/**
	 * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set part=contentDetails, the API response will also contain all of those nested properties. <br>
     * <br>
	 * The following list contains the part names that you can include in the parameter value:<br>
	 * - auditDetails<br>
	 * - brandingSettings<br>
	 * - contentDetails<br>
	 * - contentOwnerDetails<br>
	 * - id<br>
	 * - localizations<br>
	 * - snippet<br>
	 * - statistics<br>
	 * - status<br>
	 * - topicDetails<br>
	 * @param parts Supported: auditDetails, brandingSettings, contentDetails, contentOwnerDetails, id, localizations, snippet, statistics, status, topicDetails
	 */
	public ListParameters(RequestPart[] parts) {
		super(parts);
	}
	
	/**
	 * The forUsername parameter specifies a YouTube username, thereby requesting the channel associated with that username.<br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #getId()}<br>
	 * - {@link #getManagedByMe()}<br>
	 * - {@link #getMine()}<br>
	 */
	public String getForUsername() {
		return this.forUsername;
	}
	
	/**
	 * The forUsername parameter specifies a YouTube username, thereby requesting the channel associated with that username. <br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #setId()}<br>
	 * - {@link #setManagedByMe()}<br>
	 * - {@link #setMine()}<br>
	 * @param forUsername
	 */
	public void setForUsername(String forUsername) {
		this.forUsername = forUsername;
	}
	
	/**
	 * The id parameter specifies a comma-separated list of the YouTube channel ID(s) for the resource(s) that are being retrieved. In a channel resource, the id property specifies the channel's YouTube channel ID.<br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #getForUsername()}<br>
	 * - {@link #getManagedByMe()}<br>
	 * - {@link #getMine()}<br>
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * The id parameter specifies a comma-separated list of the YouTube channel ID(s) for the resource(s) that are being retrieved. In a channel resource, the id property specifies the channel's YouTube channel ID.<br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #setForUsername(String)}<br>
	 * - {@link #setManagedByMe(boolean)}<br>
	 * - {@link #setMine(boolean)}<br>
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	//TODO Update javadoc link once method is written (i18nLanguages.list)
	//See https://developers.google.com/youtube/v3/docs/channels/list
	
	/**
	 * The hl parameter instructs the API to retrieve localized resource metadata for a specific <a href="https://developers.google.com/youtube/v3/docs/i18nLanguages">application language that the YouTube website supports</a>. The parameter value must be a language code included in the list returned by the i18nLanguages.list method.
	 * 
	 * If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
	 * 
	 */
	public String getHl() {
		return this.hl;
	}
	
	//TODO Update javadoc link once method is written (i18nLanguages.list)
	//See https://developers.google.com/youtube/v3/docs/channels/list
	
	/**
	 * The hl parameter instructs the API to retrieve localized resource metadata for a specific <a href="https://developers.google.com/youtube/v3/docs/i18nLanguages">application language that the YouTube website supports</a>. The parameter value must be a language code included in the list returned by the i18nLanguages.list method.
	 * 
	 * If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
	 * @param hl
	 */
	public void setHl(String hl) {
		this.hl = hl;
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
	 * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
	 */
	public String getPageToken() {
		return this.pageToken;
	}
	
	/**
	 * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
	 * @param pageToken
	 */
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	
	/**
	 * {@link #getPageToken()}
	 * 
	 */
	public String getNextPageToken() {
		return this.nextPageToken;
	}
	
	/**
	 * {@link #setPageToken()}
	 * @param nextPageToken
	 */
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
	
	/**
	 * {@link #getPageToken()}
	 * 
	 */
	public String getPrevPageToken() {
		return this.prevPageToken;
	}
	
	/**
	 * {@link #setPageToken()}
	 * @param prevPageToken
	 */
	public void setPrevPageToken(String prevPageToken) {
		this.prevPageToken = prevPageToken;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Set this parameter's value to true to retrieve a feed of the authenticated user's activities.<br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #getForUsername(String)}<br>
	 * - {@link #getManagedByMe(boolean)}<br>
	 * - {@link #getId(String)}<br>
	 */
	public boolean getMine() {
		return this.mine;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Set this parameter's value to true to retrieve a feed of the authenticated user's activities.<br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #setForUsername(String)}<br>
	 * - {@link #setManagedByMe(boolean)}<br>
	 * - {@link #setId(String)}<br>
	 * @param mine
	 */
	public void setMine(boolean mine) {
		this.mine = mine;
	}
	
	/**
	 * The maxResults parameter specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
	 */
	public int getMaxResults() {
		return this.maxResults;
	}
	
	/**
	 * The maxResults parameter specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
	 * @param maxResults
	 * @throws IndexOutOfBoundsException Thrown when maxResults is negative or larger than 50eeee
	 */
	public void setMaxResults(int maxResults) throws IndexOutOfBoundsException {
		if(maxResults < 0 || maxResults > 50) {
			throw new IndexOutOfBoundsException("maxResults must be in range 0-50 inclusive.");
		}
		
		this.maxResults = maxResults;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Note: This parameter is intended exclusively for YouTube content partners. <br>
	 * <br>
	 * Set this parameter's value to true to instruct the API to only return channels managed by the content owner that the onBehalfOfContentOwner parameter specifies. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.<br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #getForUsername(String)}<br>
	 * - {@link #getId(String)}<br>
	 * - {@link #getMine(boolean)}<br>
	 */
	public boolean getManagedByMe() {
		return this.managedByMe;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Note: This parameter is intended exclusively for YouTube content partners. <br>
	 * <br>
	 * Set this parameter's value to true to instruct the API to only return channels managed by the content owner that the onBehalfOfContentOwner parameter specifies. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.<br>
	 * <br>
	 * Cannot be used alongside:<br>
	 * - {@link #setForUsername(String)}<br>
	 * - {@link #setId(String)}<br>
	 * - {@link #setMine(boolean)}<br>
	 */
	public void setManagedByMe(boolean managedByMe) {
		this.managedByMe = managedByMe;
	}
}
