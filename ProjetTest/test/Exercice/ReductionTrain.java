/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ReductionTrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir votre age");
		int age = sc.nextInt();
		sc.close();
		boolean age2 = age >= 50 ? true : false;
		if (age2 == true) {
			System.out.println("Vous avez droit à une reduction de 30%!");
		}
		boolean age3 = age <= 25 ? true : false;
		if (age3 == true) {
			System.out.println("Vous avez droit à une réduction de 50%!");
		}
		if (age3 == false && age2 == false) {
			System.out.println("Vous n'avez pas droit à une réduction!");
		}
	}
}
