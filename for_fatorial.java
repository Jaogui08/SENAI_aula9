package Projetos_LPA.aula9;

import java.util.Scanner;

public class for_fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número que gostaria de saber o fatorial: ");
		int num = scanner.nextInt();
		
		long fatorial = 1;
		
		for (int i = num; i >= 1; i--) {
			fatorial = fatorial*i;
		}
		
		System.out.println("O fatorial de " + num + " é igual a: " + fatorial);
		
		scanner.close();

	}

}
