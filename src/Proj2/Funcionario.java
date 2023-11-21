package Proj2;

import java.util.Scanner;

public class Funcionario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 int n1, n2;
		 double n3;

		System.out.println("Digite o número do funcionário");
		n1 = sc.nextInt();
		System.out.println("Digite as horas trabalhadas pelo funcionario");
		n2 = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora");
		n3 = sc.nextDouble();
		

		sc.close();
		
		double salario = (n2 * n3);
		
		System.out.println("Funcionário n° " + n1);
		System.out.printf("salário = R$ %.2f", + salario);
		
	}
}
