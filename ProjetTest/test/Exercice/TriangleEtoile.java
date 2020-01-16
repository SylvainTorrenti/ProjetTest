package Exercice;

import java.util.Scanner;

public class TriangleEtoile {

	public static void main(String[] args) {
		int longueur, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Entrez la longueur du triangle : ");
		longueur = sc.nextInt();
		sc.close();
		for (i = longueur; i <= longueur; i++) {
			System.out.println("*");
		}
		for (i = longueur; i == longueur+1; i++) {
			System.out.println("*");
			
		}
	}

}
