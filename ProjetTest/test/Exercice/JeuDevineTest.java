package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Jeu
 * 		Deviner un nombre entre 0 - 100.
 */
import java.util.Scanner;

public class JeuDevineTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultat = (int) (Math.random() * (100));
		System.out.println("Veuillez saisir un nombre compris entre 0 et 100 :");
		 while (!sc.hasNextInt()) 
		    {
		        sc.nextLine();
		        System.out.print("Un nombre entre 0 et 100 on a dit! Fripouille!");
		    }
		int nombre = sc.nextInt();
		int essai = 1;

		while (nombre != resultat) {

			if (nombre > resultat) {
				System.out.println("C'est moins!");
				System.out.println("veuillez saisir un nombre compris entre 0 et 100 :");
				nombre = sc.nextInt();
				essai++;

			}else {
				System.out.println("C'est plus!");
				System.out.println("veuillez saisir un nombre compris entre 0 et 100 :");
				nombre = sc.nextInt();
				essai++;

			}

		}

		while (nombre == resultat) {
			System.out.println("Vous avez trouvé!!");
			System.out.println("vous avez fait " + essai + " essais!");
			sc.close();
			break;
		}

	}
}

