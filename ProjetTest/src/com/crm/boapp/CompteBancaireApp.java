/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.CompteBancaire;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
class CompteBancaireApp {

	public static void main(String[] args) {
		CompteBancaire cb = new CompteBancaire();
		Scanner sc = new Scanner(System.in);
		CompteBancaire.creerCompte();
		System.out.println("Veuillez saisir le solde :");
		cb.setSolde(sc.nextInt());
		cb.retrait();
		cb.depot();
		
	}
}