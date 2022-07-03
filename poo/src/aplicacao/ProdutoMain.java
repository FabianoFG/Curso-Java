package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informar os dados do produto");
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("\nQuantidade: ");
		int quantidade = sc.nextInt();
		System.out.println("\nPre�o: ");
		double valor = sc.nextDouble();
		
		Produto celular = new Produto(nome, valor, quantidade);
		
		System.out.printf("\nModelo: %s", celular.nome);
		System.out.printf("...Quantidade: %d", celular.quantidade);
		System.out.printf("...R$ %.2f",celular.valorUnitario);
		
		System.out.printf("...Imposto: R$ %.2f", celular.valorImposto());
		System.out.printf("...Total em estoque: R$ %.2f", celular.valorEstoque());
		
		sc.close();
	}

}
