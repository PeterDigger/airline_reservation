import java.io.File;
import java.io.FileNotFoundException;
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
		airplaneModelList = new ArrayList<String>();
		Scanner scanner;
		try {
			scanner = new Scanner(new File("resource\\data\\flightmodel.txt"));
			scanner.useDelimiter(",");
	        while (scanner.hasNext()) {
				airplaneModelList.add(scanner.next());
	        }
	        scanner.close();
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
