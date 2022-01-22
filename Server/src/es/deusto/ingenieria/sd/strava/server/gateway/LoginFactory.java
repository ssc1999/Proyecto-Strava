package es.deusto.ingenieria.sd.strava.server.gateway;

import es.deusto.ingenieria.sd.strava.server.data.domain.*;

public class LoginFactory{
	
	public LoginGateway createGateway(Type type) {
		
		switch(type) {
			case GOOGLE:
				return new GoogleService("127.0.0.1", 1099);
				
			case FACEBOOK:
				return new FacebookService("127.0.0.1", 8000);
			default:
				return null;
		}
	}
}
