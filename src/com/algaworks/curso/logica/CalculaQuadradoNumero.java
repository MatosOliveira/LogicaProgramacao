/**
 * 
 */
package com.algaworks.curso.logica;

import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class CalculaQuadradoNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		Double numero = scanner.nextDouble();
		
		Double resultado = Math.pow(numero, 2);
		
		System.out.println("O número elevado ao quadrado é = " + resultado);

		scanner.close();
	}

}
