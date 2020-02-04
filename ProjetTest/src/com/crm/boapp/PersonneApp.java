/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 3 févr. 2020
 */
public class PersonneApp {

	public static void main(String[] args) {
		Personne pers = new Personne();
//		String surnom = "eee";  Faire trés TRES TRES attention!!!!!!!!!!!!!!!!!
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre surnom :");
		pers.surnom = sc.nextLine();

		System.out.println("Veuillez saisir votre nom :");

		pers.setNom(sc.nextLine());

		System.out.println("Veuillez saisir votre prenom :");
		pers.setPrenom(sc.nextLine());
		sc.close();
//		System.out.println("Vous êtes avec " + pers.getPrenom() + " " + pers.getNom() + " (" + pers.surnom + ")");
		pers.afficherDetail();
		pers.date();

	}

}
