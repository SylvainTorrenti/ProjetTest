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
public class PointBis {

	
	public static void main(String[] args) {
		Point re = new Point();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir l'abscisse du point A :");
		re.setAbscisseA(sc.nextFloat());
		System.out.println("Veuillez saisir l'ordonnée du point A :");
		re.setOrdonneeA(sc.nextFloat());
		re.pointA();
		System.out.println("Veuillez saisir l'abscisse du point B :");
		re.setAbscisseB(sc.nextFloat());
		System.out.println("Veuillez saisir l'ordonnée du point B :");
		re.setOrdonneeB(sc.nextFloat());
		re.pointB();
		sc.close();
		re.calculDistance();

	}

}
