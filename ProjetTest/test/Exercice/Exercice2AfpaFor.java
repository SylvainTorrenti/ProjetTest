package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */
import java.util.Scanner;

public class Exercice2AfpaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre");
		int i = sc.nextInt();
		int somme = i;
		sc.close();
		for (; i > 0; i--) {
			{
				somme = somme * i;

			}

		}
		System.out.println("La somme est de : " + somme);
	}
}