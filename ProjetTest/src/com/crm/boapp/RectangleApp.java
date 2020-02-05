/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
public class RectangleApp {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la largeur du rectangle:");
		rectangle.setLargeur(sc.nextFloat());
		System.out.println("Veuillez saisir le longueur du rectangle:");
		rectangle.setLongueur(sc.nextFloat());
		rectangle.calculSurface();
		rectangle.calculPerim();
		sc.close();
	}

}
