package es.deusto.ingenieria.sd.auctions.server.services;

import es.deusto.ingenieria.sd.auctions.server.data.domain.LocalUser;
import es.deusto.ingenieria.sd.auctions.server.data.domain.User;

//TODO: Implement Singleton Pattern
public class LoginService {
		
	public long login(String type, String email, String password) {
		//TODO: Get User using DAO and check 		
		LocalUser user = new LocalUser();
		user.setEmail("thomas.e2001@gmail.com");
		user.setPassword("1234");
		//Generate the hash of the password
		long token = System.currentTimeMillis();		
		
		if (user.getEmail().equals(email) && user.checkPassword(password)) {		
			return token;
		} else {
			return 0;
		}
	}
}