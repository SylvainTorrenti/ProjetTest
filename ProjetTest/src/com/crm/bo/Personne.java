/**
 * 
 */
package com.crm.bo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
	private String detail;
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

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String n) {
		surnom = n;
	}

	public void afficherDetail() {
		System.out.println(prenom + " " + nom + "(" + surnom + ")");

	}

	public void date() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime maintenant = LocalDateTime.now();
		System.out.println("La date est : " + date.format(maintenant));

	}
}
