/**
 * 
 */
package com.crm.bo;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 5 févr. 2020
 */
public class Point {
	private float abscisseA, abscisseB;
	private float ordonneeA, ordonneeB;

	public float getAbscisseA() {
		return abscisseA;
	}

	public void setAbscisseA(float abscisseA) {
		this.abscisseA = abscisseA;
	}

	public float getAbscisseB() {
		return abscisseB;
	}

	public void setAbscisseB(float abscisseB) {
		this.abscisseB = abscisseB;
	}

	public float getOrdonneeA() {
		return ordonneeA;
	}

	public void setOrdonneeA(float ordonneeA) {
		this.ordonneeA = ordonneeA;
	}

	public float getOrdonneeB() {
		return ordonneeB;
	}

	public void setOrdonneeB(float ordonneeB) {
		this.ordonneeB = ordonneeB;
	}

	public void afficherDetail(int i) {

		System.out
				.println("L'abscisse du point " + (i + 1) + " est de " + abscisseA + " l'ordonnée est de " + ordonneeA);
	}

	public void pointA() {
		System.out.println("le point A se trouve en : {" + abscisseA + ", " + ordonneeA + "}");
	}

	public void pointB() {
		System.out.println("le point B se trouve en : {" + abscisseB + ", " + ordonneeB + "}");
	}

	public void calculDistance() {

		System.out.println("La distance est de : "
				+ Math.sqrt(Math.pow(abscisseB - abscisseA, 2) + Math.pow(ordonneeB - ordonneeA, 2)));
	}
}
