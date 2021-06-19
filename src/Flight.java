import java.sql.Time;

public class Flight {

	String flightID;
	Time time;
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
	
	public Time getTime() {
		return time;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Airplane getAirplane() {
		return airplane;
	}
	
	public Seat getSeat() {
		return seat;
	}
	
	public String getFlightStatus() {
		return flightStatus;
	}
	
	public double getPrice() {
		return price;
	}
}
