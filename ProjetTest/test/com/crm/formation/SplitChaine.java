package com.crm.formation;

public class SplitChaine {

	public static void main(String[] args) {
//		chaine a splitter
		String strToSplit = "toto,titi,tata";

//		Resultat split stocker dans TABLEAU
		String[] tabSplit = strToSplit.split(",");

//		Parcour du tableaux
		for (String str : tabSplit) {
			System.out.println(str);
		}
	}

}
