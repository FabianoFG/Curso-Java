package sequencial;

import java.util.Scanner;

public class DescontoINSS {

	public static void main(String[] args) {
		
		double salarioBruto, descontoINSS, salarioLiquido;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio bruto: ");
		salarioBruto = sc.nextDouble();
		
		descontoINSS = salarioBruto * 0.11;
		
		salarioLiquido = salarioBruto - descontoINSS;
				
		System.out.printf("O sal�rio bruto � de R$%.2f e o sal�rio l�quido � de R$%.2f, "
				+"com o desconto de 11 por cento do INSS.",salarioBruto, salarioLiquido);
		
		sc.close();

	}

}
