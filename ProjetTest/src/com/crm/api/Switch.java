package com.crm.api;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chiffre entre 1 et 9.");
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
		case 6:
			System.out.println("Vous avez entrez 6");
			break;
		case 7:
			System.out.println("Vous avez entrez 7");
			break;
		case 8:
			System.out.println("Vous avez entrez 8");
			break;
		case 9:
			System.out.println("Vous avez entrez 9");
			break;
		default:
			System.out.println("Un chiffre entre 1 et 9 on a dit!");
			break;
		}

	}

}
