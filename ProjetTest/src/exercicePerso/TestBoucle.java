package exercicePerso;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param boucle
 * 			Test boucle avant le cour.
 */
import java.util.Scanner;

public class TestBoucle {

	public static void main(String[] args) {

		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);

		while (reponse == 'O' && reponse != 'N') {
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");
			System.out.println("Voulez-vous réessayer ? (O/N)");
			reponse = sc.nextLine().charAt(0);
//			while (reponse != 'O' && reponse != 'N') {
//				System.out.println("Voulez-vous réessayer ? (O/N)");
//				reponse = sc.nextLine().charAt(0);
//			}
		}
		System.out.println("Au revoir…");
		sc.close();
	}
}
