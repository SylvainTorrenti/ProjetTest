/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class NombrePaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre :");
		int nombre = sc.nextInt();
		sc.close();
		if (nombre%2==0) {
			System.out.println("Ce nombre est pair.");
		} else {
			System.out.println("Ce nombre est impair.");
		}
	}

}