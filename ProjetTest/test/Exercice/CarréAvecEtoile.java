package Exercice;

import java.util.Scanner;

public class CarréAvecEtoile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la longueur:");
		int longueur = sc.nextInt();
		int i;
		for (i = 0; i < longueur; i++) {
			
			System.out.print("*");
			System.out.println();


		}

	}
}
