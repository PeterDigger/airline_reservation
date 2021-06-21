import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	
	private AddOnsPanel addOnsPanel;
	private AddOns addOns;
	
	//this constructor is for Add Ons
	//it relates the model to the interface
	public Controller(AddOnsPanel addOnsPanel, AddOns addOns) {
		this.addOnsPanel = addOnsPanel;
		this.addOns = addOns;
		
		this.addOnsPanel.addPanelListener(new PanelListener());
	}
	
	//remember to make other kind of constructor for other panels
	
	//this is listener for that panel that implements it
	//in here you write what to perform for the action listener
	class PanelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			addOns.setInsurance(addOnsPanel.getSelectedInsurance());;
			addOns.setFood(addOnsPanel.getSelectedFood());
			addOns.setLuggage(addOnsPanel.getSelectedLuggage());
			addOns.setPrice(addOnsPanel.getPrice());
			
			System.out.println(addOns.getInsurance() + " "
					+ addOns.getFood() + " "
					+ addOns.getLuggage() + " "
					+ "RM" + addOns.getPrice()
					);
		}
		
	}
	
}
