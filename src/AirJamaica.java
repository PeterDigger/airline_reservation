import java.util.*;
public class AirJamaica 
{
    public static void main(String[] args) 
    {
        Airplane ap1 = new Airplane("Boeing", 505, 400, "Roy Jones");
        Airplane ap2 = new Airplane("Boeing", 968, 400, "Mark Scott");
        Airplane ap3 = new Airplane("Boeing", 756, 400, "John Palmer");
        
        Flight f1 = new Flight("New York", "Miami", "3-4-2015", ap1);
        Flight f2 = new Flight("London", "Miami", "3-8-2015", ap2);
        Flight f3 = new Flight("New York", "London", "9-4-2015", ap2);
        Flight f4 = new Flight("New York", "Toronto", "4-8-2015", ap3);
        Flight f5 = new Flight("Paris", "Miami", "9-6-2015", ap1);
        
       ArrayList<Flight> flights = new ArrayList<Flight>();
       flights.add(f1);
       flights.add(f2);
       flights.add(f3);
       flights.add(f4);
       flights.add(f5);
       
       flights.get(2).schedule("2:00PM", "6:00PM");
       flights.get(2).schedule("2:15PM");
       
       int count = 0;
       while(flights.size()!=count)
       {
           System.out.print(flights.get(count).toString());
           count++;
       }
    }
    
}