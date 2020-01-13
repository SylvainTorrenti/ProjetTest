/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ExerciceMaxNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un 1er nombre:");
		int nbr1 = sc.nextInt();
		System.out.println("Entrez un 2eme nombre:");
		int nbr2 = sc.nextInt();
		System.out.println("Entrez un 3eme nombre");
		int nbr3 = sc.nextInt();
		if (nbr1<nbr2) {
			if (nbr2<nbr3) {
				System.out.println("Le plus grand nombre est: "+nbr3);
			} else { System.out.println("Le plus grand nombre est: "+nbr2);
				
			}
		} else{ if(nbr1<nbr3) {
			
		}else { System.out.println("Le plus grand nombre est: "+nbr1);
			
		}
			
		}
	}

}
