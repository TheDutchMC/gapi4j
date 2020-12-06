package nl.thedutchmc.gapi4j.apis;

import nl.thedutchmc.gapi4j.apis.youtubedatav3.OAuthObject;

public class RequestParameters {
	
	private RequestPart[] requestParts;
	private String apiKey;
	private OAuthObject oauthObject;
	
	public RequestParameters(RequestPart[] requestParts) {
		this.requestParts = requestParts;
		
		if(requestParts == null) {
			throw new IllegalStateException("RequestPart array may not be null");
		}	
	}
	
	public RequestParameters() {
		
	}
	
	public RequestPart[] getRequestParts() {
		return this.requestParts;
	}
	
	public String getRequestPartsAsString() {
		String result = "";
		for(int i = 0; i < requestParts.length; i++) {
			result += requestParts[i];
			
			if(i != requestParts.length - 1) {
				result += ",";
			}
		}
		
		return result;
	}
	
	public String getApiKey() {
		return this.apiKey;
	}
	
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	
	public OAuthObject getOauthObject() {
		return this.oauthObject;
	}
	
	public void setOauthObject(OAuthObject oauthObject) {
		this.oauthObject = oauthObject;
	}
}
