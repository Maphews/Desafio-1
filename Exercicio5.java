package exerciciosmodulo;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		//calcular area do triangulo
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a altura do triangulo: ");
		double altura = entrada.nextDouble();
		System.out.print("Informe a base do triangulo: ");
		double base = entrada.nextDouble();
		
		double area = (altura * base) / 2;
		
		System.out.println("A �rea do seu triangulo � igual a " + area);
		
		entrada.close();
		
		
	}

}
