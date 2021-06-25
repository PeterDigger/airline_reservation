import javax.swing.*;
import javax.swing.border.Border;

import org.jdatepicker.impl.*;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Date;

//private JTextArea text;

@SuppressWarnings({ "unchecked", "rawtypes" })

public class AddOnsPanel{
	
	private Airplane flight;
	private Insurance insurance;
	private Food food;
	private Luggage luggage;
	private Location country;
	
	private JLabel froLabel;
	private JLabel desLabel;
	private JLabel classLabel;
	private JLabel tripLabel;
	private JLabel dateLabel;
	private JLabel flightLabel;
	private JLabel seatLabel;
	private JLabel insuranceLabel;
	private JLabel foodLabel;
	private JLabel luggageLabel;
	private JLabel selected;

	private JComboBox froCountrycBox;
	private JComboBox desCountrycBox;
	private JComboBox flightCBox;
	private JComboBox insuranceCBox;
	private JComboBox foodCBox;
	private JComboBox luggageCBox;
	
	private JButton search;
	private JButton button;
	private JRadioButton Eco, Bus, Rou, Sin;
	
	private JPanel Panel;
	private JPanel leftPanel;
	private JPanel leftUpPanel;
	private JPanel leftUp1Panel;
	private JPanel leftUp2Panel;
	private JPanel leftUp3Panel;
	private JPanel leftDownPanel;
	private JPanel leftDown1Panel;
	private JPanel leftDown2Panel;
	private JPanel leftDown3Panel;
	private JPanel leftDown4Panel;
	private JPanel leftDown5Panel;
	private JPanel leftDown6Panel;
	private JPanel leftDown7Panel;
	private JPanel leftDown8Panel;
	private JPanel rightPanel;
	private JPanel rightUpPanel;	
	private JPanel rightDownPanel;
	
	private JFrame ticketFrame;
	
	UtilDateModel model;
	JDatePickerImpl departdatePicker;
	JDatePickerImpl arrivaldatePicker;
	
	

