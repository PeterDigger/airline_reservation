public class Flight {

	String flightID;
	time time;
	Location location;
	Airplane airplane;
	Seat seat;
	String flightStatus;
	double price;
	
	public Flight() {
		
	}
	
	public String getFlightID() {
		return flightID;
	}
	
	public time getTime() {
		return time;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Airplane getAirplane() {
		return airplane;
	}
	
	public Seat getSeatNo() {
		return seat;
	}
	
	public String getFlightStatus() {
		return flightStatus;
	}
	
	public double getPrice() {
		return price;
	}
}
