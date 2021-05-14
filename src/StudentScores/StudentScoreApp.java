package StudentScores;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Collections;

public class StudentScoreApp {

	public static void main(String[] args) {

		String message = " Welcome ";

		System.out.println(message);

		Scanner userGrade = new Scanner(System.in);

		ArrayList<Integer> gradeList = new ArrayList<Integer>();

		while (true) {

			System.out.println("Please enter your grade");

			gradeList.add(userGrade.nextInt());

			System.out.println("Would You like to enter another grade? "); // Request user input

			String userSaid = userGrade.next().toLowerCase(); // Read user input

			if (userSaid.startsWith("y")) {

				continue; // Request user input
			} else {
				System.out.println(" Thank You ");
				break;
			}
		}

		int highestGrade = Collections.max(gradeList);
		int lowestGrade = Collections.min(gradeList);

		Integer sum = 0;

		for (Integer grade : gradeList) {
			sum = sum + grade;

		}
		double averageGrade = sum / (double) gradeList.size();

		Integer aStudents = 0;
		Integer bStudents = 0;
		Integer cStudents = 0;
		Integer fStudents = 0;

		for (Integer grade : gradeList) {
			if (grade > 89)
				aStudents++;

			if (grade > 79 && grade < 90)
				bStudents++;

			if (grade > 69)
				cStudents++;

			if (grade <= 69)
				fStudents++;
		}

		String highestGradePrint = " Your highest grade is :" + highestGrade;
		String lowestGradePrint = " Welcome ";
		String message = " Welcome ";
		String message = " Welcome ";
		String message = " Welcome ";
		String message = " Welcome ";
		String message = " Welcome ";
	}
}