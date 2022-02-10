package com.chberndt.liferay.portal.security.sso.openid.connect.internal;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.security.sso.openid.connect.internal.OpenIdConnectUserInfoProcessor;

import com.nimbusds.openid.connect.sdk.claims.UserInfo;

import org.osgi.service.component.annotations.Component;

/**
 * @author Christian Berndt
 */
@Component(
	immediate = true, property = "service.ranking:Integer=100",
	service = OpenIdConnectUserInfoProcessor.class
)
public class CustomOpenIdConnectUserInfoProcessorImpl
	implements OpenIdConnectUserInfoProcessor {

	@Override
	public long processUserInfo(
			UserInfo userInfo, long companyId, String mainPath,
			String portalURL)
		throws PortalException {

		// TODO Process UserInfo the way you want ..

		return 0;
	}

}