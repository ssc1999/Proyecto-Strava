package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.dto.SessionDTO;

public class SessionController {

	private ServiceLocator serviceLocator;
	
	public SessionController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public List<SessionDTO> getListSessions(long token){
		try {
			return this.serviceLocator.getService().getListSessions(token);
		}catch(RemoteException e) {
			System.out.println("Error getting list Sessions");
			return null;
		}
	}
	
	public SessionDTO getSession(long token, int id) {
		try {
			return this.serviceLocator.getService().getSession(token, id);
		}catch(RemoteException e) {
			return null;
		}
	}
	
	public boolean addSession(long token, SessionDTO sessionDTO){ {
		
			try {
				if(this.serviceLocator.getService().addSession(token, sessionDTO)) {
					return true;
				}
				return false;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				return false;
			}
	}

	}
}
