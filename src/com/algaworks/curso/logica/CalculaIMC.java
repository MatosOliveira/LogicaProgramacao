/**
 * 
 */
package com.algaworks.curso.logica;

import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class CalculaIMC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu peso atual: ");
		Double peso = scanner.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso / Math.pow(altura, 2);

		if (imc > 30 ) {
			System.out.println("IMC = " + imc + " Você está acima do seu peso ideal!!!");
		} else {
			System.out.println("IMC = " + imc + " Você está no peso ideal.");
		}
		
		scanner.close();
	}

}
