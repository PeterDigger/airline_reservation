import java.util.*;

public class Seat extends Flight{
	
	ArrayList<String> seatArray = new ArrayList<String>();
	boolean seatFull;
	
	public Seat(){

	}
	
	public ArrayList<String> getSeatArray(){
		return seatArray;
	}
	
	public boolean isSeatFull(){
		return seatFull;
	}
	
}
