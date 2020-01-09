package com.crm.formation;

import java.util.Scanner;

public class TestAppelFonction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double surface = 0;

		System.out.println("Veuillez inserer le rayon:");
		double rayon = sc.nextDouble();
		surface = Math.pow(rayon, 2) * Math.PI;
		System.out.println(surface);

	}

}
