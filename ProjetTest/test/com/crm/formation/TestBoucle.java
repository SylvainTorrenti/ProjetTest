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
		  //On affiche une instruction
		  System.out.println("Donnez un prénom : ");
		  //On récupère le prénom saisi
		  prenom = sc.nextLine();
		  //On affiche notre phrase avec le prénom
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
		  //On demande si la personne veut faire un autre essai
		  System.out.println("Voulez-vous réessayer ? (O/N)");
		  //On récupère la réponse de l'utilisateur
		  reponse = sc.nextLine().charAt(0);
		  //Tant que la réponse n'est pas O ou N, on repose la question
		  while(reponse != 'O' && reponse != 'N')
		  {
			  //On demande si la personne veut faire un autre essai
			    System.out.println("Voulez-vous réessayer ? (O/N)");
			    reponse = sc.nextLine().charAt(0);
			  }
		  }
		System.out.println("Au revoir…");
		sc.close();
		}
	}

