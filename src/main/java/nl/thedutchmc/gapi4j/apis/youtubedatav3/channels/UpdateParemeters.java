package nl.thedutchmc.gapi4j.apis.youtubedatav3.channels;

import nl.thedutchmc.gapi4j.apis.RequestParameters;
import nl.thedutchmc.gapi4j.apis.RequestPart;

public class UpdateParemeters extends RequestParameters {

	private String onBehalfOfContentOwner, requestBody;
	
	/**
	 * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.<br>
	 * <br>
	 * The API currently only allows the parameter value to be set to either brandingSettings, invideoPromotion, or localizations. (You can only update any one of those parts with a single request.)<br>
	 * <br>
	 * Note that this method overrides the existing values for all of the mutable properties that are contained in the part that the parameter value specifies.<br>
	 * @param part Supported: brandingSettings, invideoPromotion, localizations
	 */
	public UpdateParemeters(RequestPart part) {
		super(new RequestPart[] {part});
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
	 * Provide a <a href="https://developers.google.com/youtube/v3/docs/captions#resource">caption resource</a> in the request body. For that resource:<br>
	 *<br>
	 * You must specify a value for these properties:<br>
 	 * - id<br>
	 * You can set values for these properties:<br>
 	 * - brandingSettings.channel.country<br>
	 * - brandingSettings.channel.description<br>
	 * - brandingSettings.channel.defaultLanguage<br>
	 * - brandingSettings.channel.defaultTab<br>
	 * - brandingSettings.channel.featuredChannelsTitle<br>
	 * - brandingSettings.channel.featuredChannelsUrls[]<br>
	 * - brandingSettings.channel.keywords<br>
	 * - brandingSettings.channel.moderateComments<br>
	 * - brandingSettings.channel.profileColor<br>
	 * - brandingSettings.channel.showRelatedChannels<br>
	 * - brandingSettings.channel.showBrowseView<br>
	 * - brandingSettings.channel.trackingAnalyticsAccountId<br>
	 * - brandingSettings.channel.unsubscribedTrailer<br>
	 * - brandingSettings.image.bannerExternalUrl<br>
	 * - brandingSettings.image.trackingImageUrl<br>
	 * - brandingSettings.image.watchIconImageUrl<br>
	 * - invideoPromotion.position.type (deprecated)<br>
	 * - invideoPromotion.position.cornerPosition (deprecated)<br>
	 * - invideoPromotion.defaultTiming.type (deprecated)<br>
	 * - invideoPromotion.defaultTiming.offsetMs (deprecated)<br>
	 * - invideoPromotion.items[].id.type (deprecated)<br>
	 * - invideoPromotion.items[].id.videoId (deprecated)<br>
	 * - invideoPromotion.items[].id.websiteUrl (deprecated)<br>
	 * - invideoPromotion.items[].timing.type (deprecated)<br>
	 * - invideoPromotion.items[].timing.offsetMs (deprecated)<br>
	 * - invideoPromotion.items[].customMessage (deprecated)<br>
	 * - invideoPromotion.items[].promotedByContentOwner (deprecated)<br>
	 * - localizations.(key)<br>
	 * - localizations.(key).title<br>
	 * - localizations.(key).description<br>
	 * - status.selfDeclaredMadeForKids<br>
	 * If you are submitting an update request, and your request does not specify a value for a property that already has a value, the property's existing value will be deleted.<br>
	 * 
	 */
	public String getRequestBody() {
		return this.requestBody;
	}
	
	/**
	 * Provide a <a href="https://developers.google.com/youtube/v3/docs/captions#resource">caption resource</a> in the request body. For that resource:<br>
	 *<br>
	 * You must specify a value for these properties:<br>
 	 * - id<br>
	 * You can set values for these properties:<br>
 	 * - brandingSettings.channel.country<br>
	 * - brandingSettings.channel.description<br>
	 * - brandingSettings.channel.defaultLanguage<br>
	 * - brandingSettings.channel.defaultTab<br>
	 * - brandingSettings.channel.featuredChannelsTitle<br>
	 * - brandingSettings.channel.featuredChannelsUrls[]<br>
	 * - brandingSettings.channel.keywords<br>
	 * - brandingSettings.channel.moderateComments<br>
	 * - brandingSettings.channel.profileColor<br>
	 * - brandingSettings.channel.showRelatedChannels<br>
	 * - brandingSettings.channel.showBrowseView<br>
	 * - brandingSettings.channel.trackingAnalyticsAccountId<br>
	 * - brandingSettings.channel.unsubscribedTrailer<br>
	 * - brandingSettings.image.bannerExternalUrl<br>
	 * - brandingSettings.image.trackingImageUrl<br>
	 * - brandingSettings.image.watchIconImageUrl<br>
	 * - invideoPromotion.position.type (deprecated)<br>
	 * - invideoPromotion.position.cornerPosition (deprecated)<br>
	 * - invideoPromotion.defaultTiming.type (deprecated)<br>
	 * - invideoPromotion.defaultTiming.offsetMs (deprecated)<br>
	 * - invideoPromotion.items[].id.type (deprecated)<br>
	 * - invideoPromotion.items[].id.videoId (deprecated)<br>
	 * - invideoPromotion.items[].id.websiteUrl (deprecated)<br>
	 * - invideoPromotion.items[].timing.type (deprecated)<br>
	 * - invideoPromotion.items[].timing.offsetMs (deprecated)<br>
	 * - invideoPromotion.items[].customMessage (deprecated)<br>
	 * - invideoPromotion.items[].promotedByContentOwner (deprecated)<br>
	 * - localizations.(key)<br>
	 * - localizations.(key).title<br>
	 * - localizations.(key).description<br>
	 * - status.selfDeclaredMadeForKids<br>
	 * If you are submitting an update request, and your request does not specify a value for a property that already has a value, the property's existing value will be deleted.<br>
	 * @param requestBody
	 */
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
}
