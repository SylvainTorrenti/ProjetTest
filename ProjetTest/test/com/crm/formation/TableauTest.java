/**
 * 
 */
package com.crm.formation;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Tableau
 * 		Test de different tableau.
 */
public class TableauTest {

	public static void main(String[] args) {
		int[] tabInt;
		tabInt = new int[5];

		int[] tabInt1 = new int[5];

		tabInt1[0] = 5;

		int tabInt2[] = { 1, 2, 3, 4, 5 };
		System.out.println(tabInt2[4]);
		System.out.println(tabInt2[0]);
		System.out.println("parcour tableau 1er version ");

		for (int i = 0; i < tabInt2.length; i++) {

			System.out.println(tabInt2[i]);

		}
		System.out.println("la taille du tableau est : " + tabInt2.length);
		System.out.println("parcour tableau 2eme version ");
		for (int nb : tabInt2) {

			System.out.println(nb);
		}

	}

}
