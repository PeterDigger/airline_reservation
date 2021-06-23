import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AddOnsPanel {
	
	private Insurance insurance;
	private Food food;
	private Luggage luggage;
	
	private JLabel insuranceLabel;
	private JLabel foodLabel;
	private JLabel luggageLabel;
	private JLabel selected;
	
	private JComboBox insuranceCBox;
	private JComboBox foodCBox;
	private JComboBox luggageCBox;
	
	private JButton button;
	
	private JPanel addOnsPanel;
	
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
