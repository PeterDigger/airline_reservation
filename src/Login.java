import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener{
	
	//Container container = getContentPane();
	private ImageIcon image;
	private JLabel logo;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private  JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JCheckBox showPassword;
    private JPanel loginPanel;
    private JFrame loginFrame;
    
    
    Login(){
    	
    	try{
			image = new ImageIcon("resource\\image\\airplane.png");
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
    	logo = new JLabel();
    	logo.setIcon(image);
    	userLabel = new JLabel("USERNAME");
    	passwordLabel = new JLabel("PASSWORD");
    	userTextField = new JTextField();
    	passwordField = new JPasswordField();
    	loginButton = new JButton("LOGIN");
    	showPassword = new JCheckBox("Show Password");
    	loginPanel = new JPanel();
    	loginFrame = new JFrame("Login");
    	
    	userLabel.setPreferredSize(new Dimension(100, 30));
        passwordLabel.setPreferredSize(new Dimension(100, 30));
        userTextField.setPreferredSize(new Dimension(150, 30));
        passwordField.setPreferredSize(new Dimension(150, 30));
        showPassword.setPreferredSize(new Dimension(150, 30));
        loginButton.setPreferredSize(new Dimension(100, 30));
        
        showPassword.addActionListener(this);

        loginPanel.add(logo);
    	loginPanel.add(userLabel);
    	loginPanel.add(userTextField);
    	loginPanel.add(passwordLabel);
    	loginPanel.add(passwordField);
    	loginPanel.add(showPassword);
    	loginPanel.add(loginButton);
    	loginFrame.add(loginPanel);
    	loginPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

    	loginFrame.setIconImage(image.getImage());
    	loginFrame.setSize(400, 450);
    	loginFrame.setResizable(false);
    	loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	loginFrame.setVisible(true);
    }
    
	public JFrame getLoginFrame() {
		return loginFrame;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == showPassword) {
	        if (showPassword.isSelected()) {
	            passwordField.setEchoChar((char) 0);
	        } else {
	            passwordField.setEchoChar('*');
	        }
		}
	}
    
    void addLoginListener(ActionListener ListenForButton) {
		loginButton.addActionListener(ListenForButton);
	}
    
}
