# liferay-openid-user-info-processor-override
Explore and demonstrate how to override internal components (which are not meant to be overridden).

## Resources

* [https://liferay.dev/blogs/-/blogs/fixing-module-package-access-modifiers](https://liferay.dev/blogs/-/blogs/fixing-module-package-access-modifiers)

## How It Works

1. Export internal classes from `com.liferay.portal.security.sso.openid.connect.impl` with a fragment bundle
1. Use the exported classes in separate bundle
1. Implement a service with a higher `service.ranking` (`com.chberndt.liferay.portal.security.sso.openid.connect.internal.CustomOpenIdConnectUserInfoProcessorImpl
1. Restart your server  
1. Verify that your custom service is used instead of the default implementation

```bash
g! services com.liferay.portal.security.sso.openid.connect.internal.OpenIdConnectUserInfoProcessor
{com.liferay.portal.security.sso.openid.connect.internal.OpenIdConnectUserInfoProcessor}={service.id=3938, service.bundleid=2009, service.scope=bundle, component.name=com.chberndt.liferay.portal.security.sso.openid.connect.internal.CustomOpenIdConnectUserInfoProcessorImpl, component.id=6820}
  "Registered by bundle:" com.chberndt.liferay.portal.security.sso.openid.connect.internal_1.0.0 [2009]
  "Bundles using service"
    com.liferay.portal.security.sso.openid.connect.impl_5.0.39 [952]
{com.liferay.portal.security.sso.openid.connect.internal.OpenIdConnectUserInfoProcessor}={service.id=6567, service.bundleid=952, service.scope=bundle, component.name=com.liferay.portal.security.sso.openid.connect.internal.OpenIdConnectUserInfoProcessorImpl, component.id=1854}
  "Registered by bundle:" com.liferay.portal.security.sso.openid.connect.impl_5.0.39 [952]
  "No bundles using service."
```

## Contact

christian.berndt@liferay.com
