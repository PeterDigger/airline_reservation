import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	
public class RegistrationFrame extends JFrame implements ActionListener {
	  
	    // Components of the Form
		private Registration register;

	    private Container c;
	    private JLabel title;
	    private JLabel fname;
	    private JTextField tfname;
	    private JLabel lname;
	    private JTextField tlname;
	    private JLabel uname;
	    private JTextField tuname;
	    private JLabel password;
	    private JPasswordField tpassword;
	    private JLabel email;
	    private JTextField temail;
	    private JLabel mno;
	    private JTextField tmno;
	    private JLabel gender;
	    private JRadioButton male;
	    private JRadioButton female;
	    private ButtonGroup gengp;
	    private JLabel dob;
	    private JComboBox date;
	    private JComboBox month;
	    private JComboBox year;
	    private JCheckBox term;
	    private JButton sub;
	    private JButton cancel;
	    private JLabel res;
	  
	    private String dates[]
	        = { "1", "2", "3", "4", "5",
	            "6", "7", "8", "9", "10",
	            "11", "12", "13", "14", "15",
	            "16", "17", "18", "19", "20",
	            "21", "22", "23", "24", "25",
	            "26", "27", "28", "29", "30",
	            "31" };
	    private String months[]
	        = { "Jan", "feb", "Mar", "Apr",
	            "May", "Jun", "July", "Aug",
	            "Sep", "Oct", "Nov", "Dec" };
	    private String years[]
	        = { "1995", "1996", "1997", "1998",
	            "1999", "2000", "2001", "2002",
	            "2003", "2004", "2005", "2006",
	            "2007", "2008", "2009", "2010",
	            "2011", "2012", "2013", "2014",
	            "2015", "2016", "2017", "2018",
	            "2019" };
	  
