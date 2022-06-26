package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExecPoo {

	public static void main(String[] args) {
		//Triangulo a;a = new Triangulo();
		//Triangulo b;b = new Triangulo(); pode ser assim também
		
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();
		
		entrada(a);
		if(a.validar() == true) {
			System.out.println(a.toString());
		}else {
			System.out.println("\nOs lados informados não são de um triângulo\n\n");
		}
		
		entrada(b);
		if(b.validar() == true) {
			System.out.println(b);//pode ser só o nome do objeto também
		}else {
			System.out.println("\nOs lados informados não são de um triângulo\n\n");
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
