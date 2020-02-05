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
	private float longueur;
	private float largeur;

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public void calculSurface() {
		System.out.println("La surface du rectangle est de " + (largeur * longueur));
	}

	public void calculPerim() {
		System.out.println("Le périmétre du rectangle est de " + ((largeur+longueur)*(largeur+longueur)));
	}
}
