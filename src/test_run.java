import java.text.SimpleDateFormat;
import java.util.Date;

public class test_run {
	// Returns a random date of 20150101-20151231
	public static void main(String[] args) {
		String randomDate = randomDate("2021062315:22", "2022062315:22");
		System.out.println(randomDate);
	}

	/**
	 * Get a random date
	 * 
	 * @param beginDate
	 * Start date in the format: yyyyMMdd
	 * @param endDate
	 * End date in the format: yyyyMMdd
	 * @return
	 */

	private static String randomDate(String beginDate, String endDate) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHH:mm");
			Date start = format.parse (beginDate); // start date configuration
			Date end = format.parse (endDate); // End date configuration
			// getTime () which returns the number of milliseconds since January 1, 1970 00:00:00 GMT represented by this Date object.
			if (start.getTime() >= end.getTime()) {
				return null;
			}
			long date = random(start.getTime(), end.getTime()) ;
			return format.format(new Date(date)) ;
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

}