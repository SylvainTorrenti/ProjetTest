/**
 * 
 */
package exercicePerso;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Vrac
 * 		Là où je met des trucs en vracs sans Ctrl-V
 */
public class ToutEnVrac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("Entrez un mot:");
//		String mot = s.nextLine();
//		System.out.println("Vous avez entré: " +mot);
//		System.out.println("Vous entré: " +mot.toUpperCase() + " en gras");
		s.close();
		int[] tab = { 1, 3, 5, 6, 8 };
//		for (int i = 0; i < tab.length; i++) {
//			System.out.println(tab[i]);
		tab[0] = 5;
		System.out.println(tab[0]);

	}
}
