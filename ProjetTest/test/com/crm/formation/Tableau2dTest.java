/**
 * 
 */
package com.crm.formation;

/**
 * @author Sylvain Torrenti
 *
 */
public class Tableau2dTest {

	public static void main(String[] args) {
		// déclaration d'un tableau 2D
		int[][] tab2D = new int[2][3];
		// Déclaration avec initialisation
		int[][] tab2Dim = { { 0, 1, 2 }, { 4, 5, 5 } };
		// Accès aux éléments
		System.out.println("élément [0][0] : " + tab2Dim[0][0]);
		System.out.println("élément [1][2] : " + tab2Dim[1][2]);

//		modifiction
		tab2Dim[1][2] = 6;
		System.out.println("élément [1][2] après modif : " + tab2Dim[1][2]);
		System.out.println(tab2Dim[0]);
		System.out.println(tab2D[0][1]);

//		taille du tableau
		System.out.println("taille du tableau : " + tab2Dim.length);

//	nombre colone
		System.out.println("nombre collone : " + tab2Dim[0].length);

		int[][] tab2Dvar1 = new int[3][];
		tab2Dvar1[0] = new int[1];
		tab2Dvar1[1] = new int[2];
		tab2Dvar1[2] = new int[1];
		tab2Dvar1[0][0] = 1;
		tab2Dvar1[1][0] = 1;
		tab2Dvar1[1][1] = 1;
		tab2Dvar1[2][0] = 1;

//		parcour du tableau
		for (int i = 0; i < tab2Dvar1.length; i++) {
			for (int j = 0; j < tab2Dvar1[i].length; j++) {
				System.out.print(tab2Dvar1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n\n");

		int[][] tab2var2 = { { 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
		for (int i = 0; i < tab2var2.length; i++) {
			for (int j = 0; j < tab2var2[i].length; j++) {
				System.out.print(tab2var2[i][j]);
			}
			System.out.println();
		}
	}
}


