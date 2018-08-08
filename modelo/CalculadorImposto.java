package br.com.bytebank.banco.modelo;

/**
 * Classe que irá controlar os impostos a serem pagos
 * 
 * @author guilherme.lima
 * 
 */

public class CalculadorImposto{

	private double totalImposto;
	
	/**
	 * Recebe um parâmetro Tributavel t e a partir dele calcula o importo a ser pago
	 * 
	 * @param t
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	/**
	 * Retorna o imposto calculado no método registra
	 * 
	 * @return Total a pagar de Impostos
	 * 
	 */
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
