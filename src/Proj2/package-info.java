package Proj2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio, pi, area;

		System.out.println("Digite o valor do raio do circulo");
		raio = sc.nextDouble();
		pi = 3.14159;
				
		area = pi * (raio*raio);	
		
		System.out.printf("Area = %.4f", area);
		sc.close();