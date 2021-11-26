package es.deusto.ingenieria.sd.strava.server.data.domain;

import java.util.List;

public class LocalUser extends User{
	
	protected String password;

	public LocalUser(String type, String name, String email, String password, double weight, double height, String birthDate, int freq, int maxFreq,
			int restFreq, List<Session> sessions) {
		super(type, email, name, weight, height, birthDate,freq, maxFreq, restFreq, sessions);
		this.password = password;
	}
	
	public LocalUser() {
		super();
		this.password = "";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean checkPassword(String password) {
		if(this.password.contentEquals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "User [type=" + type + ", email=" + email + "password=" + password + ", name=" + name + ", weight=" + weight + ", height="
				+ height + ", birthDate=" + birthDate + ", freq=" + freq + ", maxFreq=" + maxFreq + ", restFreq=" + restFreq + "]";
	}
		
}
