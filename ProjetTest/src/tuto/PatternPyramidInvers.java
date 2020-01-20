package tuto;

import java.util.Scanner;

public class PatternPyramidInvers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir nombre:");
		int rows = sc.nextInt();
		for (int i = rows; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}