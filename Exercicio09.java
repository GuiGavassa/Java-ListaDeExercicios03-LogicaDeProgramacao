package lista03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um sal�rio mensal");
		float salarioMensal = sc.nextFloat();
		
		System.out.println("Digite o valor do reajuste em %");
		float reajuste = sc.nextFloat();
		
		float novoSalario = salarioMensal + ((salarioMensal * reajuste) / 100);

		System.out.println("O novo sal�rio reajustado � de: R$" + novoSalario );
	}

}
