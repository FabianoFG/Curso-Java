package repeticao;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double base, altura;
		int contador = 0;
		while(contador != -1) {
			System.out.println("\nDigite a medida da base: ");
			base = sc.nextDouble();
			System.out.println("\nDigite a medida da altura: ");
			altura = sc.nextDouble();
			
			if(base <= 0) {
				System.out.println("\nUm valor digitado para a base ? inv?lido!");
			}else if(altura <= 0){
				System.out.println("\nUm valor digitado para a altura ? inv?lido!");
			}else {
				System.out.printf("\nA ?rea do tri?ngulo ? igual a: %.2f.", base*altura/2);
			}
			System.out.println("\n\nDigite -1 para sair, ou outro valor para continuar.");
			contador = sc.nextInt();
		}
				
		sc.close();

	}

}
