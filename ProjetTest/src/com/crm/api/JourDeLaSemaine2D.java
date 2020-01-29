/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 *
 */
public class JourDeLaSemaine2D {

	public static void main(String[] args) {
		String[][] jour = { { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" } };
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un jour de la semaine:");
		String jour1 = sc.nextLine();
		sc.close();
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
}
