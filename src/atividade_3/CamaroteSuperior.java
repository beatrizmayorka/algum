package atividade_3;

public class CamaroteSuperior extends VIP {
	 private String localizacao;

	  public CamaroteSuperior(double valor, String localizacao) {
	    super(valor);
	    this.setLocalizacao(localizacao);
	  }

	  public String getLocalizacao() {
	    return localizacao;
	  }

	  public double getValor() {
	    return super.getValor() + 7.50;
	  }

	  public void setLocalizacao(String localizacao) {
	    this.localizacao = localizacao;
	  }

	  public void imprimeLocalizacao() {
	    System.out.printf("Localização do ingresso: %s\n", this.getLocalizacao());
	  }
	  
	  public void imprimeTipo() {
		System.out.printf("Camarote Superior\n");
	  }

}