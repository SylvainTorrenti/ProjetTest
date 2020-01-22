/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */
public class ReductionTrainIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir votre age");
		int age = sc.nextInt();
		sc.close();
		if (age >= 50) {
			System.out.println("Vous droit à une réduction de 30%");
		} else {
			if (age <= 25) {
				System.out.println("Vous avez droit à une réduction de 50%");
			} else {
				System.out.println("Vous n'avez droit à aucune reduction");
			}

		}

	}
}
