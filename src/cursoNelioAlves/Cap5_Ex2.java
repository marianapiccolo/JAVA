package cursoNelioAlves;

import java.util.Scanner;

public class Cap5_Ex2 {

	// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
	// �mpar.

	public static void main(String[] args) {

		int inteiro;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");

		inteiro = sc.nextInt();

		if (inteiro % 2 == 0) {
			System.out.println("O n�mero � par!");
		}

		else
			System.out.println("O n�mero � �mpar");

	}

}
