package com.crm.formation;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String texte;
//		texte = "hello";
//		System.out.println(texte);
//		
		String str = "Java c'est génial !!";
//		Longueur d'une chaine
//		System.out.println(str.length());
//		
//		Mettre en maj
		String str2 = str.toUpperCase();
//		System.out.println(str2);
		
		
//		supr blanc debut/fin
		String str3 = str.trim();
//		System.out.println(str3);
		
		
//		remplacer caracteres
		String str4 = str.replace('a', 'e');
//		System.out.println(str4);
		
		
//		extraction d'une sous chaine
		String str5 = str.substring(0, 4);
//		System.out.println(str5);
//		
//		Suppression des blancs
		String str6 = str.replace(" ", "");
//		System.out.println(str6);
		
//		
//		Comparaison de chaines
		String chaine1="test";
		String chaine2="TEST";
		System.out.println(chaine1.equalsIgnoreCase(chaine2));
		System.out.println(chaine1.equals(chaine2));
		
//		Scanner sc = new Scanner(System.in);
//		sc.hasNext();
//		
//		Math.addExact(1, 2);

	}

}
