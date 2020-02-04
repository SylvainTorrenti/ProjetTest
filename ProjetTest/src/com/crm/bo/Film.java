/**
 * 
 */
package com.crm.bo;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 4 févr. 2020
 */
public class Film {
	private String nom;
	private String classification;
	private int année;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public int getAnnée() {
		return année;
	}

	public void setAnnée(int année) {
		this.année = année;
	}

	public void afficherDetail() {
		System.out.println(
				"Le film : " + nom + " a été réalisé en " + année + " avec la classification " + classification);
	}
}
