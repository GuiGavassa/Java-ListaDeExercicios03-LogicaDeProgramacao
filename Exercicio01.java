package lista03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para A:");
		int a = sc.nextInt();
		System.out.println("Digite um valor para B:");
		int b = sc.nextInt();
		System.out.println("Digite um valor para C:");
		int c = sc.nextInt();
		System.out.println("Digite um valor para D:");
		int d = sc.nextInt();
		
		int aMb = a + b;
		int aMc = a + c;
		int aMd = a + d;
		
		int bMc = b + c;
		int bMd = b + d;
		int cMd = c + d;
		
		int aXb = a * b;
		int aXc = a * c;
		int aXd = a * d;
		int bXc = b * c;
		int bXd = b * d;
		int cXd = c * d;
		
		
		System.out.println("A soma dos valores A e B � " + aMb);
		System.out.println("A soma dos valores A e C � " + aMc);
		System.out.println("A soma dos valores A e D � " + aMd);
		System.out.println("A soma dos valores B e C � " + bMc);
		System.out.println("A soma dos valores B e D � " + bMd);
		System.out.println("A soma dos valores C e D � " + cMd);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("A multiplica��o dos valores A e B � " + aXb);
		System.out.println("A multiplica��o dos valores A e C � " + aXc);
		System.out.println("A multiplica��o dos valores A e D � " + aXd);
		System.out.println("A multiplica��o dos valores B e C � " + bXc);
		System.out.println("A multiplica��o dos valores B e D � " + bXd);
		System.out.println("A multiplica��o dos valores C e D � " + cXd);
		
		
	}

}
