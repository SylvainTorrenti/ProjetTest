/**
 * 
 */
package com.crm.boapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Sylvain Torrenti
 * @version 1.0.0
 * @since 4 févr. 2020
 */
public class Date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime maintenant = LocalDateTime.now();  
		   System.out.println(date.format(maintenant));  

	}

}
