package exercicePerso;

import java.util.Scanner;

public class PyramidTest {

	public static void main(String[] args) {
		int longueur, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la longueur du triangle : ");
		longueur = sc.nextInt();
		sc.close();
		{
			for (i = 0; i < longueur; i++) {

				for (j = i; j >= 0; j--)

					System.out.print("*");
					System.out.println(" ");

			}
			for (i = longueur; i >= 1; --i) {
				for (j = 1; j <= i; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}

}
