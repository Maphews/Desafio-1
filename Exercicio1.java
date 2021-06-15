package exerciciosmodulo;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura: ");
		double ValorF = entrada.nextDouble();
		
		double ValorC = (ValorF - 32) * (5/9);
		
		System.out.println(ValorF + "F° convertido para Celsius é igual á: " + ValorC + "C°" );
		
		entrada.close();
	}

}
