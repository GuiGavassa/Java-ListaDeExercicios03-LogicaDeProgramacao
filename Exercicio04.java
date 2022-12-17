package lista03;

import java.util.Scanner;

public class Exercicio04 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que você possui, em reais:");
		float reais = sc.nextFloat();
		
		System.out.println("Qual a cotação do dólar, hoje?");
		float cotacaoDolar = sc.nextFloat();
		
		float dolar = reais / cotacaoDolar;
		
		System.out.println("R$" + reais +" convertidos em dólares, é igual a: $" + dolar);
	}
}
