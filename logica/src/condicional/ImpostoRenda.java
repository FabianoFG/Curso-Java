package condicional;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		
		double renda;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da renda: ");
		renda = sc.nextDouble();
		
		if(renda < 1903.98){
			System.out.printf("Isento(a).");
		}else if(renda < 2826.65) {
			System.out.printf("Valor do desconto: R$%.2f", renda*(7.5/100));
		}else if(renda < 3751.06) {
			System.out.printf("Valor do desconto: R$%.2f", renda*(15.0/100));
		}else if(renda < 4664.68) {
			System.out.printf("Valor do desconto: R$%.2f", renda*(22.5/100));
		}else {
			System.out.printf("Valor do desconto: R$%.2f", renda*(27.5/100));
		}
		
		sc.close();

	}

}
