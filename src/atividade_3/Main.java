package atividade_3;

public class Main {
	
	public static void main(String[] args)  throws Exception {

		Normal ingressoNormal = new Normal(20.00);
		CamaroteInferior camaroteInferior = new CamaroteInferior(35.50, "B-28");
		CamaroteSuperior camaroteSuperior = new CamaroteSuperior(35.50, "D-15");

		System.out.printf("\n");
		ingressoNormal.imprimeTipo();
		ingressoNormal.imprimeValor();

		System.out.printf("\n");
		camaroteInferior.imprimeTipo();
		camaroteInferior.imprimeValor();
		camaroteInferior.imprimeLocalizacao();

		System.out.printf("\n");
		camaroteSuperior.imprimeTipo();
		camaroteSuperior.imprimeValor();
		camaroteSuperior.imprimeLocalizacao();
	}

}