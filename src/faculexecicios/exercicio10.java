package faculexecicios;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		//Programa de calcula prestação com taxa
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor da prestação: ");
		double valor = sc.nextDouble();
		
		System.out.print("Valor da taxa: ");
		double taxa = sc.nextDouble();
		
		System.out.print("Dias em atraso: ");
		double atraso = sc.nextDouble();
		
		double soma = valor+(valor * (taxa/100))*atraso;
		System.out.print("Valor da prestação atualizado: " + soma);
		
	}
}