	public AddOnsPanel() {
//// Content (Meat) -------------------------------------------------------------		
		
		// list all the available date ticket
		
		country = new Location();
		
		froLabel = new JLabel("From: ");
		froCountrycBox = new JComboBox(country.getCountryList().toArray());
		
		desLabel = new JLabel("To: ");
		desCountrycBox = new JComboBox(country.getCountryList().toArray());
		
		classLabel = new JLabel("Class: ");
		Eco = new JRadioButton("Economy");
		Eco.setBounds(100,50,100,30);
		Bus = new JRadioButton("Business");
		Bus.setBounds(100,50,100,30);
		
		tripLabel = new JLabel("Trip: ");
		Rou = new JRadioButton("Round Trip");
		Rou.setBounds(100,50,100,30);
		Sin = new JRadioButton("Single Trip");
		Sin.setBounds(100,50,100,30);
		
		// Grouping up radio so user can only choose one
		ButtonGroup trip = new ButtonGroup();
		trip.add(Rou);
		trip.add(Sin);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(Eco);
		bg.add(Bus);
		
		// event handler which listen to the input of user to printout the list of flights
		search = new JButton("Search");
		search.setFocusable(false);
		dateLabel = new JLabel("Date: ");
		Properties pro = new Properties();
		pro.put("text.today", "Today");
		pro.put("text.month", "Month");
		pro.put("text.year", "Year");
		
		UtilDateModel depart = new UtilDateModel();
		JDatePanelImpl departPanel = new JDatePanelImpl(depart, pro);
		departdatePicker = new JDatePickerImpl(departPanel, new DateLabelFormatter());
		
		UtilDateModel arrival = new UtilDateModel();
		JDatePanelImpl arrivalPanel = new JDatePanelImpl(arrival, pro);
		arrivaldatePicker = new JDatePickerImpl(arrivalPanel, new DateLabelFormatter());
		
		//Heavy meat
		
		flight = new Airplane(true);
		flightLabel = new JLabel("Flight: ");
		flightCBox = new JComboBox(flight.getAirplaneModeList().toArray());
		
		seatLabel = new JLabel("Please select your seat: ");
		////-=============================
		
		insurance = new Insurance();
		food = new Food();
		luggage = new Luggage();
		
		insuranceLabel = new JLabel("Insurance: ");
		foodLabel = new JLabel("Food: ");
		luggageLabel = new JLabel("Luggage: ");
		selected = new JLabel();
		
		insuranceCBox = new JComboBox(insurance.getInsuranceList().toArray());
		foodCBox = new JComboBox(food.getFoodList().toArray());
		luggageCBox = new JComboBox(luggage.getLuggageList().toArray());
		
		button = new JButton("Finish");
		button.setFocusable(false);
		
		
//// END of Content -------------------------------------------------------
		
//// Position -------------------------------------------------------------
		
		// instance for all Panels
		leftPanel = new JPanel();
		leftUpPanel = new JPanel(new GridLayout(3, 1));
		leftUp1Panel = new JPanel();
		leftUp2Panel = new JPanel();
		leftUp3Panel = new JPanel();
		leftDownPanel = new JPanel(new GridLayout(8, 1));
		leftDown1Panel = new JPanel();
		leftDown2Panel = new JPanel();
		leftDown3Panel = new JPanel();
		leftDown4Panel = new JPanel();
		leftDown5Panel = new JPanel();
		leftDown6Panel = new JPanel();
		leftDown7Panel = new JPanel();
		leftDown8Panel = new JPanel();
		rightUpPanel = new JPanel(new GridLayout(5, 1));
		rightDownPanel = new JPanel(new GridLayout(5, 1));
		rightPanel = new JPanel(new GridLayout(2, 1));
		Panel = new JPanel(new GridLayout(1, 2));
		
		
		//properties of the panels
//		rightUpPanel.setLayout(new GridBagLayout());
		
		//instance for border of each section
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		//LEFT SECTION
		
		//left content -------------------
		
		// Left Panel's up child
		leftUp1Panel.add(froLabel);
		leftUp1Panel.add(froCountrycBox);					//done
		leftUp1Panel.add(desLabel);
		leftUp1Panel.add(desCountrycBox);					//done
		leftUp2Panel.add(dateLabel);
		leftUp2Panel.add(departdatePicker);					//done
		leftUp2Panel.add(dateLabel);
		leftUp2Panel.add(arrivaldatePicker);					//done
		leftUp3Panel.add(classLabel);
		leftUp3Panel.add(Eco);					//done
		leftUp3Panel.add(Bus);					//done
		leftUp3Panel.add(tripLabel);
		leftUp3Panel.add(Rou);					//done
		leftUp3Panel.add(Sin);					//done

		leftUp2Panel.add(search);
		
		// Left Panel's down child
		
		leftDown1Panel.add(flightLabel);
		leftDown1Panel.add(flightCBox);
		leftDown8Panel.add(seatLabel);
		
		for(int i=0 ; i<24 ; i++){
		    JButton btn = new JButton();
		    btn.setPreferredSize(new Dimension(20, 20));
		    leftDown2Panel.add(btn);
		}
		for(int i=0 ; i<24 ; i++){
		    JButton btn = new JButton();
		    btn.setPreferredSize(new Dimension(20, 20));
		    leftDown3Panel.add(btn);
		}
		for(int i=0 ; i<24 ; i++){
		    JButton btn = new JButton();
		    btn.setPreferredSize(new Dimension(20, 20));
		    leftDown4Panel.add(btn);
		}
		for(int i=0 ; i<24 ; i++){
		    JButton btn = new JButton();
		    btn.setPreferredSize(new Dimension(20, 20));
		    leftDown5Panel.add(btn);
		}
		for(int i=0 ; i<24 ; i++){
		    JButton btn = new JButton();
		    btn.setPreferredSize(new Dimension(20, 20));
		    leftDown6Panel.add(btn);
		}
		for(int i=0 ; i<24 ; i++){
		    JButton btn = new JButton();
		    btn.setPreferredSize(new Dimension(20, 20));
		    leftDown7Panel.add(btn);
		}
		
		// loop to display available tickets

		
		//Position the left panel's child
		leftUpPanel.add(leftUp1Panel);
		leftUpPanel.add(leftUp2Panel);
		leftUpPanel.add(leftUp3Panel);	
		leftDownPanel.add(leftDown1Panel);
		leftDownPanel.add(leftDown8Panel);
		leftDownPanel.add(leftDown2Panel);
		leftDownPanel.add(leftDown3Panel);
		leftDownPanel.add(leftDown4Panel);
		leftDownPanel.add(leftDown5Panel);
		leftDownPanel.add(leftDown6Panel);
		leftDownPanel.add(leftDown7Panel);
		leftPanel.add(leftUpPanel);
		leftPanel.add(leftDownPanel);
		
		//RIGHT SECTION ---------------
		
		//right up content
		rightUpPanel.add(insuranceLabel);
		rightUpPanel.add(insuranceCBox);
		rightUpPanel.add(foodLabel);
		rightUpPanel.add(foodCBox);
		rightUpPanel.add(luggageLabel);
		rightUpPanel.add(luggageCBox);


		//right down content
		rightDownPanel.add(button);
		rightDownPanel.add(selected);
		
		
		//Position the right panel's child
		rightPanel.add(rightUpPanel);
		rightPanel.add(rightDownPanel);
		
		//Main Panel
		Panel.add(leftPanel);
		Panel.add(rightPanel);
		
		// borderline to help with visual and all that.
		rightUpPanel.setBorder(blackline);
		rightDownPanel.setBorder(blackline);
		
//// END of Position -----------------------------------------------------------
		
	}
	
