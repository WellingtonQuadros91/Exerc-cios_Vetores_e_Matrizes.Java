package br.com.generation.Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio_01 {

	
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int pontuacao[] = new int [5];
		double maiorPontuacao = 0;
		
		System.out.println("Digite quais foram as pontuações das atividades: ");
		
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
			pontuacao[i] = entrada.nextInt();
			
			
			if(pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];
			}
		}
		

		System.out.println("A maior pontuação foi: " + maiorPontuacao);
	}

}
