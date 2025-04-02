package Projetos_LPA.aula9;

import java.util.Scanner;

public class for_numeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número maior que zero: ");
		int n = scanner.nextInt();
		
		if (n < 0 || n == 0) {
			System.out.println("Inválido");
			scanner.close();
			return;
		}
		
		for (int i=0; i <= n; i++) {
			System.out.println("Número: "+ i);
		}
		
		scanner.close();

	}

}
