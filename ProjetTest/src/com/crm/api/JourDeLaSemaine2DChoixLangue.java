/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 *
 */
public class JourDeLaSemaine2DChoixLangue {

	public static void main(String[] args) {
		String[][] jour = { { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" } };
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la langue de départ:");
		String langue = sc.nextLine();

		if (langue.equalsIgnoreCase("Français")) {
			System.out.println("Entrez un jour de la semaine en Français:");
			String jour1 = sc.nextLine();
			for (int i = 0, y = 0; y < jour[0].length; y++) {
				if (jour[i][y].equalsIgnoreCase(jour1)) {
					System.out.println(jour[i + 1][y]);
					break;
				}

				if (y == jour[1].length - 1) {
					System.out.println("Erreur");
				}
			}
		}
		if (langue.equalsIgnoreCase("Anglais")) {
			System.out.println("Entrez un jour de la semaine en Anglais:");
			String jour1 = sc.nextLine();
			for (int i = 1, y = 0; y < jour[0].length; y++) {
				if (jour[i][y].equalsIgnoreCase(jour1)) {
					System.out.println(jour[i - 1][y]);
					break;
				}

				if (y == jour[1].length - 1) {
					System.out.println("Erreur");
				}
			}
		}
	}
}
