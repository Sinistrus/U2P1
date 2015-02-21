import java.util.*;

public class U2P1 {

	Scanner keyboard = new Scanner(System.in);
	
	/*This class holds all the necessary variables and methods for the diver score program.
	 * I have separated it into two classes because I did not want to make static calls to 
	 * all these functions. I also believe that object oriented code should have separation
	 * between the data and the execution. This class is purely to hold the data, the other 
	 * class is to execute the functions and pass variables where needed. 
	 * */
	
	public double DegreeOfDifficulty = 0;
	
	
	public double inputValidScore(double testScore) {
		double validScore = 0;

		while (!(testScore >= 0 && testScore <= 10)) {

			System.out.println("Please enter a valid score between 0 and 10");
			testScore = keyboard.nextDouble();

		}

		validScore = testScore;
		return validScore;

	}

	public double inputValidScore() {
		double validScore = 0;

		validScore = Math.random() * 11;

		if (validScore > 10) {

			validScore = Math.floor(validScore);
		}

		validScore = Math.floor(validScore * 100) / 100;

		return validScore;
	}

	public double[] inputAllScores() {

		double[] returnArray = new double[7];

		for (int i = 0; i < 7; i = i + 1) {
			returnArray[i] = inputValidScore();
		}

		return returnArray;
	}

	public double inputValidDegreeOfDifficulty(double testDoD) {
		double validDoD = 0;

		while (!(testDoD >= 1.2 && testDoD <= 3.8)) {

			System.out.println("Please enter a valid Degree of Difficulty");
			testDoD = keyboard.nextDouble();

		}

		validDoD = testDoD;

		return validDoD;

	}

	public double inputValidDegreeOfDifficulty() {
		double validDoD = 0;

		validDoD = (1.2 + (Math.random() * 3.7));

		if (validDoD > 3.6) {
			validDoD = 3.6;
		}

		return validDoD;
	}

	public double[] sortAndRemove(double[] sortArray) {

		for (int i = 0; i < sortArray.length - 1; i = i + 1) {

			for (int j = 0; j < (sortArray.length - 1) - i; j = j + 1) {

				if (sortArray[j + 1] < sortArray[j]) {

					double holder = sortArray[j];
					sortArray[j] = sortArray[j + 1];
					sortArray[j + 1] = holder;

				}

			}

		}

		double[] newArray = new double[sortArray.length - 2];

		for (int i = 0; i < newArray.length; i = i + 1) {

			newArray[i] = sortArray[i + 1];

		}

		return newArray;
	}

	public double calculateScore(double[] calculateArray) {
		double finalScore = 0;
		double sum = 0;
		
		if (DegreeOfDifficulty == 0) {
			
			DegreeOfDifficulty = inputValidDegreeOfDifficulty();
		}	/*if the degree of difficulty has not been set, this will generate		
			 a degree of difficulty.*/
		

		calculateArray = this.sortAndRemove(calculateArray);

		for (int i = 0; i < calculateArray.length; i = i + 1) {

			sum = sum + calculateArray[i];

		}

		finalScore = (DegreeOfDifficulty * sum) *.6;
		
		

		return finalScore;
	}

}
