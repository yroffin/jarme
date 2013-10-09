package service.application.impl;

import play.Logger;

import models.message.DefaultMessage;
import service.application.IJarmeApplication;
import service.business.IJarmeBusiness;
import tools.exception.TechnicalException;

public class JarmeApplicationImpl implements IJarmeApplication {
	private IJarmeBusiness JarmeBusiness;

	public void setJarmeBusiness(IJarmeBusiness JarmeBusiness) {
		this.JarmeBusiness = JarmeBusiness;
	}

	@Override
	public DefaultMessage send(DefaultMessage msg) throws TechnicalException {
		return JarmeBusiness.send(msg);
	}
}
