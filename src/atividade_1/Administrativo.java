package atividade_1;

public class Administrativo extends Assistente {

	public Administrativo(String nome, String empresa, Number matricula, double salario) {
		super(nome, empresa, matricula, salario);
	}


	public double getSalario() {
		return super.getSalario() + 2000.00;
	}

}