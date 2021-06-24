import java.io.*;
import java.util.*;

public class Location{
	
	private ArrayList<String> countryList;
	
	// start of constructor
	public Location(){
		countryList = new ArrayList<String>();
		Scanner loco;
		try {
			loco = new Scanner(new File("resource\\data\\country.txt")); 
			loco.useDelimiter(",");
			while (loco.hasNext()) {
				countryList.add(loco.next());
			}
			loco.close();
		}
		catch (FileNotFoundException error) {
			error.printStackTrace();
		}
	}// end of constructor

	public ArrayList<String> getCountryList(){
		return countryList;
	}
}	
