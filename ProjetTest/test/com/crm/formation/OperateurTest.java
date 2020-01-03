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
		
	}

}
