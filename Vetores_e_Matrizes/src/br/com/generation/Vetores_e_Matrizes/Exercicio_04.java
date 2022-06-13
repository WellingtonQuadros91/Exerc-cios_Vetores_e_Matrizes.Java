package br.com.generation.Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio_04 {

	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaração da Matriz
		double [][] valores = new double[3][3];
		double soma = 0.0, somaDiagonal = 0.0;
		
		
	//adicionando valores na Matriz
		for(int l = 0; l < valores.length; l++) { 
			for(int c = 0; c < valores[l].length; c++) { 
				
				System.out.printf("---> Digite os valores: <--- \n" +valores[l][c]+  "Valor: " );
				valores[l][c] = entrada.nextDouble();
				soma += valores[l][c];
				somaDiagonal = valores[0][0] + valores[1][1] + valores[2][2];
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int l = 0; l < valores.length; l++) { 
			for(int c = 0; c < valores[l].length; c++) { 
				System.out.printf(valores[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("<------------------------->");
		System.out.println("A soma dos valores da matriz é: " +soma);
		System.out.println("A soma da diagonal princial é: " +somaDiagonal);

	}

}
