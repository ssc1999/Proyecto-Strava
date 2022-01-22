package es.deusto.ingenieria.sd.strava.server.gateway;

import java.rmi.Naming;
import java.rmi.RemoteException;

import es.deusto.ingenieria.sd.strava.google.remote.ILoginGoogleGateway;
import es.deusto.ingenieria.sd.strava.server.data.domain.Type;

public class GoogleService extends LoginGateway{
	
	private ILoginGoogleGateway service;
	private String serverIP;
	private int serverPort;
	
	public GoogleService (String servIP, int servPort) {
		serverIP = servIP;
		serverPort = servPort;
		super.type = Type.GOOGLE;
	}
	
	public void setService(String ip, String port, String serviceName) {
		//Activate Security Manager. It is needed for RMI.
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		
		//Get Remote Facade reference using RMIRegistry (IP + Port) and the service name.
		try {		
			String URL = "//" + ip + ":" + port + "/" + serviceName;
			this.service = (ILoginGoogleGateway) Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote facade: " + ex);
		}		
	}

	public ILoginGoogleGateway getService() {
		return this.service;
	}
	
	@Override
	public boolean checkUser(String mail) {
		GoogleService service = new GoogleService(serverIP, serverPort);
		service.setService(serverIP, Integer.toString(serverPort), "google");
		boolean login;
		try {
			login = service.getService().checkUser(mail);
			if(login) {
				return true;
			} else {
				return false;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean checkPassword(String password) {
		GoogleService service = new GoogleService(serverIP, serverPort);
		service.setService(serverIP, Integer.toString(serverPort), "google");
		boolean login;
		try {
			login = service.getService().checkUser(password);
			if(login) {
				return true;
			} else {
				return false;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
