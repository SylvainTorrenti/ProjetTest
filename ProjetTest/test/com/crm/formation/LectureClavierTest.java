/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 *  Lecture
 * 			Test de la lecture du clavier.
 */
public class LectureClavierTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot :(café, thé ou verveine)");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
		sc.close();
	}

}
