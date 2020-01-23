package com.crm.formation;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param appel
 * 		Test appel de fonction.
 */
import java.util.Scanner;

public class TestAppelFonction {

	public static void main(String[] args) {
		double surface;

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir le rayon :");
		double rayon = sc.nextDouble();
		surface = Utils2.surface2(rayon);
		sc.close();

		System.out.println("L'air du cercle est de: " + surface);

	}

}
