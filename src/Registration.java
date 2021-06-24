import java.io.*;
import java.util.Scanner;

public class Registration {
	
	private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private String phoneNo;
    private String gender;
    private String birthdate;
    
    public Registration(String firstName, String lastName, String userName, String password, String emailId,
			String phoneNo, String gender, String birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.birthdate = birthdate;
		
		try {
		      FileWriter write = new FileWriter("resource\\data\\registered.txt");
		      write.write(toString());
		      write.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
	public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
    @Override
    public String toString() {
        return firstName + "," + lastName + "," + userName + "," +
            password + "," + emailId + "," + phoneNo + ","+ gender + "," + birthdate;
    }
}