package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Exercice 1 AFPA
 * 		Exercice 1 AFPA avec For
 */
import java.util.Scanner;

public class ExerciceAfpa1For {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("veuillez saisir un nombre");
			int n = sc.nextInt();
			int somme = 0;
			sc.close();
		for (; n>0; n--) {
			somme=somme+n;
			
			

		}
		System.out.println(somme);
	}

}
