package Exercice;

import java.util.Scanner;

public class Exercice2AfpaDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre");
		int i = sc.nextInt();
		int somme = i;
		sc.close();
		do {
			somme = somme * i;
			i--;
		} while (i > 0);
		System.out.println("La somme est de : " + somme);

	}

}
