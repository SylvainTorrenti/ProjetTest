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

//		Personne pers2 = new Personne();
//		pers2.afficherDetail();

//		déclenche une exception aprés déférencement
//		pers2 = null;
//		System.out.println(pers2.getNom());

		int a = 5;
		int b = 5;
		if (a == b) {
			System.out.println("Les 2 entiers sont identiques");
		}

		Personne pers4 = new Personne("khalil", "charih");
		Personne pers5 = new Personne("khalil", "charih");
		if (pers4.isEquals(pers5)) {
			System.out.println("Les 2 objets sont identiques");
		}

//		Personne pers3 = new Personne("bob","dylan");
//		pers3.afficherDetail();
		
		int nb=5;
		pers5.incrementeNombre(nb);
		System.out.println(nb);
		
		pers5.modifierPersonne(pers5);
		pers5.afficherDetail();

	}

}
