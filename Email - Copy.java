package Emailproject;
import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String collegeName="glbitm.ac.in";

	//Constructor to receive first name and last name
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("EMAIL CREATED"+ this.firstName+" "+this.lastName);
		
		//call a method asking for  adept 
		this.department=setDepartment();
		System.out.println("Department: "+this.department);
		
		//call a method that returns a password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
		
		//combine elements to generate email
		email=firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@"+department+collegeName;
		System.out.println("Your Email is: "+email);
		
		
	}

	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES \n1 for CS \n2 for IT \n3 for EC \n4 for EEE \n5 for CIVIL \n6 for MECH \n0 for NONE \n Enter department codes");
		Scanner in=new Scanner(System.in);
		int deptChoice=in.nextInt();
		if(deptChoice==1)return "CS";
		else if(deptChoice==2)return "IT";
		else if(deptChoice==3)return "EC";
		else if(deptChoice==4)return "EEE";
		else if(deptChoice==5)return "CIVIL";
		else if(deptChoice==6)return "MECH";
		else return "";
		
	}

	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password= new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return " DISPLAY NAME: "+firstName+" "+lastName+
				" COMPANY EMAIL: "+email+
				" MAILBOX CAPACITY: "+mailboxCapacity+"mb";
	}

}
