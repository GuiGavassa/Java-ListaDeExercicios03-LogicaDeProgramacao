package lista03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma altura para a caixa:");
		float alturaCaixa = sc.nextFloat();
		
		System.out.println("Digite uma largura para a caixa:");
		float larguraCaixa = sc.nextFloat();
		
		System.out.println("Digite um comprimento para a caixa:");
		float comprimentoCaixa = sc.nextFloat();
		
		float volumeCaixa = comprimentoCaixa * alturaCaixa * larguraCaixa;
		
		System.out.println("O volume da caixa é de: " + volumeCaixa);
	}
}
