package nl.thedutchmc.gapi4j.apis.youtubedatav3.activities;

import java.time.LocalDateTime;

import nl.thedutchmc.gapi4j.apis.RequestParameters;
import nl.thedutchmc.gapi4j.apis.RequestPart;

public class ListParameters extends RequestParameters {
	
	private String channelId, pageToken, nextPageToken, prevPageToken, regionCode;
	private LocalDateTime publishedAfter, publishedBefore;
	private boolean mine = false;
	private int maxResults = 5;
	
	/**
	 * The part parameter specifies a comma-separated list of one or more activity resource properties that the API response will include. <br>
	 * <br>
	 * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in an activity resource, the snippet property contains other properties that identify the type of activity, a display title for the activity, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.<br>
	 * <br>
	 * The following list contains the part names that you can include in the parameter value:<br>
	 * - contentDetails<br>
     * - id<br>
	 * - snippet<br>
	 * @param parts Supported: contentDetails, id, snippet
	 */
	public ListParameters(RequestPart... parts) {
		super(parts);		
	}
	
	/**
	 * The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities.
	 */
	public String getChannelId() {
		return this.channelId;
	}
	
	/**
	 * The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities.
	 * @param channelId
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
	 * The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The value is specified in <a href="https://www.w3.org/TR/NOTE-datetime">ISO 8601</a> (YYYY-MM-DDThh:mm:ss.sZ) format.
	 */
	public LocalDateTime getPublishedAfter() {
		return this.publishedAfter;
	}
	
	/**
	 * The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The value is specified in <a href="https://www.w3.org/TR/NOTE-datetime">ISO 8601</a> (YYYY-MM-DDThh:mm:ss.sZ) format.
	 * @param publishedAfter
	 */
	public void setPublishedAfter(LocalDateTime publishedAfter) {
		this.publishedAfter = publishedAfter;
	}
	
	/**
	 * The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The value is specified in <a href="https://www.w3.org/TR/NOTE-datetime">ISO 8601</a> (YYYY-MM-DDThh:mm:ss.sZ) format.
	 */
	public LocalDateTime getPublishedBefore() {
		return this.publishedBefore;
	}
	
	/**
	 * The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The value is specified in <a href="https://www.w3.org/TR/NOTE-datetime">ISO 8601</a> (YYYY-MM-DDThh:mm:ss.sZ) format.
	 * @param publishedBefore
	 */
	public void setPublishedBefore(LocalDateTime publishedBefore) {
		this.publishedBefore = publishedBefore;
	}
	
	/**
	 * The regionCode parameter instructs the API to return results for the specified country. The parameter value is an <a href="http://www.iso.org/iso/country_codes/iso_3166_code_lists/country_names_and_code_elements.htm">ISO 3166-1 alpha-2</a> country code. YouTube uses this value when the authorized user's previous activity on YouTube does not provide enough information to generate the activity feed.
	 */
	public String getRegionCode() {
		return this.regionCode;
	}
	
	/**
	 * The regionCode parameter instructs the API to return results for the specified country. The parameter value is an <a href="http://www.iso.org/iso/country_codes/iso_3166_code_lists/country_names_and_code_elements.htm">ISO 3166-1 alpha-2</a> country code. YouTube uses this value when the authorized user's previous activity on YouTube does not provide enough information to generate the activity feed.
	 * @param regionCode
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Set this parameter's value to true to retrieve a feed of the authenticated user's activities.
	 */
	public boolean getMine() {
		return this.mine;
	}
	
	/**
	 * This parameter can only be used in a properly <a href="https://developers.google.com/youtube/v3/guides/authentication">authorized request</a>. Set this parameter's value to true to retrieve a feed of the authenticated user's activities.
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
}
