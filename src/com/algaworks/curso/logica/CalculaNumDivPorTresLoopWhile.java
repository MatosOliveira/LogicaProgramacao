/**
 * 
 */
package com.algaworks.curso.logica;

/**
 * @author Matos
 *
 */
public class CalculaNumDivPorTresLoopWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i <= 100) {
			if(i % 3 == 0) {
				System.out.println("Número " + i + " é divisível por 3");
			} else {
				System.out.println("Número " + i + " não é divisível por 3");
			}
			
			i++;
		}

	}

}
