package condicional;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		double peso, altura;
		String classificacao;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o peso: ");
		peso = sc.nextDouble();
		System.out.println("Informe a altura: ");
		altura = sc.nextDouble();
		
		double imc = peso/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			classificacao = "Abaixo do peso";
		}else if(imc < 25) {
			classificacao = "Peso normal";
		}else if(imc < 30) {
			classificacao = "sobrepeso";
		}else if(imc < 35) {
			classificacao = "Obesidade n?vel I";
		}else if(imc < 40) {
			classificacao = "Obesidade n?vel II";
		}else{
			classificacao = "Obesidade m?rbida";
		}
		
		System.out.printf("\nO seu IMC ? %f est? classificado como %s", imc, classificacao);
		
		sc.close();
	}

}
