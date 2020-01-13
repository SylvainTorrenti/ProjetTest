/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Identifiant {

	/**
	 * @param args
	 */
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
