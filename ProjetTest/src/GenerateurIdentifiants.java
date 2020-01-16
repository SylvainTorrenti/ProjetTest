import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class GenerateurIdentifiants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez saisir votre prénom :");
		String prenom = sc.nextLine();
		System.out.println("veuillez saisir votre nom :");
		String nom = sc.nextLine();
		sc.close();

		prenom = prenom.substring(0, 1).toUpperCase();
		nom = nom.toUpperCase();

		System.out.println("Votre login sera: " + prenom + '.' + nom);

		String nom1 = nom.substring(0, 2);
		nom1 = nom1 + nom.substring(2).toLowerCase().replace('r', '@').replace('e', 'E').replace('t', 'T');

		System.out.println("Votre mot de passe est: " + nom1 + nom1.length());
	}

}
