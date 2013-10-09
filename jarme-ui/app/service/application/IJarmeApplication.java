package service.application;

import tools.exception.TechnicalException;
import models.message.DefaultMessage;

public interface IJarmeApplication {

	DefaultMessage send(DefaultMessage msg) throws TechnicalException;

}
