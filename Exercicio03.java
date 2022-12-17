package lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A");
		float a = sc.nextFloat();
		System.out.println("Digite o valor B");
		float b = sc.nextFloat();

		float resposta = (float) Math.pow((a - b), 2);
		System.out.println("O resultado é: " + resposta);
	}
}
