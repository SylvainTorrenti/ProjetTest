package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 27/01/20
 */

public class NomPrenomArguments {

	public static void main(String[] args) {

		String[] tableauNom = args[0].split("=");
		String[] tableauNom1 = args[1].split("=");
		if (tableauNom[0] == "prenom") {
			System.out.println("Bonjour " + tableauNom[1] + " " + tableauNom1[1] + '.');
		} else {
			System.out.println("Bonjour " + tableauNom1[1] + " " + tableauNom[1] + '.');

		}

	}
}
