/**
 * 
 */
package Exercice;

import java.util.Scanner;

import com.crm.formation.InstructionReturnTest;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param instruction
 * 		Test d'instruction.
 */
public class ExerciceInstruction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre:");
		int nombre = sc.nextInt();
		InstructionReturnTest.afficherListeNombre(nombre);
		sc.close();

	}

}
