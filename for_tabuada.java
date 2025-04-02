package Projetos_LPA.aula9;

import java.util.Scanner;

public class for_tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número para saber a tabuada: ");
		int num = scanner.nextInt();
		
		System.out.println("\nTabuada do " + num + ": ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		scanner.close();

	}

}
