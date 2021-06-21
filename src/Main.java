import java.awt.*;
import java.io.IOException;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test test");
		
		AddOnsPanel addOnsPanel = new AddOnsPanel();
		AddOns addOns = new AddOns();
		
		Controller panelController = new Controller(addOnsPanel, addOns);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new BorderLayout(10,10));
		frame.add(addOnsPanel.getAddOnsPanel());
		frame.setSize(480, 240);
		frame.setVisible(true);
	}
}
