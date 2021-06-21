import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	
	private ArrayList<String> foodList;
	private ArrayList<Double> priceList;
	
	public Food() {
		foodList = new ArrayList<String>();
		priceList = new ArrayList<Double>();
		Scanner scanner;
		try {
			scanner = new Scanner(new File("src\\data\\food.txt")); 
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				if(scanner.hasNextDouble()) {
					priceList.add(scanner.nextDouble());
				}
				else {
					foodList.add(scanner.next());
				}
				
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getFoodList() {
		return foodList;
	}

	public ArrayList<Double> getPriceList() {
		return priceList;
	}
	
}
