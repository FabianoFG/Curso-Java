package condicional;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana (1 a 7): ");
		dia = sc.nextInt();
		
		switch(dia) {
			case 1:
				System.out.printf("O dia %d � domingo.", dia);
				break;
			case 2:
				System.out.printf("O dia %d � segunda-feira.", dia);
				break;
			case 3:
				System.out.printf("O dia %d � ter�a-feira.", dia);
				break;
			case 4:
				System.out.printf("O dia %d � quarta-feira.", dia);
				break;
			case 5:
				System.out.printf("O dia %d � quinta-feira.", dia);
				break;
			case 6:
				System.out.printf("O dia %d � sexta-feira.", dia);
				break;
			case 7:
				System.out.printf("O dia %d � s�bado.", dia);
				break;
			default:
				System.out.println("N�mero digitado inv�lido!");
		}
		
		sc.close();
		
	}

}
