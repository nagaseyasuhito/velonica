package com.github.nagaseyasuhito.velonica.web;

import java.util.List;

import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.cycle.RequestCycle;
import org.openid4java.OpenIDException;
import org.openid4java.consumer.ConsumerManager;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.discovery.DiscoveryInformation;

public class VelonicaSession extends AbstractAuthenticatedWebSession {
	private static final long serialVersionUID = 5367546258248665285L;

	private ConsumerManager consumerManager;

	private DiscoveryInformation discoveryInformation;

	private volatile boolean signedIn;

	public static VelonicaSession get() {
		return (VelonicaSession) AbstractAuthenticatedWebSession.get();
	}

	public VelonicaSession(Request request) throws DiscoveryException {
		super(request);

		this.consumerManager = new ConsumerManager();
		List<?> discoveries = this.consumerManager.discover("https://www.google.com/accounts/o8/id");
		this.discoveryInformation = this.consumerManager.associate(discoveries);
	}

	public final boolean signIn() {
		this.signedIn = this.authenticate();
		if (this.signedIn) {
			this.bind();
		}
		return this.signedIn;
	}

	public boolean authenticate() {
		String returnUrl = RequestCycle.get().urlFor(RequestCycle.get().getActiveRequestHandler()).toString();
		try {
			this.consumerManager.authenticate(this.discoveryInformation, returnUrl);
		} catch (OpenIDException e) {
			return false;
		}

		return true;
	}

	@Override
	public Roles getRoles() {
		return this.isSignedIn() ? new Roles(Roles.USER) : null;
	}

	public void signOut() {
		this.signedIn = false;
	}

	@Override
	public boolean isSignedIn() {
		return this.signedIn;
	}
}
