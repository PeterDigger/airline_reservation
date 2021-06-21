import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AddOnsPanel extends Panel {
	
	Insurance insurance;
	Food food;
	Luggage luggage;
	
	JLabel insuranceLabel;
	JLabel foodLabel;
	JLabel luggageLabel;
	JLabel selected;
	
	JComboBox insuranceCBox;
	JComboBox foodCBox;
	JComboBox luggageCBox;
	
	JButton button;
	JPanel addOnsPanel;
	
	public AddOnsPanel() {
		
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
		
		addOnsPanel = new JPanel();
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
