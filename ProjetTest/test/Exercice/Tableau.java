/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 *
 */
public class Tableau {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le nombre d'éléments");
		int taille = sc.nextInt();
		int tabInt[] = new int[taille];
		int somme = 0;
		for (int i = 0; i < tabInt.length; i++) {
			System.out.println("Entrer un élément");
			int nb = sc.nextInt();
			tabInt[i] = nb;
			somme = tableau(tabInt);

		}

		System.out.println(somme);
	}

	public static int tableau(int[] tabInt) {
		int somme = 0;
		for (int nb : tabInt) {
			somme = somme + nb;
		}
		return somme;

	}
}