package com.github.nagaseyasuhito.velonica.web;

import org.apache.wicket.Page;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.markup.html.WebPage;

import com.github.nagaseyasuhito.velonica.web.page.IndexPage;
import com.github.nagaseyasuhito.velonica.web.page.SignInPage;

public class VelonicaWebApplication extends AuthenticatedWebApplication {

	@Override
	protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() {
		return VelonicaSession.class;
	}

	@Override
	protected Class<? extends WebPage> getSignInPageClass() {
		return SignInPage.class;
	}

	@Override
	public Class<? extends Page> getHomePage() {
		return IndexPage.class;
	}
}
