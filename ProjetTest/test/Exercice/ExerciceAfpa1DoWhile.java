package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Exercice 1 AFPA
 * 			Exercice 1 avec Do While.
 */
import java.util.Scanner;

public class ExerciceAfpa1DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre");
		int i = sc.nextInt();
		int somme = 0;
		sc.close();
		do {
			somme = somme + i;
			i--;
		} while (i >= 0);
		System.out.println("La somme est de : " + somme);

	}

}
