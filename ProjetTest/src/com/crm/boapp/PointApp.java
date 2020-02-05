/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Point;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
public class PointApp {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbPoint = 0;
		System.out.println("Veuillez saisir le nombre de point :");
		nbPoint = Integer.parseInt(sc.nextLine());
		Point[] tabPoint = new Point[nbPoint];
		for (int i = 0; i < tabPoint.length; i++) {
			tabPoint[i] = new Point();
			System.out.println("Veuillez saisir l'abscisse du " + (i + 1) + " point :");
			tabPoint[i].setAbscisseA(sc.nextFloat());
			System.out.println("veuillez saisir l'ordonnée du " + (i + 1) + " point :");
			tabPoint[i].setOrdonneeA(sc.nextFloat());
			
			// Parcours du tableau
		}
		for (int i = 0; i < tabPoint.length; i++) {
			tabPoint[i].afficherDetail(i);
		}
		
		sc.close();
	}
}