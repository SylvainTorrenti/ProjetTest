/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Film;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 4 févr. 2020
 */
public class FilmApp {
	public static void main(String[] args) {
		int année = 0;
		Film film = new Film();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom du film:");

		film.setNom(sc.nextLine());
		System.out.println("Veuillez saisir l'année de réalisation:");
		année = Integer.parseInt(sc.nextLine());
		film.setAnnée(année);

		System.out.println("Veuillez saisir la classification:");
		film.setClassification(sc.nextLine());
		film.afficherDetail();
		sc.close();
	}

}
