/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */
public class NoteCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserez votre note:");
		float note = sc.nextFloat();
		if (note < 8) {
			
			System.out.println("Vous êtes ajourné!");

		} else {
			if (note < 10) {
				System.out.println("Vous êtes aux ratrapages");
			} else {
				if (note < 12) {
					System.out.println("Vous êtes admis");
				} else {
					if (note < 14) {
						System.out.println("Vous êtes admis avec la mention AB");
					} else {
						if (note < 16) {
							System.out.println("Vous êtes admis avec la mention B");
						} else {
							if (note >= 16) {
								System.out.println("Vous êtes admis avec la mention TB");
							}
						}

					}
					sc.close();
				}
			}
		}
	}
}
