package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.domain.Session;
import es.deusto.ingenieria.sd.auctions.server.data.dto.SessionDTO;

public class SessionController {

	private ServiceLocator serviceLocator;
	private Session session;
	public SessionController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public List<SessionDTO> getSessions(long token){
		try {
			return this.serviceLocator.getService().getSessions();
		}catch(RemoteException e) {
			System.out.println("Error getting list Sessions");
			return null;
		}
	}
	
	public SessionDTO getSession(long token, int id) {
		try {
			
		}catch(RemoteException e) {
			
		}
	}
	
	public boolean addSession(int id, String tittle, String sport, double distance, String iDate, String iHour, String duration){ {
		try {
			
			this.session = this.serviceLocator.getSession(id, tittle, sport, distance, iDate, iHour, duration);	
			return true;
			
		}catch(RemoteException e) {
			System.out.println("# Error creating the session" + e);
			return false;
		}
	}

}
}
