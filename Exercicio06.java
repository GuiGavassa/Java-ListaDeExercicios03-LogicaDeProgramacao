package lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		float A = sc.nextFloat();
		
		System.out.println("Digite o valor de B:");
		float B = sc.nextFloat();
		
		System.out.println("Digite o valor de C:");
		float C = sc.nextFloat();
		
		float resposta = (float) (Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2));
		System.out.println("O resultado é: " + resposta);		
	}
}