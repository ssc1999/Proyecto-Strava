package es.deusto.ingenieria.sd.auctions.server.services;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.deusto.ingenieria.sd.auctions.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.auctions.server.data.domain.Session;
import es.deusto.ingenieria.sd.auctions.server.data.domain.User;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserAssembler;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;
import es.deusto.ingenieria.sd.auctions.server.remote.RemoteFacade;

//TODO: Implement Singleton Pattern
public class SessionService {
	//TODO: remove when DAO Pattern is implemented
	private List<Session> sessions = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	private RemoteFacade remoteFacade;
	
	public SessionService() {
		//TODO: remove when DAO Pattern is implemented
		this.initilizeData();
	}
	
	//TODO: remove when DAO Pattern is implemented
	private void initilizeData() {
		//Create Users
		LocalUser user0 = new LocalUser();
		user0.setEmail("thomas.e2001@gmail.com");
		user0.setName("Thomas");
		user0.setPassword("$!9PhNz,");
		
		User user1 = new User();
		user1.setEmail("sample@gmail.com");
		user1.setName("buyer33");		
		user1.setWeight(80);
		user1.setHeight(180);
								
		//Create Sessions				
		Session session0 = new Session();
		session0.setTittle("d");
		session0.setSport(null);
		session0.setDistance(0);
		session0.setiDate(null);
		session0.setiHour(null);
		session0.setDuration(null);
		
		sessions.add(session0);
		user0.setListSessions(sessions);
		
		//Add users to the local cache.
		this.users.add(user0);
		this.users.add(user1);
		//Add sessions to local cache
		this.sessions.add(session0);
	}

	public Session getSession(long token, int id) {
		if(token != 0) {
			List<Session> sessions = getListSessions(token);
			for (Session session : sessions) {
				if(session.getId() == id) {
					return session;
				}
			}
		}else {
			new RemoteException("You are not logged in!");
			return null;
		}
		return null;
	}
	
	public List<Session> getListSessions(long token) {
		//TODO: Get articles of a category using DAO Pattern
		if (token != 0) {
			UserDTO userDTO = remoteFacade.getUser(token);
			User user = UserAssembler.getInstance().userDTOToUser(userDTO);
			List<Session> listSessions = user.getListSessions();
			return listSessions;
		}
		new RemoteException("You are not logged in!");
		return null;
		
	}

	public boolean addSession(long token, Session session) {
		if (session != null) {
			if (token != 0) {
				UserDTO userDTO = remoteFacade.getUser(token);
				User user = UserAssembler.getInstance().userDTOToUser(userDTO);
				List<Session> tempSessionList = user.getListSessions();
				tempSessionList.add(session);
				user.setListSessions(tempSessionList);
				return true;
			}
			new RemoteException("You are not logged in!");
			return false;
		}
		new RemoteException("The session doesnt exist!");
		return false;
	}
}