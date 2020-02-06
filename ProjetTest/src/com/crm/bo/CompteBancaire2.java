/**
 * 
 */
package com.crm.bo;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
public class CompteBancaire2 {

	private static int solde, solde2;
	private static char reponse, reponse2;
	final private static int DECOUVERT = -150;
	private static int compteur = 1;

	public static void creerCompte() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous créer un nouveau compte ? O/N");
		reponse2 = sc.next().charAt(0);
		while (reponse2 == 'O') {
			String nombre = String.format("%010d", compteur);
			System.out.println("Votre numéro de compte est " + nombre);
			compteur++;

			System.out.println("Veuillez saisir le solde :");
			solde = (sc.nextInt());

			System.out.println("Voulez vous faire un retrait? O/N");
			reponse = sc.next().charAt(0);
			if (reponse == 'O') {
				System.out.println("Indiquez la somme que vous voulez retirer :");
				int somme = sc.nextInt();
				solde2 = solde - somme;

				while (solde2 < DECOUVERT) {
					int reste = 150 + solde;
					System.out.println("Le decouvert autorisé est de " + DECOUVERT);
					System.out.println("Vous ne pouvez retirer que : " + reste);
					System.out.println("Indiquez la somme que vous voulez retirer :");
					somme = sc.nextInt();
					solde2 = solde - somme;

				}
				System.out.println("Le nouveau solde est de : " + solde2);
			}

			System.out.println("Voulez faire un dépot? O/N");
			reponse = sc.next().charAt(0);
			if (reponse == 'O') {
				System.out.println("Indiquez la somme que vous voulez déposer :");
				int depot = sc.nextInt();

				solde2 = solde2 + depot;
				System.out.println("Le nouveau solde est de : " + solde2);

			}

			System.out.println("Voulez vous créer un nouveau compte ? O/N");
			reponse2 = sc.next().charAt(0);
		}
		sc.close();
	}
}
