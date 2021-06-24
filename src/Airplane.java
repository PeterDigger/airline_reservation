import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Airplane{ // the GUI seat will ask this for seat number
	
	private ArrayList<String> airplaneModelList;
	private String flightClass;
	private int airplaneSeatNo;
	
	public Airplane(boolean economy){
		if (economy) {
			this.airplaneSeatNo = 24;		//economy class
			this.flightClass = "Economy ";
		}else {
			this.airplaneSeatNo = 50;		//business class
			this.flightClass = "Business ";
		}
		
		try (Scanner ough = new Scanner(new FileReader("resource\\data\\flightmodel.txt"));) {
	        ough.useDelimiter(",");
	        while (ough.hasNextLine()) {
				airplaneModelList.add(ough.next());
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	
	}
	
	public ArrayList<String> getAirplaneModeList() {
		return airplaneModelList;
	}
	
	public String getFlightClass() {
		return flightClass;
	}
	
	public int getAirplaneSeatNo(){
		return airplaneSeatNo;
	}
	
}
