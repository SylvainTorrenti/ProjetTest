/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;
import com.crm.bo.Rectangle;

/**
 * @author CRM
 *
 */
public class RectangleApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la largeur du rectangle :");
		rect1.setLargeur(sc.nextFloat());
		System.out.println("Veuillez saisir la longueur du rectangle :");
		rect1.setLongueur(sc.nextFloat());
		rect1.perimetreRectangle();
		rect1.surfaceRectangle();
		Rectangle rect2 = new Rectangle();
		System.out.println("Veuillez saisir la largeur du rectangle :");
		rect2.setLargeur(sc.nextFloat());
		System.out.println("Veuillez saisir la longueur du rectangle :");
		rect2.setLongueur(sc.nextFloat());
		sc.close();
		rect2.perimetreRectangle();
		rect2.surfaceRectangle();
		rect1.compareRectangle(rect2);
	}
}