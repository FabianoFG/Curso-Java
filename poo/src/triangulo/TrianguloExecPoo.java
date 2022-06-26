package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExecPoo {

	public static void main(String[] args) {
		//Triangulo a;a = new Triangulo();
		//Triangulo b;b = new Triangulo(); pode ser assim tamb�m
		
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();
		
		entrada(a);
		if(a.validar() == true) {
			System.out.println(a.toString());
		}else {
			System.out.println("\nOs lados informados n�o s�o de um tri�ngulo\n\n");
		}
		
		entrada(b);
		if(b.validar() == true) {
			System.out.println(b);//pode ser s� o nome do objeto tamb�m
		}else {
			System.out.println("\nOs lados informados n�o s�o de um tri�ngulo\n\n");
		}
	}
	
	public static void entrada(Triangulo lado) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os lados: ");
		lado.x = sc.nextDouble();
		lado.y = sc.nextDouble();
		lado.z = sc.nextDouble();
	}
}
