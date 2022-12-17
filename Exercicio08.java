package lista03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para A");
		float a = sc.nextFloat();
		
		System.out.println("Digite o valor B");
		float b = sc.nextFloat();
		
		System.out.println("Digite o valor C");
		float c = sc.nextFloat();
		
		System.out.println("Digite o valor D");
		float d = sc.nextFloat();
		
		float soma = b + d;
		float produto = a / c;
		
		System.out.println("O resultado do produto de A e C é: " + produto);
		System.out.println("O resultado da soma de B e D é: " + soma);
	}
}