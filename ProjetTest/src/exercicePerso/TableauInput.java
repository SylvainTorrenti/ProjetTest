/**
 * 
 */
package exercicePerso;
import java.util.Scanner;
/**
 * @author Sylvain Torrenti
 *
 */
public class TableauInput {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Entrez le nombre d'éléments:");

		int n = s.nextInt();

		String arr[] = new String[n];

		System.out.println("Entrez votre Nom");
		String nom = s.nextLine();
		arr[0] = nom;
		
		System.out.println("Entrez votre Prénom");
		String prenom = s.nextLine();
		arr[1] = prenom;		
		

//		for (int i = 0; i < n; i++) {// for reading array
//			String a = s.nextLine();
//			System.out.println("valeur de a : " + a);
//			arr[i] = a;
//			
//		}

		for (String i : arr) { // for printing array

			System.out.println(i);

		}
		
		s.close();

	}

}