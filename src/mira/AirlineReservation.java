import java.util.Scanner;
 

 
public class AirlineReservation {
	
	
 
	 public static final int FIRSTCLASSCAPACITY = 3,ECOCAPICCAPACITY = 7; //First class, economy class seat allocation
	 public static final int FIRSTCLASS = 1; //1 is first class
	 public static final int ECONOMIC = 2; // 2 is economy class
	 public static int[] seatNum=new int[FIRSTCLASSCAPACITY+ECOCAPICCAPACITY]; //seat number
	 public static boolean[] seatStatus=new boolean[FIRSTCLASSCAPACITY+ECOCAPICCAPACITY]; //true means scheduled
	 public static int firstClassAvailable = FIRSTCLASSCAPACITY; //Reservable first class seats
	 public static int economicAvailable = ECOCAPICCAPACITY; //reservable economy class seats
	 public static int seatType= 0; //User selected cabin type
	 public static int seatNumber = 0; //The seat number specified by the system for the user
	 public static Scanner input=new Scanner(System.in);
 
	 public static void main(String[] args)
 {
 
	  for (int i=0;i<seatNum.length;i++) //Assign the seat number
         seatNum[i]=i+1;  
     
           System.out.println("Flight Scheduler:");
     
 
		
		do{
			 System.out.print ("Please enter 1 for first class booking, 2 for economy class booking (input -1 exit):");
			seatType =input.nextInt();
			if(seatType ==-1){
				 System.out.printf ("Exited Program");
				break;
			}
			
			if (seatType == FIRSTCLASS)
			bookFirstClass();
			else if (seatType == ECONOMIC)
			bookEconomic();
 
				
			} while (seatType != -1 && !(economicAvailable ==0 && firstClassAvailable ==0));
		
		input.close();
 }
    
 public static void bookFirstClass() {
	 
	 if (firstClassAvailable >0) { //Check if the first class is available
		 for (int i=0;i<FIRSTCLASSCAPACITY;i++)
	     {
	         if (seatStatus[i]!=true)
	         {
	             seatNumber=seatNum[i];
	             seatStatus[i]=true;
	             firstClassAvailable--;
	              System.out.printf ("You have successfully booked First Class, Class Type: First Class, Seat Number: %d%n", seatNumber);
	             break;
	         }
	     }
	}
         else if(economicAvailable > 0) //If the first class is full, check if the economy class has a seat
         {
                   System.out.printf ("Sorry, the first class is full, if you need to book economy class, you can enter 2:");
         seatType =input.nextInt();	
			if (seatType==2)
				 bookEconomic(); //Book economy class
         
    }
    else if  (economicAvailable ==0 && firstClassAvailable ==0)
    	     System.out.println("Sorry, all flights on this flight are full, please check other flights.");
 }
 
 
 public static void bookEconomic() {
	 
		 if (economicAvailable > 0) { //Check if economy class is available
			 for (int i=FIRSTCLASSCAPACITY;i<FIRSTCLASSCAPACITY+ECOCAPICCAPACITY;i++)
		     {
		         if (seatStatus[i]!=true)
		         {
		             seatNumber=seatNum[i];
		             seatStatus[i]=true;
		             economicAvailable--;
		              System.out.printf ("You have successfully booked Economy Class, Class of Service: Economy Class, Seat Number: %d%n", seatNumber);
		             break;
		         }
		     }
		}
	     else if(firstClassAvailable > 0) //If the first class is full, check if the economy class has a seat
	         {
	          System.out.printf ("Sorry, economy class is full, if you need to book first class, you can enter 1:");
				seatType =input.nextInt();
				if (seatType==1)
					 bookFirstClass(); //decome first class
	         
	    }
	    else if (economicAvailable ==0 && firstClassAvailable ==0) 
	    	 System.out.println("Sorry, all flights on this flight are full, please check other flights.");
	 }
	 
 }