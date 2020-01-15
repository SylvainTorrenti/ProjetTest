package Exercice;

import java.util.Scanner;

public class ExerciceAfpa2While {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("veuillez saisir un nombre");
	int i = sc.nextInt();
	int facteur = i;
	sc.close();
	while (i > 0) {
		facteur=facteur*i;
		i--;
	}
	System.out.println("La somme est de : " + facteur);

}
}
