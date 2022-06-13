package br.com.generation.Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio_02 {

	
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int dado[] = new int[10], lancamentos = 0, maiorPontuacao = 0;
		double soma = 0;
		
		for(int i = 0; i < 10; i++) {
			dado[i] = (int) Math.floor(Math.random() * 6 + 1 );
			System.out.printf(dado[i] + "|");
			soma += dado[i];
			
			if(dado[i] > maiorPontuacao) {
				maiorPontuacao = dado[i];
				lancamentos = 0;
			}
			
			if(dado[i] == maiorPontuacao) {
				lancamentos ++;
			}
		}
		
		System.out.println("\nO maior número que saiu nos lançamentos do dado foi: " +maiorPontuacao+ " e foram " +lancamentos+ " vezes");
		System.out.println("E a média dos lançamentos foi: " +soma/10);
		
	}

}
