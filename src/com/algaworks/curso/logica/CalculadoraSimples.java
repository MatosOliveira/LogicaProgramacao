/**
 * 
 */
package com.algaworks.curso.logica;

import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class CalculadoraSimples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		Double num1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		Double num2 = scanner.nextDouble();
		
		System.out.println("Digite a operação: ");
		String operacao = scanner.next();
		
		Double resultado;
		
		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			System.out.println("Resultado = " + resultado);
			break;
		case "-":
			resultado = num1 - num2;
			System.out.println("Resultado = " + resultado);
			break;
		case "*":
			resultado = num1 * num2;
			System.out.println("Resultado = " + resultado);
			break;
		case "/":
			resultado = num1 / num2;
			System.out.println("Resultado = " + resultado);
			break;
		default:
			System.out.println("Operador não identificado!");
			break;
		}
		
		scanner.close();
		
		

	}

}