	    // constructor, to initialize the components
	    // with default values.
	    public RegistrationFrame() {
	        setTitle("Registration Form");
	        setBounds(0, 0, 500, 700);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	  
	        c = getContentPane();
	        c.setLayout(null);
	  
	        title = new JLabel("Registration Form");
	        title.setFont(new Font("Arial", Font.PLAIN, 30));
	        title.setSize(300, 30);
	        title.setLocation(125, 30);
	        c.add(title);
	  
	        fname = new JLabel("First Name");
	        fname.setFont(new Font("Arial", Font.PLAIN, 20));
	        fname.setSize(100, 20);
	        fname.setLocation(100, 100);
	        c.add(fname);
	  
	        tfname = new JTextField();
	        tfname.setFont(new Font("Arial", Font.PLAIN, 15));
	        tfname.setSize(190, 20);
	        tfname.setLocation(200, 100);
	        c.add(tfname);
	        
	        lname = new JLabel("Last Name");
	        lname.setFont(new Font("Arial", Font.PLAIN, 20));
	        lname.setSize(100, 20);
	        lname.setLocation(100, 150);
	        c.add(lname);
	  
	        tlname = new JTextField();
	        tlname.setFont(new Font("Arial", Font.PLAIN, 15));
	        tlname.setSize(190, 20);
	        tlname.setLocation(200, 150);
	        c.add(tlname);
	        
	        uname = new JLabel("Username");
	        uname.setFont(new Font("Arial", Font.PLAIN, 20));
	        uname.setSize(100, 20);
	        uname.setLocation(100, 200);
	        c.add(uname);
	  
	        tuname = new JTextField();
	        tuname.setFont(new Font("Arial", Font.PLAIN, 15));
	        tuname.setSize(190, 20);
	        tuname.setLocation(200, 200);
	        c.add(tuname);
	        
	        password = new JLabel("Password");
	        password.setFont(new Font("Arial", Font.PLAIN, 20));
	        password.setSize(100, 20);
	        password.setLocation(100, 250);
	        c.add(password);
	  
	        tpassword = new JPasswordField();
	        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
	        tpassword.setSize(190, 20);
	        tpassword.setLocation(200, 250);
	        c.add(tpassword);
	        
	        email = new JLabel("Email");
	        email.setFont(new Font("Arial", Font.PLAIN, 20));
	        email.setSize(100, 20);
	        email.setLocation(100, 300);
	        c.add(email);
	  
	        temail = new JTextField();
	        temail.setFont(new Font("Arial", Font.PLAIN, 15));
	        temail.setSize(190, 20);
	        temail.setLocation(200, 300);
	        c.add(temail);
	  
	        mno = new JLabel("Mobile");
	        mno.setFont(new Font("Arial", Font.PLAIN, 20));
	        mno.setSize(100, 20);
	        mno.setLocation(100, 350);
	        c.add(mno);
	  
	        tmno = new JTextField();
	        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
	        tmno.setSize(190, 20);
	        tmno.setLocation(200, 350);
	        c.add(tmno);
	  
	        gender = new JLabel("Gender");
	        gender.setFont(new Font("Arial", Font.PLAIN, 20));
	        gender.setSize(100, 20);
	        gender.setLocation(100, 400);
	        c.add(gender);
	  
	        male = new JRadioButton("Male");
	        male.setFont(new Font("Arial", Font.PLAIN, 15));
	        male.setSelected(true);
	        male.setSize(75, 20);
	        male.setLocation(200, 400);
	        c.add(male);
	  
	        female = new JRadioButton("Female");
	        female.setFont(new Font("Arial", Font.PLAIN, 15));
	        female.setSelected(false);
	        female.setSize(80, 20);
	        female.setLocation(275, 400);
	        c.add(female);
	  
	        gengp = new ButtonGroup();
	        gengp.add(male);
	        gengp.add(female);
	  
	        dob = new JLabel("Birth Date");
	        dob.setFont(new Font("Arial", Font.PLAIN, 20));
	        dob.setSize(100, 20);
	        dob.setLocation(100, 450);
	        c.add(dob);
	  
	        date = new JComboBox(dates);
	        date.setFont(new Font("Arial", Font.PLAIN, 15));
	        date.setSize(50, 20);
	        date.setLocation(200, 450);
	        c.add(date);
	  
	        month = new JComboBox(months);
	        month.setFont(new Font("Arial", Font.PLAIN, 15));
	        month.setSize(60, 20);
	        month.setLocation(250, 450);
	        c.add(month);
	  
	        year = new JComboBox(years);
	        year.setFont(new Font("Arial", Font.PLAIN, 15));
	        year.setSize(60, 20);
	        year.setLocation(320, 450);
	        c.add(year);
	  
	        term = new JCheckBox("Accept Terms And Conditions.");
	        term.setFont(new Font("Arial", Font.PLAIN, 15));
	        term.setSize(250, 20);
	        term.setLocation(150, 500);
	        c.add(term);
	  
	        sub = new JButton("Submit");
	        sub.setFont(new Font("Arial", Font.PLAIN, 15));
	        sub.setSize(100, 20);
	        sub.setLocation(150, 550);
	        sub.addActionListener(this);
	        c.add(sub);
	  
	        cancel = new JButton("Cancel");
	        cancel.setFont(new Font("Arial", Font.PLAIN, 15));
	        cancel.setSize(100, 20);
	        cancel.setLocation(270, 550);
	        cancel.addActionListener(this);
	        c.add(cancel);
	  
	        res = new JLabel("");
	        res.setFont(new Font("Arial", Font.PLAIN, 20));
	        res.setSize(500, 25);
	        res.setLocation(75, 600);
	        c.add(res);
	  
	        setVisible(true);
	    }
	  
	    // method actionPerformed()
	    // to get the action performed
	    // by the user and act accordingly
	    public void actionPerformed(ActionEvent e)
	    {
	        if (e.getSource() == sub) {
	        	
	        	String genderData;
	        	
	        	 if (male.isSelected()) {
	        		 genderData = "Male";
	        	 }
	             else {
	            	 genderData = "Female";
	                }
	        	
	        	 String dob = (String)date.getSelectedItem() + "/" 
	        	 + (String)month.getSelectedItem()+ "/" + (String)year.getSelectedItem();
	        	 
	            if (term.isSelected()) {
	            	register = new Registration(tfname.getText(), tlname.getText(), tuname.getText(), 
	            			tpassword.getText(), temail.getText(), tmno.getText(), genderData, dob);
	                
	            }
	            else {
	                res.setText("Please accept the terms & conditions..");
	            }
	        }
	  
	        else if (e.getSource() == cancel) {
	            dispose();
	        }
	    }
	}
