import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class AirTime{ // uses as single and round trip
	
	private int i = 0;
	private ArrayList<String> availableDepartureTime;
	private ArrayList<String> availableArrivalTime;

	public AirTime(boolean rounded, String depart, String arrival) { 
	
		Random rand = new Random(); //instance for out random class
		int upperbound = 8; // prefer to use loop to display in the GUI
	    int int_random = rand.nextInt(upperbound); 
	    
	    /*user's first input */;			// need help to how to input the user's input from GUI without mention in parameter
	    /*user's second input */;		// need help to how to input the user's input from GUI without mention in parameter
	    
	    do {
	    	String generated = randomDate(depart + "15:22", arrival + "15:22"); 		// "2021062315:22" is our example
	    	availableDepartureTime.add(generated.substring(8, 12));
	    	i++;
	    }while (i <= int_random);
	    
	    i = 0; // resets the i back to 0; to run loop

	    if (rounded) {
	    	do {
			    int hours = Integer.parseInt(availableDepartureTime.get(i).substring(0,1)) + 8;
			    int minutes = Integer.parseInt(availableDepartureTime.get(i).substring(3,4));
			    availableArrivalTime.add(Integer.toString(hours) + ":" + Integer.toString(minutes)); //8 hours of flight time
	    		i++;
	    	}while (i <= int_random);
	    }
	}
	
	private static String randomDate(String beginDate, String endDate) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHH:mm"); // generates the date and time
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

	public ArrayList<String> getDepartureTime(){
		return availableDepartureTime;
	}

	public ArrayList<String> getArrivalTime(){
		return availableArrivalTime;
	}

}
