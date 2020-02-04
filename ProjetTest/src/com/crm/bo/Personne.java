/**
 * 
 */
package com.crm.bo;

import java.util.Date;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 3 févr. 2020
 */
public class Personne {

//	Attributs
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

//	Méthodes	
	public String getNom() {
		return nom;
	}

//	méthode qui modifie la valeur de "nom"
	public void setNom(String n) {
		nom = n;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String n) {
		prenom = n;
	}

}
