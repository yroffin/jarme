package service.business.impl;

import java.io.IOException;

import models.message.DefaultMessage;

import service.business.IJarmeBusiness;

public class JarmeBusinessImpl implements IJarmeBusiness {

	public JarmeBusinessImpl() {
		/**
		 * Jarme system
		 */
	}

	@Override
	public DefaultMessage send(DefaultMessage msg) {
		DefaultMessage result = new DefaultMessage();
		return result;
	}
}
