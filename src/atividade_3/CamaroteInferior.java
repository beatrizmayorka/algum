package atividade_3;

public class CamaroteInferior extends VIP {
	private String localizacao;

	  public CamaroteInferior(double valor, String localizacao) {
	    super(valor);
	    this.setLocalizacao(localizacao);
	  }

	  public String getLocalizacao() {
	    return localizacao;
	  }

	  public void setLocalizacao(String localizacao) {
	    this.localizacao = localizacao;
	  }

	  public void imprimeLocalizacao() {
	    System.out.printf("Localizacao do ingresso: %s\n", this.getLocalizacao());
	  }
	  
	  public void imprimeTipo() {
		System.out.printf("Camarote Inferior\n");
	  }

}