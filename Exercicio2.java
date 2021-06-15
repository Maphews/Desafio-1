package exerciciosmodulo;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		//Transformar info de celsiu para fahrenheit
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura: ");
		double ValorC = entrada.nextDouble();
		
		double ValorF = (ValorC * (9/5)) + 32;
		
		System.out.println(ValorC + "C° convertido para Fahrenheit é igual á: " + ValorF + "F°");
		
		entrada.close();
		
		
	}

}
