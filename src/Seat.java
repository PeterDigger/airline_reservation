import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*; 

public class Seat {
	
	private String seatPosition;
	private ArrayList<String> reservedSeatList;
	
	public Seat(String date, String Flight){	

		try (Scanner ough = new Scanner(new FileReader("resource\\data\\customer.txt"));) {
	        ough.useDelimiter(",");
	        while (ough.hasNextLine()) {
	        	Scanner oughs = new Scanner(ough.nextLine());
	            while (oughs.hasNext()) {
	                reservedSeatList.add(oughs.next());
	            }
	        }
	        
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	}

	public ArrayList<String> getListofReservedSeat() {
		return reservedSeatList;
	}

	public String getSeatPosition(){
		return seatPosition;
	}
	
}