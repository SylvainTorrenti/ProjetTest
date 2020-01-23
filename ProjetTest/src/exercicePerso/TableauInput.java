/**
 * 
 */
package exercicePerso;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * Tableau avec input
 * 			Test de créé un tableau avec un input.
 */
public class TableauInput {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Entrez le nombre d'éléments:");

		int n = s.nextInt();

		String arr[] = new String[n];

		System.out.println("Entrez votre Nom et Prenom:");
		String nom = s.nextLine();
		arr[0] = nom;

		for (int i = 0; i < n; i++) {// for reading array
			String a = s.nextLine();

			arr[i] = a;

		}

		for (String i : arr) { // for printing array

			System.out.println(i);

		}

		s.close();

	}

}