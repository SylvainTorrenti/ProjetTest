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
public class CompteBancaire {
	private int numeroCompte;
	private int solde;
	private char reponse;
	private static char reponse2;
	private int DECOUVERT = -150;

	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public static void creerCompte() {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous créer un nouveau compte ? O/N");
		reponse2 = sc.nextLine().charAt(0);
		while (reponse2 == 'O') {
			String nombre = String.format("%010d", i);
			System.out.println("Votre numéro de compte est " + nombre);
			i++;
			System.out.println("Voulez vous créer un nouveau compte ? O/N");
			reponse2 = sc.nextLine().charAt(0);
		}
	}
	public static void numeroDeCompte() {
		String nombre = String.format("%010d", 1);
		System.out.println("Votre numéro de compte est " + nombre);
	}
	public void retrait() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous faire un retrait? O/N");
		reponse = sc.nextLine().charAt(0);
		if (reponse == 'O') {
			System.out.println("Indiquez la somme que vous voulez retirer :");
			int somme = sc.nextInt();
			int solde2 = solde - somme;
			if (solde2 < (DECOUVERT)) {
				int reste = 150 + solde;
				System.out.println("Le decouvert autorisé est de " + DECOUVERT);
				System.out.println("Vous ne pouvez retirer que : " + reste);
			} else {
				System.out.println("Le nouveau solde est de : " + solde2);
			}
		}
	}
	public void depot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez faire un dépot? O/N");
		reponse = sc.nextLine().charAt(0);
		if (reponse == 'O') {
			System.out.println("Indiquez la somme que vous voulez déposer :");
			int depot = sc.nextInt();
			solde = solde + depot;
			System.out.println("Le nouveau solde est de : " + solde);
		}
	}
}
