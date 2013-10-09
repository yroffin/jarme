package controllers;

import models.message.DefaultMessage;

import play.*;
import play.libs.Json;
import play.mvc.*;
import service.application.IJarmeApplication;

import views.html.*;

public class Application extends Controller {
	private static IJarmeApplication JarmeApplication;

	public void setJarmeApplication(IJarmeApplication JarmeApplication) {
		Application.JarmeApplication = JarmeApplication;
	}

	public static Result index() {
		return ok(index.render("Your new application is ready : " + JarmeApplication));
	}

	/**
	 * REST api for sending a message to Jarme
	 * 
	 * @return
	 */
	@BodyParser.Of(BodyParser.TolerantJson.class)
	public static Result send() {
		DefaultMessage msg = (DefaultMessage) extractMessage(DefaultMessage.class);

		if(Logger.isDebugEnabled()) Logger.debug("story: " + msg);

		try {
			return ok("");
		} catch (Exception e) {
			e.printStackTrace();
			return badRequest();
		}
	}

	/**
	 * extract message from body
	 * @param class1 
	 * 
	 * @return
	 */
	public static DefaultMessage extractMessage(Class<DefaultMessage> class1) {
		/**
		 * retrieve json message
		 */
		return Json.fromJson(request().body().asJson(), class1);
	}
}
