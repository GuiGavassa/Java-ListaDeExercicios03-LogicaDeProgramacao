package lista03;

import java.util.Scanner;

public class Exercicio04 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que voc� possui, em reais:");
		float reais = sc.nextFloat();
		
		System.out.println("Qual a cota��o do d�lar, hoje?");
		float cotacaoDolar = sc.nextFloat();
		
		float dolar = reais / cotacaoDolar;
		
		System.out.println("R$" + reais +" convertidos em d�lares, � igual a: $" + dolar);
	}
}
