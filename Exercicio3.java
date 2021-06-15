package exerciciosmodulo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		//pegar peso, altura e calcula imc
		
		String altura = JOptionPane.showInputDialog("Informe a sua altura em m");
		String peso = JOptionPane.showInputDialog("Informe o seu peso em kg");
		
		double Altura = Double.parseDouble(altura);
		double Peso = Double.parseDouble(peso);
		
		double altura2 = Math.pow(Altura, 2);
		
		double imc = Peso / altura2;
		
		System.out.println("O seu IMC é: " + imc);
		
		
		
		
		
	}

}
