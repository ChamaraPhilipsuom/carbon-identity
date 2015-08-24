package org.wso2.carbon.identity.discovery.builders;


import org.wso2.carbon.base.ServerConfigurationException;
import org.wso2.carbon.identity.discovery.OIDCDiscoveryEndPointException;
import org.wso2.carbon.identity.discovery.OIDProviderConfigResponse;
import org.wso2.carbon.identity.discovery.OIDProviderRequest;
import org.wso2.carbon.identity.oauth2.util.OAuth2Util;

public class ProviderConfigBuilder {

    public OIDProviderConfigResponse buildOIDProviderConfig(OIDProviderRequest request) throws
            OIDCDiscoveryEndPointException, ServerConfigurationException {
        OIDProviderConfigResponse providerConfig = new OIDProviderConfigResponse();
        providerConfig.setAuthorization_endpoint(OAuth2Util.OAuthURL.getOAuth2AuthzEPUrl());
        providerConfig.setToken_endpoint(OAuth2Util.OAuthURL.getOAuth2TokenEPUrl());
        providerConfig.setUserinfo_endpoint(OAuth2Util.OAuthURL.getOAuth2UserInfoEPUrl());
        return providerConfig;
    }

}
