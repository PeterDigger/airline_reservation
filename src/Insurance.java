import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Insurance {
	
	private ArrayList<String> insuranceList;
	private ArrayList<Double> priceList;
	
	public Insurance() {
		insuranceList = new ArrayList<String>();
		priceList = new ArrayList<Double>();
		Scanner scanner;
		try {
			scanner = new Scanner(new File("resource\\data\\insurance.txt")); 
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				if(scanner.hasNextDouble()) {
					priceList.add(scanner.nextDouble());
				}
				else {
					insuranceList.add(scanner.next());
				}
				
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getInsuranceList() {
		/*for (int i = 0; i < insuranceList.size(); i++) {
			System.out.println(insuranceList.get(i));
		}*/
		return insuranceList;
	}

	public ArrayList<Double> getPriceList() {
		return priceList;
	}
	
}
