/**
 * 
 */
package com.crm.bo;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
public class CompteBancaire3 {

	final private int DECOUVERT = -150;
	private int solde, retrait, depot;
	private String numeroCompte;
	private int compteur = 0;

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public int getRetrait() {
		return retrait;
	}

	public void setRetrait(int retrait) {
		this.retrait = retrait;
	}

	public int getDepot() {
		return depot;
	}

	public void setDepot(int depot) {
		this.depot = depot;
	}

	public void detail() {
		System.out.println("le numero du compte est " + numeroCompte);
		System.out.println("Le solde est de " + solde + " le retrait est de " + retrait + " le depot est de  " + depot);
	}

	public CompteBancaire3() {

		compteur++;
		this.numeroCompte = String.format("%010d", compteur);

	}

}