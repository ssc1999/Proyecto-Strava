package es.deusto.ingenieria.sd.strava.server.test;

import java.util.List;

import es.deusto.ingenieria.sd.strava.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.strava.server.data.dto.SessionDTO;
import es.deusto.ingenieria.sd.strava.server.data.dto.UserDTO;
import es.deusto.ingenieria.sd.strava.server.remote.RemoteFacade;

public class LocalTest {

	@SuppressWarnings({ "unchecked", "null" })
	public static void main(String[] args) {		
		RemoteFacade facade = null;
		SessionDTO session = null;
		List<SessionDTO> sessions= null;
		UserDTO user = null;
		LocalUser localUser = null;
		long token = 0l;
		
		try {
			facade = new RemoteFacade();
			
			//Get Sessions of a User
			sessions = facade.getListSessions(token);
			session = sessions.get(0);
			
			for (SessionDTO s : sessions) {
				System.out.println("\t- " + s);
			}								
		} catch (Exception e) {			
			System.out.println("\t# Error: " + e.getMessage());
		} 
		
		try {
			//Login
			String sha1 = org.apache.commons.codec.digest.DigestUtils.sha1Hex("$!9PhNz,");
			token = facade.login("google", "thomas.e2001@gmail.com", sha1);			
			//Register
			facade.register(localUser);
			//Logout
			facade.logout(token);
			//Get sessions to check if they have been created
			session = facade.getSession(token, session.getId());
			sessions = facade.getListSessions(token);
			System.out.println("\t- " + session);
			//Get user
			user = facade.getUser(token);
			
		} catch (Exception e) {
			System.out.println("\t# Error: " + e.getMessage());	
		}

		//Force exit to stop RMI Server
		System.exit(0);
	}
}