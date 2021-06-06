package cursoNelioAlves;

import java.util.Scanner;

public class Cap4_Ex6 {

	/*
	 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
	 * precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do tri�ngulo
	 * ret�ngulo que tem A por base e C por altura. b) a �rea do c�rculo de raio C.
	 * (pi = 3.14159) c) a �rea do trap�zio que tem A e B por bases e C por altura.
	 * d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que tem lados A
	 * e B.
	 */

	public static void main(String[] args) {

		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();

		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();

		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();

		areaTriangulo = A * C / 2.0;

		areaCirculo = 3.14159 * C * C;

		areaTrapezio = (A + B) / 2.0 * C;

		areaQuadrado = B * B;

		areaRetangulo = A * B;

		System.out.printf("�rea tri�ngulo: %.3f%n", areaTriangulo);
		System.out.printf("�rea c�rculo: %.3f%n", areaCirculo);
		System.out.printf("�rea trap�zio: %.3f%n", areaTrapezio);
		System.out.printf("�rea quadrado: %.3f%n", areaQuadrado);
		System.out.printf("�rea ret�ngulo: %.3f%n", areaTriangulo);

	}
}
