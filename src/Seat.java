
public class Seat {
	
	private String seatPosition;
	
	private String[] allSeatRow = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
	private String[] allSeatColumn = {"A", "B", "C", "D", "E", "F"};
	
	public Seat(){	
		int min = 0;
		int max = 19;
		int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);
		int minA = 0;
		int maxA = 5;
		int randomA = (int)Math.floor(Math.random()*(maxA-minA+1)+minA);
		seatPosition = allSeatRow[randomNum] + allSeatColumn[randomA];
	}

	public String getSeatPosition(){
		return seatPosition;
	}
	
}