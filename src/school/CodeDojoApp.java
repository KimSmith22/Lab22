package school;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kimberli Smith
 *
 */
public class CodeDojoApp {

	public static void main(String[] args) {
		//variables
		boolean enroll = true;
		int course = 0;
		int register = 0;
		String choice = "y";
	
		ArrayList <String> students = new ArrayList<String>();
		
		Scanner k = new Scanner(System.in); //open Scanner k to accept input data
		
		System.out.println("Welcome to Grant Chirpus's Code Dojo!  We offer a variety of classes, designed to pave ");
		System.out.println("the way for an exciting career in technology.  Enter 1 to join a class or 2 to exit" );
		register = k.nextInt();
		
		System.out.println();
		while(choice.equalsIgnoreCase("y")){
		switch(register){// sets trigger word 'enroll' to skip to enrollment process of program
		case 1:
			System.out.println("Enter the name of the class you would like to enroll in:  1 for Java, 2 for JavaScript, 3 for Software Testing,");
			System.out.println("4 for Networking, 5 for Interviewing, or 6 for Web Development:   ");
			course=k.nextInt();
				if(course < 1 || course > 6){
					System.out.println("Invalid selection, press 1 for Java, 2 for JavaScript, 3 for Software Testing, 4 for Networking, 5 for Interviewing, or 6 for Web Development:   ");
					course = k.nextInt();
				}
				break;
		case 2:
			System.out.println("Thank you for checking out Grant Chirpus today, Goodbye!!");
			break;
		}//ends while loop for enrollment
			switch(course){//course switch
			case 1:
				if(students.size() < 50){
					System.out.println("You are now enrolled in Java");
				}else{
					System.out.println("Sorry that course is full!  Choose another course or type 'exit' to exit the application: " );
					course = k.nextInt();
				}
				break;
			case 2:
				if(students.size()< 50){
					System.out.println("You are now enrolled in JavaScript");
				}else{
					System.out.println("Sorry that course is full!  Choose another course or type 'exit' to exit the application: " );
					course = k.nextInt();
				}
				break;
			case 3:
				if(students.size()< 50){
					System.out.println("You are now enrolled in Software Testing");
				}else{
					System.out.println("Sorry that course is full!  Choose another course or type 'exit' to exit the application: " );
					course = k.nextInt();
				}
				break;
			case 4:
				if(students.size()< 50){
					System.out.println("You are now enrolled in Networking");
				}else{
					System.out.println("Sorry that course is full!  Choose another course or type 'exit' to exit the application: " );
					course = k.nextInt();
				}
				break;
			case 5:
				if(students.size()< 50){
					System.out.println("You are now enrolled in Interviewing");
				}else{
					System.out.println("Sorry that course is full!  Choose another course or type 'exit' to exit the application: " );
					course = k.nextInt();
				}
				break;
			case  6:
				if(students.size()< 50){
					System.out.println("You are now enrolled in Web Development");
				}else{
					System.out.println("Sorry that course is full!  Choose another course or type 'exit' to exit the application: " );
					course = k.nextInt();
				}
				break;
			}//end course switch		
			k.nextLine();
			System.out.println();
			System.out.println("Would you like to enroll in another class? y/n");
			choice = k.nextLine();
				if(choice.equalsIgnoreCase("n")){
					System.out.println("Goodbye!!");
				}
		}//end while loop to allow user to select more than one class
		k.close(); //closes Scanner k
	}//end pvsm

}//end CodeDojoApp class
