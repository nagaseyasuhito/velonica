package com.github.nagaseyasuhito.velonica.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.IRequestCycle;
import org.apache.wicket.request.IRequestHandler;

import com.github.nagaseyasuhito.velonica.web.VelonicaSession;

public class SignInPage extends WebPage implements IRequestHandler {
	private static final long serialVersionUID = 1L;

	public SignInPage() {
		this.add(new Link<Void>("signIn") {
			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				VelonicaSession.get().authenticate(this);
			}
		});
	}

	@Override
	public void respond(IRequestCycle requestCycle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void detach(IRequestCycle requestCycle) {
		// TODO Auto-generated method stub

	}
}
