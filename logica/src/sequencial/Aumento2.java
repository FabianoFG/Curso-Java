package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {

		double salarioBruto1, salarioBruto2, percentual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio bruto: ");
		salarioBruto1 = sc.nextDouble();
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		salarioBruto2 = salarioBruto1 * (1 + percentual/100);
		
		System.out.printf("O sal�rio bruto passou de R$%.2f para R$%.2f.", salarioBruto1, salarioBruto2);
		
		sc.close();

	}

}
