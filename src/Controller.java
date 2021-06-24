import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Controller {
	
	private AddOnsPanel addOnsPanel;
	private AddOns addOns;
	private Login login;
	private JFrame mainFrame;
	
	//this constructor is for Add Ons
	//it relates the model to the interface
	public Controller(AddOnsPanel addOnsPanel, AddOns addOns) {
		this.addOnsPanel = addOnsPanel;
		this.addOns = addOns;
		
		this.addOnsPanel.addPanelListener(new Total());
//		this.addOnsPanel.addEconomyListener(new listOut());
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
		// BRB once calendar done
		@Override
		public void actionPerformed(ActionEvent e) {
			// saves data to the each of the variables in each class
			addOns.setInsurance(addOnsPanel.getSelectedInsurance());;
			addOns.setFood(addOnsPanel.getSelectedFood());
			addOns.setLuggage(addOnsPanel.getSelectedLuggage());
			addOns.setPrice(addOnsPanel.getPrice());
			
			//prints out the total money for addons
			System.out.println(addOns.getInsurance() + " "
					+ addOns.getFood() + " "
					+ addOns.getLuggage() + " "
					+ "RM" + addOns.getPrice()
					);
		}
	}
	
	class listOut implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// saves data to the each of the variables in each class
			addOns.setInsurance(addOnsPanel.getSelectedInsurance());;
			addOns.setFood(addOnsPanel.getSelectedFood());
			addOns.setLuggage(addOnsPanel.getSelectedLuggage());
			addOns.setPrice(addOnsPanel.getPrice());
			
			//prints out the total money for addOns
			System.out.println(addOns.getInsurance() + " "
					+ addOns.getFood() + " "
					+ addOns.getLuggage() + " "
					+ "RM" + addOns.getPrice()
					);
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
