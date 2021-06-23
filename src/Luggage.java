import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Luggage {
	
	private ArrayList<String> luggageList;
	private ArrayList<Double> priceList;
	
	public Luggage() {
		luggageList = new ArrayList<String>();
		priceList = new ArrayList<Double>();
		Scanner scanner;
		try {
			scanner = new Scanner(new File("resource\\data\\luggage.txt")); 
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				if(scanner.hasNextDouble()) {
					priceList.add(scanner.nextDouble());
				}
				else {
					luggageList.add(scanner.next());
				}
				
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getLuggageList() {
		return luggageList;
	}

	public ArrayList<Double> getPriceList() {
		return priceList;
	}
	
}

