/**
 * 
 */
package Exercice;

import java.util.Scanner;

import com.crm.formation.InstructionReturnTest;

/**
 * @author CRM
 *
 */
public class ExerciceInstruction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre:");
		int nombre = sc.nextInt();
		InstructionReturnTest.afficherListeNombre(nombre);
		sc.close();

	}

}
