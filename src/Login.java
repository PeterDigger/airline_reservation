import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Login implements ActionListener, MouseListener{
	
	//Container container = getContentPane();
	private ImageIcon image;
	private JLabel logo;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JCheckBox showPassword;
    private JTextPane register;
    private JTextPane error;
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
    	register = new JTextPane();
    	error = new JTextPane();
    	loginPanel = new JPanel();
    	loginFrame = new JFrame("Login");
    	
    	userLabel.setPreferredSize(new Dimension(100, 30));
        passwordLabel.setPreferredSize(new Dimension(100, 30));
        userTextField.setPreferredSize(new Dimension(150, 30));
        passwordField.setPreferredSize(new Dimension(150, 30));
        showPassword.setPreferredSize(new Dimension(150, 30));
        loginButton.setPreferredSize(new Dimension(100, 30));
        
        error.setText("");
        error.setFont(new Font("Dialog", Font.BOLD, 16));
        register.setText("I'm a new user");
        register.setFont(new Font("Dialog", Font.BOLD, 12));
        
        register.addMouseListener(this);
        showPassword.addActionListener(this);
        
        error.setForeground(Color.decode("#CC7766"));
        error.setBackground(Color.decode("#99EEFF"));
        register.setBackground(Color.decode("#99EEFF"));
        userTextField.setBackground(Color.decode("#E5FBFF"));
        passwordField.setBackground(Color.decode("#E5FBFF"));
        showPassword.setBackground(Color.decode("#99EEFF"));
        loginButton.setBackground(Color.decode("#E5FBFF"));
        loginButton.setFocusable(false);

        loginPanel.add(logo);
    	loginPanel.add(userLabel);
    	loginPanel.add(userTextField);
    	loginPanel.add(passwordLabel);
    	loginPanel.add(passwordField);
    	loginPanel.add(error);
    	loginPanel.add(showPassword);
    	loginPanel.add(register);
    	loginPanel.add(loginButton);
    	loginFrame.add(loginPanel);
    	loginPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    	loginPanel.setBackground(Color.decode("#99EEFF"));

    	loginFrame.setIconImage(image.getImage());
    	loginFrame.setSize(400, 500);
    	loginFrame.setResizable(false);
    	loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	loginFrame.setVisible(true);
    }
    
	public JFrame getLoginFrame() {
		return loginFrame;
	}
	
	public String getUserText() {
		return userTextField.getText();
	}

	public String getPassword() {
		return passwordField.getText();
	}
	
	public JTextPane getError() {
		return error;
	}
	
    public void addLoginListener(ActionListener ListenForButton) {
		loginButton.addActionListener(ListenForButton);
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
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		RegistrationFrame register = new RegistrationFrame();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		register.setForeground(Color.decode("#FFE5D9"));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		register.setForeground(Color.decode("#B37947"));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		register.setForeground(Color.decode("#B37947"));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		register.setForeground(Color.BLACK);
	}

}
