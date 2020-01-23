package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Carre
 * 			Creation d'un carré avec *.
 */
import java.util.Scanner;

public class CarreAvecEtoile {
	public static void main(String[] args) {
		int longueur, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Entrez la longueur du carré : ");
		longueur = sc.nextInt();
		sc.close();
		for (i = 1; i <= longueur; i++) {
			for (j = 1; j <= longueur; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}