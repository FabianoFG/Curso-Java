package desafio;

import java.util.Scanner;

public class DesafioLogica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double preco = 0, precoImposto = 0, precoLucro = 0, somaC = 0, somaE = 0, somaV = 0;
		int quantidade = 0, contador = 0;
		char categoria, novo;
		
		while(contador < 15) {
			System.out.println("\n\nInsira o pre?o do produto: ");
			preco = sc.nextDouble();
			System.out.println("\nInsira a quantidade do produto: ");
			quantidade = sc.nextInt();
			System.out.println("\nInsira a categoria do produto (C, E, V): ");
			categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);
			
			if(categoria == 'C') {
				precoImposto = preco*(1+37.41/100);
				precoLucro = precoImposto*(1+30.00/100);
				somaC += precoLucro*quantidade;
				contador++;
				System.out.printf("\nProduto %d\nPre?o unit?rio: R$%.2f\nQuantidade: %d\nCategoria: %s\n",
						contador, preco, quantidade, categoria);
				System.out.printf("Valor imposto(37,41): R$%.2f\nPre?o c/ impostos: R$%.2f\nValor lucro(30,00):"
						+ " R$%.2f\nPre?o c/ impostos e lucro: R$%.2f",
						precoImposto-preco, precoImposto, precoLucro-precoImposto, precoLucro);
			}else if(categoria == 'E'){
				precoImposto = preco*(1+43.14/100);
				precoLucro = precoImposto*(1+35.00/100);
				somaE += precoLucro*quantidade;
				contador++;
				System.out.printf("\nProduto %d\nPre?o unit?rio: R$%.2f\nQuantidade: %d\nCategoria: %s\n",
						contador, preco, quantidade, categoria);
				System.out.printf("Valor imposto(43,14): R$%.2f\nPre?o c/ impostos: R$%.2f\nValor lucro(35,00):"
						+ " R$%.2f\nPre?o c/ impostos e lucro: R$%.2f",
						precoImposto-preco, precoImposto, precoLucro-precoImposto, precoLucro);
			}else if(categoria == 'V') {
				precoImposto = preco*(1+38.42/100);
				precoLucro = precoImposto*(1+50.00/100);
				somaV += precoLucro*quantidade;
				contador++;
				System.out.printf("\nProduto %d\nPre?o unit?rio: R$%.2f\nQuantidade: %d\nCategoria: %s\n",
						contador, preco, quantidade, categoria);
				System.out.printf("Valor imposto(38,42): R$%.2f\nPre?o c/ impostos: R$%.2f\nValor lucro(50,00):"
						+ " R$%.2f\nPre?o c/ impostos e lucro: R$%.2f",
						precoImposto-preco, precoImposto, precoLucro-precoImposto, precoLucro);
			}else {
				System.out.println("Categoria inv?lida! Deve ser C, E ou V.");
			}
			System.out.println("\n\nDeseja cadastrar novo produto?(m?ximo de 15)(s/n)");
			novo = sc.next().charAt(0);
			if(novo == 'n') {
				contador = 15;
			}
			
		}
		System.out.printf("\n\n\nValor total em estoque por categoria:\nC: R$%.2f\nE: R$%.2f\nV: R$%.2f\n", somaC, somaE, somaV);
		
		sc.close();

	}

}
