package es.deusto.ingenieria.sd.auctions.client;

import java.io.IOException;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.client.controller.SessionController;
import es.deusto.ingenieria.sd.auctions.client.gui.LoginWindow;
import es.deusto.ingenieria.sd.auctions.client.gui.SessionWindow;
import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.dto.SessionDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class MainProgram {

	public static void main(String[] args) throws IOException {	
		ServiceLocator serviceLocator = new ServiceLocator();
		
		//args[0] = RMIRegistry IP
		//args[1] = RMIRegistry Port
		//args[2] = Service Name
		serviceLocator.setService(args[0], args[1], args[2]);
		
		
		LoginController loginController = new LoginController(serviceLocator);
		SessionController sessionController = new SessionController(serviceLocator);			
		//SessionWindow sessionWindow = new SessionWindow(sessionController);
		LoginWindow loginWindow = new LoginWindow(loginController);
		
	}
}