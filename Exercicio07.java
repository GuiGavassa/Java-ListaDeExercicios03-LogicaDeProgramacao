package lista03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para A");
		float a = sc.nextFloat();
		
		System.out.println("Digite um valor para B");
		float b = sc.nextFloat();
		
		System.out.println("Digite um valor para C");
		float c = sc.nextFloat();
		
		float resultado = (float) (Math.pow((a + b + c), 2));
		
		System.out.println("O resultado da operação: " + resultado);
	}
}
