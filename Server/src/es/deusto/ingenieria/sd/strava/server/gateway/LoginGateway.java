package es.deusto.ingenieria.sd.strava.server.gateway;

import es.deusto.ingenieria.sd.strava.server.data.domain.Type;

public abstract class LoginGateway {
	
	public Type type;
	public abstract boolean checkUser(String email);
	public abstract boolean checkPassword(String password);
	
}
