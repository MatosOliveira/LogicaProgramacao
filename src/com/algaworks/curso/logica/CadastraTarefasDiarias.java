/**
 * 
 */
package com.algaworks.curso.logica;

import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class CadastraTarefasDiarias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [] tarefas = new String[5];
		
		System.out.println("Digite as 5 tarefas do dia: ");
		
		
		for (int i = 0; i < tarefas.length; i++) {
			
			String nomeTarefa = scanner.next();
			tarefas[i] = nomeTarefa;
			//System.out.println("Tarefa[" + i + "]:" + tarefas[i]);
		}
		
		scanner.close();
		
		System.out.println("====== AGENDA DIARIA ====== ");
		
		for (int j = 0; j < tarefas.length; j++) {
			
			System.out.println("Tarefa[" + j + "]:" + tarefas[j]);
			
		}
		
		System.out.println("===========================");

	}

}
