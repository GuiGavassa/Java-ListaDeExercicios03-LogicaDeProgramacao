package lista03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que voc� possui, em d�lares:");
		float dolar = sc.nextFloat();
		
		System.out.println("Qual a cota��o do d�lar, hoje?");
		float cotacao = sc.nextFloat();
		
		float reais = dolar * cotacao;
		
		System.out.println("$" + dolar +" convertidos em reais, � igual a: R$" + reais);
	}
}
