package cursoNelioAlves;

import java.util.Scanner;

public class Cap5_Ex3 {
	/*Leia 2 valores inteiros (A e B). 
	Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
	indicando se os valores lidos s�o m�ltiplos entre si. 
	Aten��o: os n�meros devem poder ser digitados em
	ordem crescente ou decrescente.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite um n�mero: ");
		A = sc.nextInt();
		System.out.println("Digite um n�mero: ");
		B = sc.nextInt();
		
		if (A%B == 0 || B%A == 0) {
			System.out.println("S�o multiplos!");
		}
		else 
			System.out.println("N�o s�o multiplos!");

	}

}
