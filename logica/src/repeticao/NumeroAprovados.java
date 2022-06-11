package repeticao;

import java.util.Scanner;

public class NumeroAprovados {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double nota = 0;
			double total = 0;
			int aprovados = 0;int reprovados = 0;int contador = 0;
			
			for(contador = 0; contador < 10; contador++) {
					System.out.printf("\nDigite a nota do %d� aluno: ", contador+1);
					nota = sc.nextDouble();
					total += nota;
					if(nota >= 6) {
						aprovados++;
					}else if(nota >= 0){
						reprovados++;
					}else {
						System.out.println("Valor digitado inv�lido!");
					}
			}
			
			System.out.printf("\nO n�mero de alunos aprovados � %d", aprovados);
			System.out.printf("\nO n�mero de alunos reprovados � %d", reprovados);
			System.out.printf("\nA m�dia das notas da turma � %.1f", total/10);
			
			sc.close();
		}
		
	}
}
