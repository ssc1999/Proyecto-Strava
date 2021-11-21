package es.deusto.ingenieria.sd.auctions.server.data.domain;

public class LocalUser extends User{
	
	protected String password;

	public LocalUser(String type, String email, String name, double weight, double height, int freq, int maxFreq,
			int restFreq, String password) {
		super(type, email, name, weight, height, freq, maxFreq, restFreq);
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

	@Override
	public String toString() {
		return "User [type=" + type + ", email=" + email + "password=" + password + ", name=" + name + ", weight=" + weight + ", height="
				+ height + ", freq=" + freq + ", maxFreq=" + maxFreq + ", restFreq=" + restFreq + "]";
	}
		
}
