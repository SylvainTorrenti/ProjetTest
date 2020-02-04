/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 4 févr. 2020
 */
import com.crm.bo.Personne;

public class PersonneTabApp {

	public static void main(String[] args) {
		// Déclaration des variables
		Scanner sc = new Scanner(System.in);
		int nbPersonne = 0;
		System.out.println("Veuillez saisir le nombre de personne :");
		nbPersonne = Integer.parseInt(sc.nextLine());
		Personne[] tabPersonne = new Personne[nbPersonne];

		// Initialisation
		for (int i = 0; i < tabPersonne.length; i++) {
			tabPersonne[i] = new Personne();
			System.out.println("Veuillez saisir le prenom de la " + (i + 1) + " personne :");
			tabPersonne[i].setPrenom(sc.nextLine());
			System.out.println("veuillez saisir le nom de la " + (i + 1) + " personne");
			tabPersonne[i].setNom(sc.nextLine());
			System.out.println("veuillez saisir le surnom de la " + (i + 1) + " personne");
			tabPersonne[i].setSurnom(sc.nextLine());
			// Parcours du tableau
		}
		for (int i = 0; i < tabPersonne.length; i++) {
			tabPersonne[i].afficherDetail();
		}
		sc.close();
	}
}
