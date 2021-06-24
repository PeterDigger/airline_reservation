import java.awt.*;
import javax.swing.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		UIManager.put("TabbedPane.selected", Color.decode("#1840ED"));
		
		ImageIcon logo = null;
		ImageIcon home = null;
		ImageIcon booking = null;
		
		try{
			logo = new ImageIcon("resource\\image\\airplane.png");
			home = new ImageIcon("resource\\image\\home.png");
			booking = new ImageIcon("resource\\image\\booking.png");
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		Login login = new Login();
		
		JFrame mainFrame = new JFrame("Airline Reservation");
		JTabbedPane tp =new JTabbedPane();  
		
		HomePanel homePanel = new HomePanel();
		
		AddOnsPanel addOnsPanel = new AddOnsPanel();
		AddOns addOns = new AddOns();
		
		Controller loginController = new Controller(login, mainFrame);
		Controller panelController = new Controller(addOnsPanel, addOns);
		//Controller panelController = new Controller(cards, addOns);
		
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setIconImage(logo.getImage());
		//frame.setLayout(new BorderLayout(10,10));
		//frame.add(addOnsPanel.getAddOnsPanel());
		mainFrame.add(tp);
		tp.setFont(new Font("Dialog", Font.BOLD, 36));
		tp.setForeground(Color.white);
		tp.setBackground(Color.decode("#2C386E"));
		tp.addTab("Home", home, homePanel.getHomePanel());
		tp.addTab("Booking", booking, addOnsPanel.getAddOnsPanel());
		mainFrame.setSize(1080, 600);
		//frame.setResizable(false);
		mainFrame.setVisible(false);

	}
}
