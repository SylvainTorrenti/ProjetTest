package com.crm.formation;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */

public class BoucleForTest {

	public static void main(String[] args) {
//		int i;
//		for (i = 0; i < 10; i++) {
//			System.out.println(i);
//
//		}

//		for (int x = -5; x <= 5; x++) {
//			if (x == 0) {
//
//				System.out.println("division par 0");
//				break;
//			}
//
//			System.out.println(1.0 / x);
//		}
		for (int x = -5; x <= 5; x++) {
			if (x == 0) {

				System.out.println("division par 0");
				continue;
			}

			System.out.println(1.0 / x);
		}
	}

}
