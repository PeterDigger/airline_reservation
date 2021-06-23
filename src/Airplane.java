import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Airplane{ // the GUI seat will ask this for seat number
	
	private ArrayList<String> airplaneModel;
	private String flightClass;
	private int seatNo;
	
	public Airplane(boolean economy){
		if (economy) {
			this.seatNo = 24;		//economy class
			this.flightClass = "Economy ";
		}else {
			this.seatNo = 50;		//business class
			this.flightClass = "Business ";
		}
		
		try (Scanner ough = new Scanner(new FileReader("src\\data\\flight.txt"));) {
	        ough.useDelimiter(",");
	        while (ough.hasNextLine()) {
				airplaneModel.add(ough.next());
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	
	}
	
	public ArrayList<String> getAirplaneModel() {
		return airplaneModel;
	}
	
	public String getFlightClass() {
		return flightClass;
	}
	
	public int getSeatNo(){
		return seatNo;
	}
	
}
