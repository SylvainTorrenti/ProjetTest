/**
 * 
 */
package exercicePerso;
import java.util.Scanner;
/**
 * @author CRM
 *
 */
public class TableauInput {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Entrez le nombre d'éléments:");

		int n = s.nextInt();

		String arr[] = new String[n];

		System.out.println("Entrez votre Nom et Prenom");

		for (int i = 0; i < n; i++) {// for reading array
			String a = s.nextLine();
			
			arr[i] = a;
			
		}

		for (String i : arr) { // for printing array

			System.out.println(i);

		}

	}

}