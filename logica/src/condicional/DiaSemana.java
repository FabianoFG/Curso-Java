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
				System.out.printf("O dia %d é domingo.", dia);
				break;
			case 2:
				System.out.printf("O dia %d é segunda-feira.", dia);
				break;
			case 3:
				System.out.printf("O dia %d é terça-feira.", dia);
				break;
			case 4:
				System.out.printf("O dia %d é quarta-feira.", dia);
				break;
			case 5:
				System.out.printf("O dia %d é quinta-feira.", dia);
				break;
			case 6:
				System.out.printf("O dia %d é sexta-feira.", dia);
				break;
			case 7:
				System.out.printf("O dia %d é sábado.", dia);
				break;
			default:
				System.out.println("Número digitado inválido!");
		}
		
		sc.close();
		
	}

}
