package atividade_1;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Gerente Roberta = new Gerente("Roberta", "Oracle", 39000.00);
		Tecnico Maria_Fernanda = new Tecnico("Maria Fernanda", "Safra", 123456, 25000.00, "Noturno");
		Administrativo Beatriz = new Administrativo("Beatriz", "Amazon", 654321, 30000.00);

		Roberta.exibeDados();
		Maria_Fernanda.exibeDados();
		Beatriz.exibeDados();

	}
	
}