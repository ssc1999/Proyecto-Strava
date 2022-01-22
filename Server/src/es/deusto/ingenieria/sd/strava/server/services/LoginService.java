package es.deusto.ingenieria.sd.strava.server.services;

import es.deusto.ingenieria.sd.strava.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.strava.server.data.domain.User;

//TODO: Implement Singleton Pattern
public class LoginService {
		
	public User login(String type, String email, String password) {
		
		if(type == "local") {
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
		}else {
			return null;
		}
	}
	

	public boolean register(String type, String name, String email, String password, double weight, double height, String birthdate, int freq, int maxFreq, int restFreq){
	
		LocalUser user = new LocalUser(type, name, email, password, weight, height, birthdate, freq, maxFreq, restFreq, null);
		
		if( user.getEmail() == type && user.getPassword() == password){
			return true;
		}
		return false;
	}

	
	
}