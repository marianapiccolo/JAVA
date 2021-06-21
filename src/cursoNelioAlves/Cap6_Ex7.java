package cursoNelioAlves;

import java.util.Locale;
import java.util.Scanner;

public class Cap6_Ex7 {
	
	/*Fazer um programa para ler um n�mero N. 
	 * Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo segundo. 
	Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double x, y;
		
		System.out.println("Digite um n�mero: ");
		n = sc.nextInt();
		
		for (i = 0; i <n; i++) {
			System.out.println("Digite dois n�meros: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			double div = 0;
			if (y == 0) {
				System.out.println("Divis�o imposs�vel!");
			}
			else
				div = x/y;
				System.out.printf("Divis�o: %.1f%n", div);
			
		}
		
		
	}

}
