/**
 * 
 */
package com.algaworks.curso.logica;

/**
 * @author Matos
 *
 */
public class CalculaNumDivPorTresLoopFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println("Número " + i + " é divisível por 3");
			} else {
				System.out.println("Número " + i + " não é divisível por 3");
			}
		}
		
		

	}

}
