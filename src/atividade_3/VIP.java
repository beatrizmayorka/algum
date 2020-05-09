package atividade_3;

abstract class VIP extends Ingresso {
	  
	public VIP(double valor) {
		super(valor);
	}

		 
	public double getValor() {
		return super.getValor() + 5.50;
	}

}