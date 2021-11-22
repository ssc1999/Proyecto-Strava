package es.deusto.ingenieria.sd.auctions.server.services;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.auctions.server.data.domain.Session;
import es.deusto.ingenieria.sd.auctions.server.data.domain.User;

//TODO: Implement Singleton Pattern
public class SessionService {
	
	//TODO: remove when DAO Pattern is implemented
	private List<Session> sessions = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	
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
		user0.setSessions(sessions);
		
		//Add users to the local cache.
		this.users.add(user0);
		this.users.add(user1);
		//Add sessions to local cache
		this.sessions.add(session0);
	}
	
	
	public List<User> getUsers() {
		//TODO: Get all the categories using DAO Pattern		
		return this.users;
	}

	public List<Session> getSessions(String user) {
		//TODO: Get articles of a category using DAO Pattern
		for (User u : this.users) {
			if (u.getName().equalsIgnoreCase(user)) {
				return u.getSessions();
			}
		}
		return null;
	}

	public boolean addSession(User user, Session session) {
		
		if (session != null) {
			List<Session> tempSessionList = new ArrayList<>();
			tempSessionList = user.getSessions();
			tempSessionList.add(session);
			user.setSessions(tempSessionList);
			//TODO: Save the new bin in the DB using DAO Pattern
			return true;
		} else {
			return false;
		}
	}
}