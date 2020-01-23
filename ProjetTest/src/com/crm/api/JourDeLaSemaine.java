package com.crm.api;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * jour de la semaine
 * 			Affiche un tableau des jours de la semaines en français.
 */

public class JourDeLaSemaine {

	public static void main(String[] args) {

		String[] jSemaine = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
		for (int i = jSemaine.length-1; i >= 0; i--) {
			System.out.println(jSemaine[i]);
		}

	}

}
