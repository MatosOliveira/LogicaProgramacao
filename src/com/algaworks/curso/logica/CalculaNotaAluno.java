/**
 * 
 */
package com.algaworks.curso.logica;

import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class CalculaNotaAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();
		
		if(nota >= 70) {
			System.out.println("Aluno Aprovado! - Nota: " + nota);
		} else {
			System.out.println("Aluno Reprovado! - Nota: " + nota);
		}
		
		scanner.close();

	}

}
