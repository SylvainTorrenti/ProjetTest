/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class ConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		boolean estVrai = true;
//		if (estVrai == true) {
//			System.out.println("YES");
//		} else {
//			System.out.println("NON");
//		}
//	}
//	
		int nb = 25;
		String chaine = "ok";

		if (nb > 10 && chaine.equals("ok")) {
			System.out.println("condition remplie");
		} else if (nb > 10 || chaine.equals("ok")) {
			System.out.println("Une des deux condition remplie");
		} else {
			System.out.println("Condition non remplie");

		}

	}
}
