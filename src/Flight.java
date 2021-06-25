
public class Flight {
	private String destination;
	private String arrival;
	private String departureTime;
	private String arrivalTime;
	private String flightClass;
	private String departureDate;	
	private String arrivalDate;
	private String seatNo;
	private double price;
	
	public Flight() {
		
	}

	//------Location-----
	public String getDestination() {
		return destination;
	}

	public void setDestination(String location) {
		this.destination = location;
	}
		
	public String getArrival() {
		return arrival;
	}
	
	public void setArrival(String location) {
		this.arrival = location	;
	}
	//------end of location-----

	//------Time-----
	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public String getDepartureDate () {
		return departureDate;
	}
	
	public void setDepartureDate (String departureDate) {
		this.departureDate = departureDate;
	}
	
	public String getArrivalDate () {
		return arrivalDate;
	}
	
	public void setArrivalDate (String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	//------end of time-----
	
	//------Airplane-----
	public String getFlightClass() {
		return flightClass;
	}
	
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	
	public String getSeatNo() {
		return seatNo;
	}
	
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	//------end of Airplane-----
	
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
