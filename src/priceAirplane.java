
public class priceAirplane {
	private double price;
		
	public priceAirplane() {

		double max = 200.00;
		double min = 50.00;
		double randomNum = (double)Math.floor(Math.random()*(max-min+1)+min);
		price = randomNum;
	}

	public double getPrice(){
		return price;
	}
}
