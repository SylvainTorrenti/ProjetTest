package com.crm.formation;

import java.util.Scanner;

public class TestBoucle {

	public static void main(String[] args) {
		//Une variable vide
		String prenom;
		//On initialise celle-ci à O pour oui
		char reponse = 'O';
		//Notre objet Scanner, n'oubliez pas l'import de java.util.Scanner !
		Scanner sc = new Scanner(System.in);
		//Tant que la réponse donnée est égale à oui…
		
		while (reponse == 'O' && reponse != 'N')
		{
		  System.out.println("Donnez un prénom : ");
		  prenom = sc.nextLine();
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
		  System.out.println("Voulez-vous réessayer ? (O/N)");
		  reponse = sc.nextLine().charAt(0);
		  while(reponse != 'O' && reponse != 'N')
		  {
			    System.out.println("Voulez-vous réessayer ? (O/N)");
			    reponse = sc.nextLine().charAt(0);
			  }
		  }
		System.out.println("Au revoir…");
		sc.close();
		}
	}

