package es.deusto.ingenieria.sd.strava.client;

import java.io.IOException;

import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
import es.deusto.ingenieria.sd.strava.client.controller.SessionController;
import es.deusto.ingenieria.sd.strava.client.gui.LoginWindow;
import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

public class MainProgram {

	public static void main(String[] args) throws IOException {	
		ServiceLocator serviceLocator = new ServiceLocator();
		
		//args[0] = RMIRegistry IP
		//args[1] = RMIRegistry Port
		//args[2] = Service Name
		serviceLocator.setService(args[0], args[1], args[2]);
		LoginController loginController = new LoginController(serviceLocator);
		LoginWindow loginWindow = new LoginWindow(loginController);
		
		SessionController sessionController = new SessionController(serviceLocator);			
		//SessionWindow sessionWindow = new SessionWindow(sessionController);
		
		
	}
}