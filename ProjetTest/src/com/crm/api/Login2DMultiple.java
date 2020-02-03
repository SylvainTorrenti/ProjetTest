/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 *
 */
public class Login2DMultiple {

	public static void main(String[] args) {
//		Mise en place variable
		String[][] login = { { "root", "sylvain", "gabi", "laurent", "tim" }, { "1234", "56789", "12", "21", "234" } };
		Scanner sc = new Scanner(System.in);
//		Entré login et chek true
		System.out.println("Veuillez saisir votre login:");
		String login1 = sc.nextLine();
		for (int i = 0; i < login[0].length; i++) {
			if (login[0][i].equals(login1)) {
//				Login == true + enregistrement MDP
				String mdp1 = login[1][i];
				System.out.println("Veuillez saisir votre mot de passe:");
				String mdp = sc.nextLine();
//				Veriffication mdp avec enregistrement
				if (mdp.equals(mdp1)) {

					System.out.println("Connexion reussie!");
					return;
				}else {
					System.out.println("Mauvais Mot de Passe!");
				}

			}else if (i == login[0].length-1) {
				System.out.println("Mauvais Login!");
			}

		}
	}
}