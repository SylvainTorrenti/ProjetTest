package com.crm.api;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */
import java.util.Scanner;

public class NoteSwitch {

	public static void main(String[] args) {
		final String ADMISSION = "Vous êtes admis";
		final String AB = "Vous avez entrez 12/20 et 14/20";
		final String B = "Vous avez entrez 14/20 et 16/20";
		final String TB = "Vous avez plus de 16/20";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre mention.(En majuscule)");
		String str = sc.nextLine();
		sc.close();
		switch (str) {

		case "":
			System.out.println(ADMISSION);
			break;
		case "AB":
			System.out.println(AB);
			break;
		case "B":
			System.out.println(B);
			break;
		case "TB":
			System.out.println(TB);
			break;
		default:
			System.out.println("Aucune idée!!!");
			break;
		}

	}

}
