package com.crm.api;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez une formation qualifiante parmi les propositions suivantes :\n"+"(C) : CDA\n"+"(R) : Réorientation\n"+"(E) : En cours de réflexion");
		String str = sc.nextLine();
		sc.close();
		switch (str) {
		case "C":
			System.out.println("Vous avez choisi de suivre la formation Concepteur Développeur d'Applications");
			break;
		case "D":
			System.out.println("Vous avez choisi de suivre la formation Développeur Web et Web Mobile");
			break;
		case "R":
			System.out.println("Vous avez choisi la Réorientation");
			break;
		case "E":
			System.out.println("Vous en cours de réflexion");
			break;
		default:
			System.out.println("Vous ne suivez pas la concigne");
			break;
		}

	}

}
