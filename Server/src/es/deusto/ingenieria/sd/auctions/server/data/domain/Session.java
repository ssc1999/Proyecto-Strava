package es.deusto.ingenieria.sd.auctions.server.data.domain;

public class Session {

	public static int count = 1;

	private int id;
	private String tittle;
	private String sport;
	private double distance;
	private String iDate;
	private String iHour;
	private String duration;

	public Session(String tittle, String sport, double distance, String iDate, String iHour, String duration) {
		super();
		this.id = count;
		count++;
		this.tittle = tittle;
		this.sport = sport;
		this.distance = distance;
		this.iDate = iDate;
		this.iHour = iHour;
		this.duration = duration;
	}

	public Session() {
		super();
		this.id = count;
		count++;
		this.tittle = "";
		this.sport = "";
		this.distance = 0.00;
		this.iDate = "";
		this.iHour = "";
		this.duration = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getiDate() {
		return iDate;
	}

	public void setiDate(String iDate) {
		this.iDate = iDate;
	}

	public String getiHour() {
		return iHour;
	}

	public void setiHour(String iHour) {
		this.iHour = iHour;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Session [id=" + id + ", tittle=" + tittle + ", sport=" + sport + ", distance=" + distance + ", iDate="
				+ iDate + ", iHour=" + iHour + ", duration=" + duration + "]";
	}
	
}
