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
//		
//		System.out.println(str.length());
		
		String str2 = str.toUpperCase();
//		System.out.println(str2);
		
		String str3 = str.trim();
//		System.out.println(str3);
		
		String str4 = str.replace('a', 'e');
//		System.out.println(str4);
		
		String str5 = str.substring(0, 4);
		System.out.println(str5);
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		sc.hasNext();
		
		Math.addExact(1, 2);

	}

}
