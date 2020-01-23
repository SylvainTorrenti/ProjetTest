package com.crm.api;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param palindrome
 * 		definit si un mot est un palindrome ou pas.
 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez saisir un mot.");
		String nom = sc.nextLine();
		sc.close();
		String nom1 = new StringBuilder(nom).reverse().toString();

		if (nom.equals(nom1)) {
			System.out.println(nom + " est un palindrome.");
		} else {
			System.out.println(nom + " n'est pas un palindrome.");

		}

	}
}
