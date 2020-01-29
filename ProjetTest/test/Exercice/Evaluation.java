/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author Sylvain Torrenti
 *
 */
public class Evaluation {

	public static void main(String[] args) {
//		int nombre1 = 2, nombre2 = 3;
//		int quotient = nombre2 / nombre1;
//		System.out.println(quotient);

//		int nombre1=2;
//		float nombre2=3.0F;
//		float quotient=nombre2/nombre1;
//		System.out.println(quotient);

//		int a,b;
//		a=5;
//		b=8;
//		boolean c=a>b;
//		System.out.println(c);

//		int a, b;
//		a = 5;
//		b = 8;
//		boolean c = !(a > 10) && (b > 20);
//		System.out.println(c);

//		char choix = 'Z';
//		if (choix == 'O') {
//			System.out.println("Vous aimez la programmation");
//
//		} else if (choix == 'N') {
//			System.out.println("Vous n'aimez pas la programmation");
//
//		} else {
//			System.out.println("Vous voulez voir la suite...");
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Entrez O ou N!");
//		String choix = sc.nextLine();
//		sc.close();
//		switch (choix) {
//		case "O":
//			System.out.println("Vous aimez la programmation");
//			break;
//		case "N":
//			System.out.println("Vous n'aimez pas la programmation");
//			break;
//		default:
//			System.out.println("Vous voulez voir la suite...");
//			break;
//		}

//		final float TAUX = 1.11F;
//		float montantEuros = 0.0F;
//		float montantDollar = 0.0F;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Veuillez saisir un montant en Euros :");
//		montantEuros = sc.nextFloat();
//		sc.close();
//		if (montantEuros<0) {
//			System.out.println("Montant invalide! Veuillez effectuer une nouvelle saisie:");
//			
//		}else {
//			montantDollar=montantEuros*TAUX;
//			System.out.println("le montant en dollar est de : " + montantDollar);
//		}

//		final String SUFFIXE_MAIL= "@crm.com";
//		final char POINT = '.';
//		String prenom="";
//		String nom="";
//		String mail="";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Entrer votre prénom:");
//		prenom = sc.nextLine();
//		System.out.println("Entrer votre nom:");
//		nom=sc.nextLine();
//		if (prenom.isEmpty() || nom.isEmpty()) {
//			System.out.println("Les informations ne sont pas complètes");
//		}else {
//			mail=prenom.toLowerCase()+POINT+nom.toLowerCase()+SUFFIXE_MAIL;
//			System.out.println("Votre adresse mail sera : " +mail);
//		}
//		sc.close();

//		int nombreDepart = 0;
//		int nombreFin = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Entrer un premier nombre");
//		nombreDepart = sc.nextInt();
//		System.out.println("Entrer un deuxiéme nombre");
//		nombreFin = sc.nextInt();
//
//		System.out.println("Resultat boucle FOR");
//		for (int i = nombreDepart; i < nombreFin; i += 2) {
//			System.out.println(i);
//		}
//
//		System.out.println("Resultat boucle WHILE");
//		int i = nombreDepart;
//		while (i < nombreFin) {
//			System.out.println(i);
//			i += 2;
//		}
//
//		System.out.println("Resultat boucle DO WHILE");
//		int j = nombreDepart;
//		do {
//			System.out.println(j);
//			j += 2;
//		} while (j < nombreFin);
//		sc.close();
		
		int [] tabInt= {0,10,20,30,40,50,60,70,80,90};
		for (int i = 0; i < tabInt.length; i++) {
			System.out.println(tabInt[i]);
			
		}
		for (int element : tabInt) {
			System.out.println(element);
			
		}
		tabInt[tabInt.length-1]=0;
				
		

	}
}
