import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller {
	
	private AddOnsPanel addOnsPanel;
	private AddOns addOns;
	private Flight flight;
	private Login login;
	private time timey;
	private Airplane planey;
	private JFrame mainFrame;
	private Seat seat;
	private priceAirplane price;
	
	//this constructor is for Add Ons
	//it relates the model to the interface
	public Controller(AddOnsPanel addOnsPanel, AddOns addOns, Flight flight) {
		this.addOnsPanel = addOnsPanel;
		this.addOns = addOns;
		this.flight = flight;
		
		this.addOnsPanel.addPanelListener(new Total());
	}
	
	public Controller(Login login, JFrame mainFrame) {
		this.login = login;
		this.mainFrame = mainFrame;
		
		this.login.addLoginListener(new LoginListener());
	}
	
	//remember to make other kind of constructor for other panels
	//this is listener for that panel that implements it
	//in here you write what to perform for the action listener
	class Total implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// saves data to the each of the variables in each class
			seat = new Seat();
			price = new priceAirplane();
			addOns.setInsurance(addOnsPanel.getSelectedInsurance());;
			addOns.setFood(addOnsPanel.getSelectedFood());
			addOns.setLuggage(addOnsPanel.getSelectedLuggage());
			addOns.setPrice(addOnsPanel.getPrice());
			timey = new time(addOnsPanel.getTrip());
			planey = new Airplane(addOnsPanel.getEconomy());
			flight.setArrivalTime(timey.getArrivalTime());
			flight.setDepartureTime(timey.getDepartureTime());
			flight.setArrival(addOnsPanel.getSelectedDestination());
			flight.setDestination(addOnsPanel.getSelectedOrigin());
			flight.setSeatNo(seat.getSeatPosition());
			flight.setArrivalDate(addOnsPanel.getSelectedArrival());
			flight.setDepartureDate(addOnsPanel.getSelectedDepart());
			flight.setFlightClass(planey.getFlightClass());
			flight.setPrice(price.getPrice());
			
			//prints out the total money for addons and flight ticket
			double sumSin = flight.getPrice()+ addOns.getPrice();
			double sumRou = (flight.getPrice()*2) + (addOns.getPrice()*2);			

			if (addOnsPanel.getTrip()) {		//Round trip
				JOptionPane.showMessageDialog(mainFrame, "Congratulation!! \n\n"
						+ flight.getDestination() + " -> "+ flight.getArrival() + "(Round Trip)\n" +
						"Your Current Seat is: " + flight.getSeatNo() + "\n" +
						"Flight Class: " + flight.getFlightClass() + "\n" +
						"Departure Date: " + flight.getDepartureDate() + " " + flight.getDepartureTime() + "\n" +
						"Arrival Date: " + flight.getArrivalDate() + " " + flight.getArrivalTime() + "\n" +
						"Flight Model: " + addOnsPanel.getSelectedModel() + "\n"+
						"Total Price: RM" + sumRou
						);
			}else {
				JOptionPane.showMessageDialog(mainFrame, "Congratulation!! \n\n"
						+ flight.getDestination() + " -> "+ flight.getArrival() + "(Single Trip)\n" +
						"Your Current Seat is: " + flight.getSeatNo() + "\n" +
						"Flight Class: " + flight.getFlightClass() + "\n" +
						"Departure Date: " + flight.getDepartureDate() + " " + flight.getDepartureTime() + "\n" +
						"Arrival Date: " + flight.getArrivalDate() + " " + flight.getArrivalTime() + "\n" +
						"Flight Model: " + addOnsPanel.getSelectedModel() + "\n"+
						"Total Price: RM" + sumSin
						);
			}

			
			}
	}
	
	class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			login.getLoginFrame().dispose();
			mainFrame.setVisible(true);
			
		}
	}
}
