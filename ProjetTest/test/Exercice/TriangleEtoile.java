package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param triangle
 * 			Fabrication d'une triangle avec des *.
 */
import java.util.Scanner;

public class TriangleEtoile {

	public static void main(String[] args) {
		int longueur, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la longueur du triangle : ");
		longueur = sc.nextInt();
		sc.close();
		for (i = 0; i < longueur; i++) {

			for (j = i; j >= 0; j--)

				System.out.print("*");
			System.out.println(" ");
	
		}
		System.out.print("\n");
	}
}
