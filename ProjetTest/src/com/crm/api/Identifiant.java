/**
 * 
 */
package com.crm.api;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Login
 * 			Verifie que le le Login est : CRM et le mdp: CDI1234.
 */

import java.util.Scanner;

public class Identifiant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre login:");
		String login = sc.nextLine();
		sc.close();
		if (login.contentEquals("CRM")) {
			System.out.println("Entrez votre mot de passe:");
			String mdp = sc.nextLine();
			if (mdp.contentEquals("CDI1234")) {
				System.out.println("Login sucess");
			} else {
				System.out.println("Login failed");
			}

		} else {
			System.out.println("Login failed");
		}

	}

}
