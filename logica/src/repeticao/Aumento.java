package repeticao;

import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano = 0;
		double percentual;
		double salario = 1000;
		
		while(ano != -1) {
			System.out.println("\nDigite o ano(-1 para sair): ");
			ano = sc.nextInt();
			System.out.println("\nDigite o percentual de aumento: ");
			percentual = sc.nextDouble();
			salario *= (1+percentual/100);
			System.out.printf("\nO sal�rio no ano %d � de R$%.2f.", ano, salario);
		}
		
		sc.close();

	}

}
