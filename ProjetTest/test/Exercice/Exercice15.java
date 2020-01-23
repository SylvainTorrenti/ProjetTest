package Exercice;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Exercice 15
 */
import java.util.Scanner;

public class Exercice15 {

	public static void main(String[] args) {

		float sommeInitiale, interet, annee, sommeFinaleAvecInteretSimple, sommeFinaleAvecInteretCompose, tmpSF, tmpSF1;
		tmpSF = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez inserer la somme initiale");
		sommeInitiale = sc.nextFloat();
		System.out.println("Veuillez inserer les interets");
		interet = sc.nextFloat();
		System.out.println("Veuillez inserer le nombre d'année");
		annee = sc.nextFloat();
		sc.close();

		sommeFinaleAvecInteretSimple = sommeInitiale * (1 + annee * interet);
		System.out.println("La somme finale avec interet simple est de " + sommeFinaleAvecInteretSimple);

		while (annee > '0')
			;
		{
			tmpSF1 = (1 + interet) * (1 + interet);
			tmpSF = tmpSF1 + tmpSF;
			annee = annee - 1;
		}
		sommeFinaleAvecInteretCompose = tmpSF * sommeInitiale;
		System.out.println("La somme finale avec interet composé est de " + sommeFinaleAvecInteretCompose);
	}
}
