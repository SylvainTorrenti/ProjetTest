/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.CompteBancaire3;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
class CompteBancaireApp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CompteBancaire3[] cb = new CompteBancaire3[3];

		for (int i = 0; i <= cb.length; i++) {
			cb[i] = new CompteBancaire3();

			System.out.println("Veuillez saisir le solde:");
			cb[i].setSolde(sc.nextInt());
			System.out.println("Veuillez saisir le retrait voulu:");
			cb[i].setRetrait(sc.nextInt());
			System.out.println("veuillez saisir le dépot voulu:");
			cb[i].setDepot(sc.nextInt());
			cb[i].detail();

		}
	}
}