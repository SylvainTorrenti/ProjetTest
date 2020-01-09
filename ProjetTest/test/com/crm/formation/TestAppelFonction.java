package com.crm.formation;

import java.util.Scanner;

public class TestAppelFonction {

	public static void main(String[] args) {
		double surface;

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir le rayon :");
		double rayon = sc.nextDouble();
		surface = Utils2.surface2(rayon);

		System.out.println("L'air du cercle est de: " + surface);

	}

}
