package br.com.generation.Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio_01 {

	
	/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
	atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int pontuacao[] = new int [5];
		double maiorPontuacao = 0;
		
		System.out.println("Digite quais foram as pontua��es das atividades: ");
		
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� valor: ");
			pontuacao[i] = entrada.nextInt();
			
			
			if(pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];
			}
		}
		

		System.out.println("A maior pontua��o foi: " + maiorPontuacao);
	}

}
