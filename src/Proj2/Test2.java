package Proj2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2,n3,n4, diferença;

		System.out.println("Digite o primeiro número para cálcular a diferença");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número para cálcular a diferença");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número para cálcular a diferença");
		n3 = sc.nextInt();
		System.out.println("Digite o quarto número para cálcular a diferença");
		n4 = sc.nextInt();
		diferença = n1 * n2 - n3 * n4;
		

		sc.close();
		
		System.out.println("Diferença = " + diferença);
		
	}
}


