import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.border.Border;

import org.jdatepicker.impl.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Calendar;
import java.util.Date;


public class AddOnsPanel {
	
	private Insurance insurance;
	private Food food;
	private Luggage luggage;
	private Location country;
	
	private JLabel froLabel;
	private JLabel desLabel;
	private JLabel classLabel;
	private JLabel tripLabel;
	private JLabel insuranceLabel;
	private JLabel foodLabel;
	private JLabel luggageLabel;
	private JLabel selected;

	private JComboBox froCountrycBox;
	private JComboBox desCountrycBox;
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
	private JPanel leftDownUpPanel;
	private JPanel leftDownDownPanel;
	private JPanel rightPanel;
	private JPanel rightUpPanel;
	private JPanel rightDownPanel;
	private JScrollPane scroll;
	
	UtilDateModel model;
	
//	private JTextArea text;

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
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		
		//Heavy meat
		
		
		
		
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
		
		button = new JButton("Next");
		button.setFocusable(false);
		
		
//// END of Content -------------------------------------------------------
		
//// Position -------------------------------------------------------------
		
		// instance for all Panels
		leftPanel = new JPanel();
		leftUpPanel = new JPanel(new GridLayout(3, 1));
		leftUp1Panel = new JPanel();
		leftUp2Panel = new JPanel();
		leftUp3Panel = new JPanel();
		leftDownPanel = new JPanel();
		rightUpPanel = new JPanel();
		rightDownPanel = new JPanel();
		rightPanel = new JPanel(new GridLayout(2, 1));
		Panel = new JPanel(new GridLayout(1, 2));
		
		scroll = new JScrollPane(leftDownPanel);
		
		//properties of the panels
		rightUpPanel.setLayout(new GridBagLayout());
		
		//instance for border of each section
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		//LEFT SECTION
		
		//left content -------------------
		
		// Left Panel's up child
		leftUp1Panel.add(froLabel);
		leftUp1Panel.add(froCountrycBox);
		leftUp1Panel.add(desLabel);
		leftUp1Panel.add(desCountrycBox);
		leftUp2Panel.add(classLabel);
		leftUp2Panel.add(Eco);
		leftUp2Panel.add(Bus);
		leftUp2Panel.add(tripLabel);
		leftUp2Panel.add(Rou);
		leftUp2Panel.add(Sin);
		leftUp2Panel.add(search);
		
		// Left Panel's down child

		leftDownPanel.revalidate();
		leftDownPanel.repaint();
		
		
		// loop to display available tickets

		
		//Position the left panel's child
		leftUpPanel.add(leftUp1Panel);
		leftUpPanel.add(leftUp2Panel);
		leftUpPanel.add(leftUp3Panel);		
		leftPanel.add(leftUpPanel);
		leftPanel.add(leftDownPanel);
		
		//RIGHT SECTION ---------------
		
		//right up content
		rightUpPanel.revalidate();
		rightUpPanel.repaint();
		
		rightUpPanel.add(insuranceLabel);
		rightUpPanel.add(insuranceCBox);
		rightUpPanel.add(foodLabel);
		rightUpPanel.add(foodCBox);
		
		//right down content
		rightDownPanel.add(insuranceLabel);
		rightDownPanel.add(insuranceCBox);
		rightDownPanel.add(foodLabel);
		rightDownPanel.add(foodCBox);
		rightDownPanel.add(luggageLabel);
		rightDownPanel.add(luggageCBox);
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
		
	// TEST SECTION
		//addOnsPanel.setLayout(new BoxLayout(addOnsPanel, BoxLayout.Y_AXIS));
		//addOnsPanel.setLayout(null);
		//addOnsPanel.add(Box.createRigidArea(new Dimension(0,50)));
		//addOnsPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		//addOnsPanel.add(Box.createHorizontalGlue());
		//addOnsPanel.add(Box.createVerticalGlue());		
		//text = new JTextArea(20, 40);
		//text.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		//text.setWrapStyleWord(true);
		//text.setLineWrap(true);
		//text.setOpaque(false);
		//text.setEditable(false);
		//text.setFocusable(false);	
		
//// END of Position -----------------------------------------------------------

		
		
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
	
	void addPanelListener(ActionListener ListenForButton) {
		button.addActionListener(ListenForButton);
	}
	
	void addEconomyListener(ActionListener ListenForButton) {
		search.addActionListener(ListenForButton);
	}
	
}
