package triangulo;

import java.util.Scanner;

public class TrianguloExec {

	public static void main(String[] args) {
		double x, y, z, area, perimetro;
		String tipo;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <=2; i++) {
			System.out.printf("Digite os lados do %dº triângulo", i);
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			if(Math.abs(x - y) < z && z < (x + y)) {
				if(x == y && y == z) {
					tipo = "equilátero";
				}else if(x == z || x == y || y == z) {
					tipo = "isósceles";
				}else {
					tipo = "escaleno";
				}
				perimetro = (x + y + z)/2.0;
				area = Math.sqrt(perimetro*(perimetro-x)*(perimetro-y)*(perimetro-z));
				System.out.printf("\nOs lados %.1f, %.1f e %.1f, formam um triângulo %s", x, y, z, tipo);
				System.out.printf("\nO perímetro do triângulo é %.1f", perimetro);
				System.out.printf("\nA área do triângulo é %.1f\n\n", area);
			}else {
				System.out.println("\nOs lados informados não são de um triângulo\n\n");
			}
		}
		
		sc.close();

	}

}
