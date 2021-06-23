import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Seat {
	
	private String seatPosition;
	private ArrayList<String> reservedSeat;
	
	public Seat(String date, String Flight){	

		try (Scanner ough = new Scanner(new FileReader("src\\data\\customer.txt"));) {
	        ough.useDelimiter(",");
	        while (ough.hasNextLine()) {
	        	Scanner oughs = new Scanner(ough.nextLine());
	            while (oughs.hasNext()) {
	                reservedSeat.add(oughs.next());
	            }
	        }
	        
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	}

	public ArrayList<String> getListofReservedSeat() {
		return reservedSeat;
	}

	public String getSeatPosition(){
		return seatPosition;
	}
	
}