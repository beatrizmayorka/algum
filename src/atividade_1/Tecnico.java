package atividade_1;

public class Tecnico extends Assistente {
	private String turno;

	public Tecnico(String nome, String empresa, Number matricula, double salario,  String turno) {
		super(nome, empresa, matricula, salario);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		if (this.turno == "Noturno")
			return super.getSalario() + 5000.00;
		else
			return super.getSalario();
	}

}