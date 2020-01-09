package com.crm.formation;

import java.util.Scanner;

public class WrapperTest {
	


	public static void main(String[] args) {
		int i = Integer.parseInt("123");
		float f = Float.parseFloat("123.1f");
		
		System.out.println(i);
		System.out.println(f);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		String nombre = sc.nextLine();
		int i2 = Integer.parseInt(nombre);
		System.out.println(i2);
		
		System.out.println("Veuillez saisir un nombre :");
		String nombre1 = sc.nextLine();
		float f2 = Integer.parseInt(nombre1);
		System.out.println(f2);
		

	}

}
