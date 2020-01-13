package com.crm.api;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chiffre entre 1 et 5.");
		int str = sc.nextInt();
		sc.close();
		switch (str) {

		case 1:
			System.out.println("Vous avez entrez 1");
			break;
		case 2:
			System.out.println("Vous avez entrez 2");
			break;
		case 3:
			System.out.println("Vous avez entrez 3");
			break;
		case 4:
			System.out.println("Vous avez entrez 4");
			break;
		case 5:
			System.out.println("Vous avez entrez 5");
			break;
		}

	}

}
