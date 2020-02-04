/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Personne;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 3 févr. 2020
 */
public class PersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne();
		pers.surnom = "xXxD4RkLe0NaxXx";
		pers.setNom("Torrenti");

		pers.setPrenom("Sylvain");
		System.out.println("Vous êtes avec " + pers.getPrenom() + " " + pers.getNom() + " (" + pers.surnom + ")");

	}

}
