package school;

import java.util.Scanner;

/**
 * @author Kimberli Smith
 *
 */
public class CodeDojoApp {

	public static void main(String[] args) {
		//variables
		boolean enroll = true;
		String course;
		
		
		Scanner k = new Scanner(System.in); //open Scanner k to accept input data
		
		System.out.println("Welcome to Grant Chirpus's Code Dojo!  We offer a variety of classes, designed to pave ");
		System.out.println("the way for an exciting career in technology.  Enter  'enroll' at any time to join a class!" );
		
		while(enroll){// sets trigger word 'enroll' to skip to enrollment process of program
			System.out.println("Enter the name of the class you would like to enroll in:  ");
			course=k.nextLine();
			
			switch(course){//open course switch
			//case Java:
				
			}//close course switch
			
		}//ends while loop for enrollment
		
		k.close(); //closes Scanner k
	}//end pvsm

}//end CodeDojoApp class
