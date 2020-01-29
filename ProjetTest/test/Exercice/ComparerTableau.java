/**
 * 
 */
package Exercice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 *
 */
public class ComparerTableau {

	public static void main(String[] args) {
//		int arr1[] = { 1, 2, 3 };
//		int arr2[] = { 1, 2, 3 };

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer le nombre d'éléments du tableau");
		int taille = sc.nextInt();
		int arr1[] = new int[taille];
		for (int y = 0; y < arr1.length; y++) {
			System.out.println("Entrer un élément");
			int nb = sc.nextInt();
			arr1[y] = nb;
		}

		System.out.println("entrer le nombre d'éléments du tableau");
		int taille1 = sc.nextInt();
		int arr2[] = new int[taille1];
		for (int z = 0; z < arr2.length; z++) {
			System.out.println("Entrer un élément");
			int nb = sc.nextInt();
			arr2[z] = nb;
			
		}sc.close();
		if (Arrays.equals(arr1, arr2))
			System.out.println("Pareil");
		else
			System.out.println("Different");

	}
}
