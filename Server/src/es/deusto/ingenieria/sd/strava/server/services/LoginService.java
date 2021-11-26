package es.deusto.ingenieria.sd.strava.server.services;

import es.deusto.ingenieria.sd.strava.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.strava.server.data.domain.User;

//TODO: Implement Singleton Pattern
public class LoginService {
		
	public User login(String type, String email, String password) {
		//TODO: Get User using DAO and check 		
		LocalUser user = new LocalUser();		
		user.setEmail("thomas.e2001@gmail.com");		
		//Generate the hash of the password
		String sha1 = org.apache.commons.codec.digest.DigestUtils.sha1Hex("$!9PhNz,");		
		user.setPassword(sha1);
		
		if (user.getEmail().equals(email) && user.checkPassword(password)) {		
			return user;
		} else {
			return null;
		}
	}
	
	public boolean register(LocalUser localUser) {
		
		LocalUser user = localUser;
		if(user.getEmail() == localUser.getEmail()) {
			return true;
		}else {
			System.out.println("Error registering the user!s");
			return false;
		}
		
	}
	
}