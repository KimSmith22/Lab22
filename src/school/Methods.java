package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
static Scanner k = new Scanner(System.in);
	public Methods() {

	
	}
	public static String testEnrollment(ArrayList<Student> roster, int course) {
		String[] classes = new String[6];
		classes[0]= "Java";
		classes[1]= "JavaScript";
		classes[2]= "Software Testing";
		classes[3]= "Networking";
		classes[4]= "Interviewing";
		classes[5]= "Web Development";
		
		String curriculum =  classes[course];
			
		if(roster.size() < 50){
			Student s = new Student();//create student object
			roster.add(s);
			System.out.println("You are now enrolled in " + (classes[course-1]));
		}else{
			System.out.println("Sorry that course is full!  Choose another course or type 'exit' to exit the application: " );
			course = k.nextInt();
		}//end else
		return curriculum;
	}//end if
	
}//end class Methods
