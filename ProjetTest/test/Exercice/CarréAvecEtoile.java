package Exercice;

import java.util.Scanner;

public class CarréAvecEtoile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la longueur:");
		int longueur = sc.nextInt();
		int i = longueur;
		sc.close();
		do {

			System.out.print("*");
			System.out.print("");
			i--;

		} while (i != 0);
	}
}
