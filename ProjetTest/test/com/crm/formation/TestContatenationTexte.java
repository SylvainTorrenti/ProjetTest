package com.crm.formation;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 *contatenation
 * 		Test de la contenation de texte.
 */
public class TestContatenationTexte {

	public static void main(String[] args) {
		String nom = " Dupont";
		String prenom = "Paul";
		String nomComplet;
		
		nomComplet = prenom +""+ nom;
		
		String nomComplet2 = prenom +"";
		nomComplet2 += nom;
		
		System.out.println(nomComplet);
		System.out.println(nomComplet2);

	}

}
