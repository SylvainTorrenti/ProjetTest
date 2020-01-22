package tuto;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */
import java.util.Scanner;

public class Tableau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t;
		System.out.println("taille voulue ?");
		int n = sc.nextInt();
		t = new int[n];
		t[0] = 15;
		t[1] = ++t[0];
	}

}
