import java.io.*;
import java.util.*;

public class Location{
	
	private ArrayList<String> origin;
	private ArrayList<String> destination;
	
	// start of constructor
	public Location(){
		origin = new ArrayList<String>();
		destination = new ArrayList<String>();
		Scanner loco;
		try {
			loco = new Scanner(new File("src\\data\\country.txt")); 
			loco.useDelimiter(",");
			while (loco.hasNext()) {
				origin.add(loco.next());
				destination.add(loco.next());
			}
			loco.close();
		}
		catch (FileNotFoundException error) {
			error.printStackTrace();
		}
	}// end of constructor

	public ArrayList<String> getOrigin(){
		return origin;
	}
	
	public ArrayList<String> getDestination(){
		return destination;
	}
}