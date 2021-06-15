package exerciciosmodulo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Ler o valor e mostrar ele ao quadrado e ao cubo
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("DIGITE O NUMERO: ");
		double numero = entrada.nextDouble();
		
		System.out.println("\n");
		
		double numeroq = Math.pow(numero, 2);
		double numeroc = Math.pow(numero, 3);
		
		System.out.println(numero + " ao quadrado é igual a " + numeroq + "\n");
		System.out.println(numero + " ao cubo é igual a " + numeroc + "\n");
		
		entrada.close();
		
		
	}
}
