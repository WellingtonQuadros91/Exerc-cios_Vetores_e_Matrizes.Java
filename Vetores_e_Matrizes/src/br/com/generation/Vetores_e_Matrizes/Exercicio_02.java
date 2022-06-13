package br.com.generation.Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio_02 {

	
	/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	quantas foram as ocorr�ncias da maior pontua��o.*/
	
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
		
		System.out.println("\nO maior n�mero que saiu nos lan�amentos do dado foi: " +maiorPontuacao+ " e foram " +lancamentos+ " vezes");
		System.out.println("E a m�dia dos lan�amentos foi: " +soma/10);
		
	}

}
