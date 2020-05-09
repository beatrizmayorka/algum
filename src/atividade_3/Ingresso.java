package atividade_3;

abstract class Ingresso {
	  private double valor;

	  public Ingresso(double valor) {
	    this.valor = valor;
	  }

	  public double getValor() {
	    return valor;
	  }

	  public void setValor(double valor) {
	    this.valor = valor;
	  }

	  public void imprimeValor() {
	    System.out.printf("Valor do ingresso: R$%.2f\n", this.getValor());
	  }

}