	public JFrame getTicketFrame() {
		return ticketFrame;
	}
	
	public JPanel getAddOnsPanel() {
		return Panel;
	}
	
	public String getSelectedInsurance() {
		return insurance.getInsuranceList().get(insuranceCBox.getSelectedIndex());
	}
	
	public String getSelectedFood() {
		return food.getFoodList().get(foodCBox.getSelectedIndex());
	}
	
	public String getSelectedLuggage() {
		return luggage.getLuggageList().get(luggageCBox.getSelectedIndex());
	}
	
	public double getPrice() {
		double price = insurance.getPriceList().get(insuranceCBox.getSelectedIndex())
				+ food.getPriceList().get(foodCBox.getSelectedIndex())
				+ luggage.getPriceList().get(luggageCBox.getSelectedIndex());
		
		return price;
	}
	
	// SEAT -------------------------------
	public String getSelectedOrigin() {
		return country.getCountryList().get(froCountrycBox.getSelectedIndex());
	}
	
	public String getSelectedDestination() {
		return country.getCountryList().get(desCountrycBox.getSelectedIndex());
	}
	
	public String getSelectedModel() {
		return flight.getAirplaneModeList().get(flightCBox.getSelectedIndex());
	}
	
	public boolean getEconomy() {
		boolean x = false;
		if(Eco.isSelected()) return x = true;
		return x;
	}
	
	public boolean getTrip() {
		boolean x = false;
		if (Rou.isSelected()) return x = true;
		return x;
	}
	
	public String getSelectedDepart() {
		Date departselectedDate = (Date) departdatePicker.getModel().getValue();
	    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	    String reportDate = df.format(departselectedDate);
		return reportDate;
	}
	
	public String getSelectedArrival() {
		Date arrivalselectedDate = (Date) arrivaldatePicker.getModel().getValue();
	    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	    String reportDate = df.format(arrivalselectedDate);
		return reportDate;
	}
	
	//SEAT -------------------------------
	
	void addPanelListener(ActionListener ListenForButton) {
		button.addActionListener(ListenForButton);
	}
	
	void addEconomyListener(ActionListener ListenForButton) {
		search.addActionListener(ListenForButton);
	}
	
}
