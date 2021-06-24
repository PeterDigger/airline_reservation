import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FlightPanel {
	private Location location;
	private Seat seat;
	private Airplane airplane;
	private time time;
	
	private JLabel locationLabel;
	private JLabel seatLabel;
	private JLabel airplaneLabel;
	private JLabel timeLabel;
	private JLabel selected;
	
	private JComboBox locationCBox;
	private JComboBox foodCBox;
	private JComboBox luggageCBox;
	
	private JButton button;
	
	private JPanel addOnsPanel;
	
	public FlightPanel() {
		
		location = new Location();
		seat = new Seat("", "");
		airplane = new Airplane(true);
		time = new time();
		
		locationLabel = new JLabel("Insurance: ");
		seatLabel = new JLabel("Food: ");
		airplaneLabel = new JLabel("Luggage: ");
		timeLabel = new JLabel(": ");
		selected = new JLabel();
		
		insuranceCBox = new JComboBox(insurance.getInsuranceList().toArray());
		foodCBox = new JComboBox(food.getFoodList().toArray());
		luggageCBox = new JComboBox(luggage.getLuggageList().toArray());
		
		button = new JButton("Next");
		button.setFocusable(false);
		
		addOnsPanel = new JPanel();
		//addOnsPanel.setLayout(new BoxLayout(addOnsPanel, BoxLayout.Y_AXIS));
		//addOnsPanel.setLayout(null);
		//addOnsPanel.add(Box.createRigidArea(new Dimension(0,50)));
		//addOnsPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		//addOnsPanel.add(Box.createHorizontalGlue());
		//addOnsPanel.add(Box.createVerticalGlue());
		addOnsPanel.add(insuranceLabel);
		addOnsPanel.add(insuranceCBox);
		addOnsPanel.add(foodLabel);
		addOnsPanel.add(foodCBox);
		addOnsPanel.add(luggageLabel);
		addOnsPanel.add(luggageCBox);
		addOnsPanel.add(button);
		addOnsPanel.add(selected);
		
	}

	public JPanel getAddOnsPanel() {
		return addOnsPanel;
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
	
}
