package com.crm.formation;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param Methode
 * 			Creation et utilisation d'une méthode.
 */
public class JavaMethode {

	public static void main(String[] args) {
		int nb1 = 2;
		int nb2 = 3;
		int s = somme(nb1, nb2);
		System.out.println(s);

		int nb3 = 4;
		int nb4 = 5;
		int s1 = somme(nb3, nb4);
		System.out.println(s1);
	}

	public static int somme(int a, int b) {
		int s = a + b;
		return s;
	}
}
