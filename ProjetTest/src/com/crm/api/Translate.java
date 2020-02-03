/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 29 janv. 2020
 */
public class Translate {

	public static void main(String[] args) {
		String traduction = "";
		String[] fr = { "la", "formation", "est", "bien", "gabi", "un", "robot" };
		String[] en = { "the", "formation", "is", "good", "gabi", "a", "robot" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une phrase en Français:");
		String phrase = sc.nextLine();
		String[] phrasesplit= phrase.split(" ");

		sc.close();

		for (int i = 0; i < fr.length; i++) {
			if (fr[i].equalsIgnoreCase(en[i])) {

				traduction = traduction + " " + en[i];
			}
			
		}
		traduction = traduction.trim();
		System.out.println(traduction);
	}
}