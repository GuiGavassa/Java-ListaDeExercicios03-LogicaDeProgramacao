package lista03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que você possui, em dólares:");
		float dolar = sc.nextFloat();
		
		System.out.println("Qual a cotação do dólar, hoje?");
		float cotacao = sc.nextFloat();
		
		float reais = dolar * cotacao;
		
		System.out.println("$" + dolar +" convertidos em reais, é igual a: R$" + reais);
	}
}
