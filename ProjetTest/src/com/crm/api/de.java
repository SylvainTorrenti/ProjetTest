package com.crm.api;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */

import java.util.Scanner;

public class de {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nom du premier joueur:");
		String joueur1 = sc.nextLine();
		System.out.println("Entrez le nom du deuxiéme joueur:");
		String joueur2 = sc.nextLine();
		sc.close();
		int a1, a2;
		a1 = 0;
		a2 = 0;

		for (int i = 0; i < 3; i++) {

			int resultat = (int) (Math.random() * (6));

			if (resultat == 6) {
				resultat = (int) (Math.random() * (6)) + 6;
			}
			while (resultat == 0) {
				resultat = (int) (Math.random() * (6));
			}
			System.out.println(joueur1 + " a fait: " + resultat);

			int resultat1 = (int) (Math.random() * (6));
			if (resultat1 == 6) {
				resultat1 = (int) (Math.random() * (6)) + 6;
			}
			while (resultat1 == 0) {
				resultat1 = (int) (Math.random() * (6));
			}
			System.out.println(joueur2 + " a fait " + resultat1);
			if (resultat > resultat1) {
				System.out.println(joueur1 + " gagne!");

				a1++;

			} else if (resultat < resultat1) {
				System.out.println(joueur2 + " gagne!");

				a2++;
			} else {
				System.out.println("Il y a égalité!");
			}

		}
		if (a1 < a2) {
			System.out.println(joueur2 + " a gagné " + a2 + " à " + a1);
		} else if (a1 > a2) {
			System.out.println(joueur1 + " a gagné " + a1 + " à " + a2);
		} else {
			System.out.println("Il y a égalié!");
		}

	}
}
