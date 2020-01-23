package com.crm.api;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Jour de la semaine
 * 			Donne le jour de la semaine en anglais correspondant au français.
 */

import java.util.Scanner;

public class JourDeLaSemaineAnglais {

	public static void main(String[] args) {
		String[] jSemaineA = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String[] jSemaine = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un jour de la semaine:");
		String jour = sc.nextLine();
		sc.close();

//		if (jour.equals(jSemaine[0])) {
//			System.out.println(jSemaineA[0]);
//		}else if (jour.equals(jSemaine[1])) {
//			System.out.println(jSemaineA[1]);
//		}else if (jour.equals(jSemaine[2])) {
//			System.out.println(jSemaineA[2]);
//		}else if (jour.equals(jSemaine[3])) {
//			System.out.println(jSemaineA[3]);
//		}else if (jour.equals(jSemaine[4])) {
//			System.out.println(jSemaineA[4]);
//		}else if (jour.equals(jSemaine[5])) {
//			System.out.println(jSemaineA[5]);
//		}else if (jour.equals(jSemaine[6])) {
//			System.out.println(jSemaineA[6]);
//		}else {
//			System.out.println("Erreur");
//		}
//		
		for (int i = 0; i < jSemaine.length; i++) {
			if (jSemaine[i].equals(jour)) {
				System.out.println(jSemaineA[i]);
				break;
			}
			
			if (i == jSemaine.length-1) {
				System.out.println("Erreur");
			}
		}
	}
}
