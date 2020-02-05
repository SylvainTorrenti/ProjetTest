/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Personne;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
public class PersonneAppBis {

	
	public static void main(String[] args) {
		
		Personne pers2 = new Personne();
		pers2.afficherDetail();
		
		Personne pers3 = new Personne("bob","dylan");
		pers3.afficherDetail();

	}

}
