import java.util.*;

public class execute {
	
	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		//author: Sahel Khan
		//contact: sahel.khan@gmail.com
		//This is the main method to execute the program U2P1, which stands for unit 2 problem 1. 
		//The first portion of this main method will run all requirements in the Problem Statement
		

		U2P1 finalTestObject = new U2P1();
		
		System.out.println("Welcome to the Diving Score Program");
		System.out.println("The judges individual scores are as listed in the Problem Statement Directions :");
		
		double[] finalTestArray = new double[] {7.5, 9.5, 5.7, 8.25, 6.72, 10, 3.46 };
		
		for (int i = 0; i < finalTestArray.length; i = i + 1) {

			System.out.println("The Score of Judge " + (i+1) + " is " + finalTestArray[i]);

		}
		
		
		System.out.println("Using these scores, and a Degree of Difficulty of 2.7, the final calculated score is");
		
		finalTestObject.DegreeOfDifficulty = 2.7;
				
		double showFinalScore = finalTestObject.calculateScore(finalTestArray);
		
		System.out.println(showFinalScore);	
		
		
		//the following portion will demonstrate the programs ability to generate diver scores 
		//for individual judges and then calculate the final score.
		
		System.out.println("The Directions of the problem statement have been fulfilled");
		
		System.out.println();
		System.out.println("What follows now is other test conditions to show the flexibilty");
		System.out.println(" and strength of the program");
		System.out.println();
		System.out.println("Let us generate valid diver scores and display them.");
		
		finalTestArray = finalTestObject.inputAllScores();
		
		for (int i = 0; i < finalTestArray.length; i = i + 1) {

			System.out.println("The Score of Judge " + (i+1) + " is " + finalTestArray[i]);

		}
		
		System.out.println();
		System.out.println("Let us generate a valid degree of difficulty");
		
		finalTestObject.DegreeOfDifficulty = finalTestObject.inputValidDegreeOfDifficulty();
		
		System.out.println("Degree of Difficulty generated is " + finalTestObject.DegreeOfDifficulty);
		
		System.out.println();
		System.out.println("Therefore, the final calculated score is: ");
		
		
		showFinalScore = finalTestObject.calculateScore(finalTestArray);
		
		System.out.println(showFinalScore);
		
		
		


/* the following code is for testing and debugging purposes.		
 *
 * double showScore = testObject.inputValidScore(12);

		System.out.println("Valid score is: " + showScore);

		for (int i = 0; i < 100; i = i + 1) {

			System.out.println(testObject.inputValidScore());

		}

		for (int i = 0; i < 100; i = i + 1) {

			System.out.println(testObject.inputValidDegreeOfDifficulty());

		}

		double[] newArray = new double[] { 7.5, 9.5, 5.7, 8.25, 6.72, 10, 3.46 };

		newArray = testObject.sortAndRemove(newArray);

		for (int i = 0; i < newArray.length; i = i + 1) {
			System.out.println(newArray[i]);
		}
		
		*
		*end of testing and debugging code.
		*
		*/
		
		

	}

}
