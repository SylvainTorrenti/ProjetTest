package Exercice;

import java.util.Scanner;

public class ExerciceJeuDevineUnNombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre compris entre 0 et 100 :");
		int nombre = sc.nextInt();
		int resultat = 65;
		int essai = 0;

		while(nombre>resultat) {
			System.out.println("C'est moins!");
			System.out.println("veuillez saisir un nombre compris entre 0 et 100 :");
			nombre = sc.nextInt();
			essai++;
			break;
		}
		while(nombre<resultat) {
			System.out.println("C'est plus!");
			System.out.println("veuillez saisir un nombre compris entre 0 et 100 :");
			nombre = sc.nextInt();
			essai++;
			break;
		}
		while(nombre==resultat) {
			System.out.println("Le bon nombre est bien 65");
			System.out.println("vous avez fait "+ essai +" essais!");
			break;
		}
		sc.close();	}

}
