package entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aluno {
	public String nome;
	public String dataNascimento;
	public String turma;
	public String dataMatricula;
	
	public Aluno() {
		
	}

	public Aluno(String nome, String dataNascimento, String turma, String dataMatricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.turma = turma;
		this.dataMatricula = dataMatricula;
	}
	
	public Aluno(String nome, String dataNascimento, String dataMatricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.dataMatricula = dataMatricula;
	}
	
	public int calcularIdade(String dataNasc) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascInput = null;
		Calendar aniversario = new GregorianCalendar();
		
		try {
			dataNascInput = sdf.parse(dataNasc);//convertendo string em formato Date
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		aniversario.setTime(dataNascInput);//Date para Calendar
		Calendar hoje = Calendar.getInstance();//pega a data atual
		int idade = hoje.get(Calendar.YEAR) - aniversario.get(Calendar.YEAR);//ano atual - ano nasc = idade em anos
		
		aniversario.add(Calendar.YEAR, idade);
		
		if(hoje.before(aniversario)) {//verifica se já completou o ano
			idade--;
		}
		return idade;
	}

	public String toString() {
		if(turma == null) {
			return "\n"+nome+" nasceu em "+dataNascimento+", tem "+calcularIdade(dataNascimento)
			+" anos, se matriculou em "+dataMatricula+".\n";
		}else {
			return "\n"+nome+" nasceu em "+dataNascimento+", tem "+calcularIdade(dataNascimento)
			+" anos, se matriculou "+"na turma "+turma+" em "+dataMatricula+"+.\n";
		}
	}
	
	
}
