package atividade_2;

public class Gato {
	String nome;
	String raca;
	String mia;

	public Gato(String n, String r, String m) {
		nome = n;
		raca = r;
		mia = m;
	}

	public void Caminha() {
		System.out.println(" --> Nome: " + this.nome + " ");
		System.out.println(" --> Raca: " + this.raca + " ");
		System.out.println(" --> " + this.mia + " ");
		System.out.println();
	}

}