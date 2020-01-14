package Exercice;

import java.util.Scanner;

public class ReductionTrain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir votre age");
		int age = sc.nextInt();
		sc.close();
		boolean age2 = age >= 50 ? true : false;
		if (age2 == true) {
			System.out.println("Vous avez droit à une reduction de 30%!");
		} else if (age2 = age <= 25) {
			System.out.println("Vous avez droit à une réduction de 50%!");
		} else if (age2 == false) {
			System.out.println("Vous n'avez pas droit à une réduction!");
		}
	}
}
