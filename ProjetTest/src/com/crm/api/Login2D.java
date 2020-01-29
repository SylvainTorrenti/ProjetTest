/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 *
 */
public class Login2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre login :");
		String login1 = sc.nextLine();
		
		String[][] login = { { "root" }, { "K25@ml" } };
		if (login1.equals(login[0][0])) {
			
			System.out.println("Veuillez saisir votre mot de passe :");
			String mdp1 = sc.nextLine();
			sc.close();
			if (mdp1.equals(login[1][0])) {
				System.out.println("Connexion réussie!");
				return;

			}
			System.out.println("Mot de passe faux!");
			return;
		}
		System.out.println("Login faux!");

		
	}
	

}
