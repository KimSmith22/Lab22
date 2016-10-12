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
	
		ArrayList <Student> javaStudents = new ArrayList<Student>();
		ArrayList <Student> javaScriptStudents = new ArrayList<Student>();
		ArrayList <Student> softwareTestingStudents = new ArrayList<Student>();
		ArrayList <Student> networkingStudents = new ArrayList<Student>();
		ArrayList <Student> interviewingStudents = new ArrayList<Student>();
		ArrayList <Student> webDevelopmentStudents = new ArrayList<Student>();


		Scanner k = new Scanner(System.in); //open Scanner k to accept input data
		
		System.out.println("Welcome to Grant Chirpus's Code Dojo!  We offer a variety of classes, designed to pave ");
		System.out.println("the way for an exciting career in technology.  Enter 1 to join a class or 2 to exit" );
		register = k.nextInt();
		
		while(choice.equalsIgnoreCase("y")){
		String message1 = "\n Hard Skills:\n"+
				"Java:  " + javaStudents.size() + "\n" +
				"JavaScript:  " + javaScriptStudents.size() + "\n" +
				"Web Development:  " + (javaScriptStudents.size()) + "\n" +
				"Software Testing:  " + javaScriptStudents.size() + "\n";
		System.out.println(message1);
		
		String message2 = "Soft Skills:\n"+
				"Interviewing:  " + javaScriptStudents.size() +"\n"+
				"Networking:  " + javaScriptStudents.size() + "\n";
		System.out.println();
		System.out.println(message2);
		
		System.out.println();
	
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
				Methods.testEnrollment(javaStudents, course);
				break;
			case 2:
				Methods.testEnrollment(javaScriptStudents, course);
				break;
			case 3:
				Methods.testEnrollment(softwareTestingStudents, course);
				break;
			case 4:
				Methods.testEnrollment(networkingStudents, course);
				break;
			case 5:
				Methods.testEnrollment(interviewingStudents, course);
				break;
			case  6:
				Methods.testEnrollment(webDevelopmentStudents, course);
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
