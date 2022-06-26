package aplicacao;

import java.util.Scanner;

import entidades.Veiculo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pas;
		double tanque, consumo, km, valor;
		
		System.out.println("\nQtde passageiros: ");
		pas = sc.nextInt();
		System.out.println("Capacidade do tanque: ");
		tanque = sc.nextDouble();
		System.out.println("O consumo por litro: ");
		consumo = sc.nextDouble();
		System.out.println("Distância em Km: ");
		km = sc.nextDouble();
		System.out.println("Valor do combustível: ");
		valor = sc.nextDouble();
		
		Veiculo gurgel = new Veiculo(pas, tanque, consumo);
		System.out.println(gurgel.toString());
		
		double tanques = gurgel.tanqueViagem(km);
		double rateio = gurgel.dividDespesas(km, valor);
		
		System.out.printf("Para a viagem vamos precisar de "
				+"%.1f tanque(s) e cada passageiro contrubuirá com "
				+"R$%.2f.\n", tanques, rateio);
		
		sc.close();
	}

}
