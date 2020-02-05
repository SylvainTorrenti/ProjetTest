/**
 * 
 */
package com.crm.bo;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
public class Rectangle {
	private float largeur;
	private float longueur;
	public Rectangle() {
	}
	public Rectangle(float largeur, float longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	public void setLargeur(float l) {
		largeur = l;
	}
	public void setLongueur(float l) {
		longueur = l;
	}
	public float getLargeur() {
		return largeur;
	}
	public float getLongueur() {
		return longueur;
	}
	public void perimetreRectangle() {
		System.out.println("Le périmetre du rectangle fait " + (longueur + largeur) * 2 + " cm");
	}
	public void surfaceRectangle() {
		System.out.println("la surface du rectangle fait " + longueur * largeur + " cm²");
	}
	public float surface() {
		return longueur * largeur;
	}
	public void compareRectangle(Rectangle rect2) {
		if(this.surface()>rect2.surface()) {
			System.out.println("le premier rectangle est plus grand");
		}else if (this.surface()==rect2.surface()) {
			System.out.println("pareil");
		}else {
			System.out.println("le deuxième rectangle est plus grand");
		}
	}
}