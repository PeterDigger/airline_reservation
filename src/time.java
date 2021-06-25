import java.text.SimpleDateFormat;
import java.util.Date;

public class time{ // uses as single and round trip
	
	private String availableDepartureTime;
	private String availableArrivalTime;

	public time(boolean rounded) { 
	
	    String generated = randomDate("00:01", "23:59"); 		// "2021062315:22" is our example
	    availableDepartureTime = generated;
	    
	    int hours = Integer.parseInt(availableDepartureTime.substring(0,1)) + 8;
	    int minutes = Integer.parseInt(availableDepartureTime.substring(3,4));
		availableArrivalTime = Integer.toString(hours) + ":" + Integer.toString(minutes); //8 hours of flight time
	}
	
	private static String randomDate(String beginDate, String endDate) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("HH:mm"); // generates the date and time
			Date start = format.parse (beginDate); // start date configuration
			Date end = format.parse (endDate); // End date configuration
			if (start.getTime() >= end.getTime()) {
				return null;
			}
			long date = random(start.getTime(), end.getTime());
			return format.format(new Date(date));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static long random(long begin, long end) {
		long rtn = begin + (long) (Math.random() * (end - begin));
		// If the return is the start time and end time, the recursive call this function to find a random value
		if (rtn == begin || rtn == end) {
			return random(begin, end);
		}
		return rtn;
	}

	public String getDepartureTime(){
		return availableDepartureTime;
	}

	public String getArrivalTime(){
		return availableArrivalTime;
	}

}
