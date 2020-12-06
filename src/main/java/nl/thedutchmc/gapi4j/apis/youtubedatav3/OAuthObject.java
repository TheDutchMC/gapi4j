package nl.thedutchmc.gapi4j.apis.youtubedatav3;

import java.util.Arrays;

public class OAuthObject {

	private String authToken;
	private OAuthScope[] enabledScopes;
	
	public OAuthObject(String authToken, OAuthScope... enabledScopes) {
		if(authToken == null || enabledScopes == null) {
			throw new IllegalStateException("authToken and enabledScopes cannot be null");
		}
		
		this.authToken = authToken;
		this.enabledScopes = enabledScopes;
	}
	
	public String getAuthToken() {
		return this.authToken;
	}
	
	public OAuthScope[] getEnabledScopes() {
		return this.enabledScopes;
	}
	
	public boolean isScopeEnabled(OAuthScope scope) {
		return Arrays.asList(enabledScopes).contains(scope);		
	}
	
	public boolean areScopesEnabled(OAuthScope... scopes) {
		return Arrays.asList(enabledScopes).containsAll(Arrays.asList(scopes));
	}
	
	public boolean areSomeScopesEnabled(OAuthScope... scopes) {
		for(OAuthScope scope : scopes) {
			if(Arrays.asList(enabledScopes).contains(scope)) return true;
		}
		
		return false;
	}
	
	public enum OAuthScope {
		
		//YouTube Data API v3
		youtube("https://www.googleapis.com/auth/youtube"),
		youtube_force_ssl("https://www.googleapis.com/auth/youtube.force-ssl"),
		youtube_readonly("https://www.googleapis.com/auth/youtube.readonly"),
		youtube_partner("https://www.googleapis.com/auth/youtubepartner"),
		youtube_channel_membership_creator("https://www.googleapis.com/auth/youtube.channel-memberships.creator"),
		youtube_upload("https://www.googleapis.com/auth/youtube.upload"),
		youtube_partner_channel_audit("https://www.googleapis.com/auth/youtubepartner-channel-audit");
		
		private String scope;
		private OAuthScope(String scope) {
			this.scope = scope;
		}
		
		public String getScope() {
			return this.scope;
		}
	}
}
