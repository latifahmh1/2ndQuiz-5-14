package StudentScores;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Collections;

public class StudentScoreApp {

	public static void main(String[] args) {

		String message = " Welcome"
				+ "   ";

		System.out.println(message);

		Scanner userGrade = new Scanner(System.in);

		ArrayList<Integer> gradeList = new ArrayList<Integer>();

		while (true) {

			System.out.println("Please enter your grade");

			gradeList.add(userGrade.nextInt());

			System.out.println("Would You like to enter another grade? ");

			String userSaid = userGrade.next().toLowerCase(); 

			if (userSaid.startsWith("y")) {

				continue;
			} else {
				System.out.println(" Thank You"
						+ "   ");
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
		Integer dStudents = 0;
		Integer fStudents = 0;

		for (Integer grade : gradeList) {
			
			if (grade > 89)
				aStudents++;

			if (grade > 79 && grade < 90)
				bStudents++;

			if (grade > 69 && grade < 80)
				cStudents++;

			if (grade > 69 && grade < 71)
				dStudents++;

			if (grade > 0 && grade < 70)
				fStudents++;
		 continue;
		}

		String highestGradePrint;
		String lowestGradePrint;
		String averageGradePrint;
		 String messageA;
		String messageB;
		String messageC;
		String messageD;
		String messageF;
		
		System.out.println( highestGradePrint = " The highest grade is : " + highestGrade);
		System.out.println( lowestGradePrint = (" The lowest grade is : " + lowestGrade));
		System.out.println( averageGradePrint = " The average grade is : " + averageGrade);
		System.out.println( messageA = " The Number of A's : " + aStudents);
		System.out.println( messageB= " The Number of B's : " + bStudents);
		System.out.println( messageC = " The Number of C's "+ cStudents);
		System.out.println( messageD = " The Number of D's "+ dStudents);
		System.out.println( messageF = " The Number of F's :  " + dStudents);
	}
}


