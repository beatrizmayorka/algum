package atividade_2;

public class Cachorro {
	String nome;
	String raca;
	String late;
		
	public Cachorro(String n, String r, String l) {
		nome = n;
		raca = r;
		late = l;	
	}
	
	public void Caminha() {
		System.out.println(" --> Nome: " + this.nome + " ");
		System.out.println(" --> Raca: " + this.raca + " ");
		System.out.println(" --> " + this.late + " ");
		System.out.println();
	}
		
}