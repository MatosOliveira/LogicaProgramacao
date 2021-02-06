/**
 * 
 */
package com.algaworks.curso.logica;

import java.util.Scanner;

/**
 * @author Matos
 *
 */
public class CalculaFreteCompras {

	static final double VALOR_FRETE = 15.0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorCompra;
		
		if(valorProduto >= 100.0) {
			valorCompra = valorProduto;
			System.out.println("Valor final da compra com frete grátis = " + valorCompra);
		} else {
			valorCompra = valorProduto + VALOR_FRETE;
			System.out.println("Valor final da compra + frete = " + valorCompra);
		}
		
		scanner.close();
	}

}
