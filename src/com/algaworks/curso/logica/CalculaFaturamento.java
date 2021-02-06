/**
 * 
 */
package com.algaworks.curso.logica;

/**
 * Classe que retorna a semana que obteve o maior faturamento.
 * 
 * 1) Os quatro primeiros vetores estão guardando o faturamento diário de cada semana;
 * 2) O vetor de 2 dimensões guarda o faturamento mensal separado por semanas.
 * 
 * @author Matos
 *
 */
public class CalculaFaturamento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro};
		
		Double faturamentoSemanal = 0.0;
		Double faturamentoMensal = 0.0;
		Integer numSemanaMaiorFaturam = null;
		
		for (int i = 0; i < mes.length; i++) {
			
			//Array para armazenar valores de cada semana
			Double[] semana = mes[i];
			
			for(int j = 0; j < semana.length; j++) {
				faturamentoSemanal += semana[j];
			}
			
			//Verifica se o faturamento semanal é maior que o mensal
			if (faturamentoSemanal > faturamentoMensal) {
				faturamentoMensal = faturamentoSemanal;
				numSemanaMaiorFaturam = i + 1;
			}
			
			//Zera o valor da variavel
			faturamentoSemanal = 0.0;
		}
		
		System.out.println("A semana que obteve o maior faturamento foi a " + numSemanaMaiorFaturam
				+ " e o valor foi de R$" + faturamentoMensal);
		

	}

}
