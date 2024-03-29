package es.deusto.ingenieria.sd.strava.server.data.domain;

import java.util.List;

public class User {
	protected String type;
	protected String email;
	protected String name;
	protected double weight;
	protected double height;
	protected String birthDate;
	protected int freq;
	protected int maxFreq;
	protected int restFreq;
	protected List<Session> listSessions;

	public User(String type, String email, String name, double weight, double height, String birthDate, int freq, int maxFreq,
			int restFreq, List<Session> listSessions) {
		super();
		this.type = type;
		this.email = email;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.birthDate = birthDate;
		this.freq = freq;
		this.maxFreq = maxFreq;
		this.restFreq = restFreq;
		this.listSessions = listSessions;
	}
	
	public User() {
		super();
		this.type = "";
		this.email = "";
		this.name = "";
		this.weight = 0.00;
		this.height = 0.00;
		this.birthDate = "";
		this.freq = 0;
		this.maxFreq = 0;
		this.restFreq = 0;
		this.listSessions = null;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public int getMaxFreq() {
		return maxFreq;
	}

	public void setMaxFreq(int maxFreq) {
		this.maxFreq = maxFreq;
	}

	public int getRestFreq() {
		return restFreq;
	}

	public void setRestFreq(int restFreq) {
		this.restFreq = restFreq;
	}
	
	public List<Session> getListSessions() {
		return listSessions;
	}

	public void setListSessions(List<Session> listSessions) {
		this.listSessions = listSessions;
	}
	
	@Override
	public String toString() {
		return "User [type=" + type + ", email=" + email + ", name=" + name + ", weight=" + weight + ", height="
				+ height + ", birthDate=" + birthDate + ", freq=" + freq + ", maxFreq=" + maxFreq + ", restFreq="
				+ restFreq + ", listSessions=" + listSessions + "]";
	}
	
}