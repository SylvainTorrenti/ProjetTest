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
	protected Date dateNaissance;

//	Constructeurs
	public Personne() {
		nom = "";
		prenom = "";
		surnom = "";
		System.out.println("Construction d'une objet personne (sans param)");
	}
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

//	getter setter
	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

//	Méthodes	

	public void afficherDetail() {
		System.out.println(prenom + " " + nom + "(" + surnom + ")");

	}

	public void date() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime maintenant = LocalDateTime.now();
		System.out.println("La date est : " + date.format(maintenant));

	}
}
