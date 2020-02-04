/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 4 févr. 2020
 */
public class TableauPersonne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbPersonne = 0;
		System.out.println("Veuillez saisir le nombre de personne :");
		nbPersonne = Integer.parseInt(sc.nextLine());
		Personne[] groupePersonne = new Personne[nbPersonne];
		for (int i = 0; i < groupePersonne.length; i++) {
			groupePersonne[i] = new Personne();
			System.out.println("Veuillez saisir le prenom de la " + (i + 1) + " personne :");
			groupePersonne[i].setPrenom(sc.nextLine());
			System.out.println("veuillez saisir le nom de la " + (i + 1) + " personne");
			groupePersonne[i].setNom(sc.nextLine());
			System.out.println("veuillez saisir le surnom de la " + (i + 1) + " personne");
			groupePersonne[i].setSurnom(sc.nextLine());
		}for (int i = 0; i < groupePersonne.length; i++) {
			groupePersonne[i].afficherDetail();
		}
		sc.close();
	}

}
