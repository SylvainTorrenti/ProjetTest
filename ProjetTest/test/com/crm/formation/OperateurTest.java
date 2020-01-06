package com.crm.formation;

public class OperateurTest {

	public static void main(String[] args) {
		int maVariableInt1 = 36;
		System.out.println(maVariableInt1);		
		
		int maVariableInt2 = maVariableInt1;
		System.out.println(maVariableInt2);
		
		int maVariavleInt3 = maVariableInt2 = maVariableInt1 = 58;
		System.out.println(maVariableInt1);
		System.out.println(maVariableInt2);
		System.out.println(maVariavleInt3);

				
				
		int somme1;
		somme1 = 5+6;
		System.out.println(somme1);
		
		int somme2;
		somme2 = somme1 + 7;
		System.out.println(somme2);
		
		int soustraction;
		soustraction = 6-5;
		System.out.println(soustraction);
		
		int produit;
		produit = 6*5;
		System.out.println(produit);
		
		float produit2;
		produit2 = 2.5f*2.5f;
		System.out.println(produit2);
		
		float division1;
		division1 = 8f/6;
		System.out.println(division1);
		
		int modulo;
		modulo = 5 % 2;
		System.out.println(modulo);
	}

}
