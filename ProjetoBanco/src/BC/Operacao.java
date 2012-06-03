/**
 * 
 */
package BC;

import java.util.Date;

/**
 * @author fil
 * 
 * esta classe sera util para possibilitar guardar as operacoes efetuadas 
 * na conta ou poupança, deve guadar o tipo da operacao : deposito ou saque , o saldo e a data da operacao 
 *
 */
public class Operacao {

	


	/**
	 * tipo de operacao
	 */
	private String tipo;
	/**
	 * valor da operacao
	 */
	private double valor;
	/**
	 * data da operacao
	 */
	private Date data;
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/*
	 * geters e seters
	 */
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData() {
		this.data = new java.util.Date();
	}
	/*
	 * imprime tudo
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "\nEXTRATO DE CONTA"+"\nOperacao: " + getTipo() + "\nValor:"
				+ getValor() +"\n"+ getSaldo() +"\n"+ getData() ;
	}


	/*
	 * este construtor obriga inicialiszar com os valores
	 */
	public Operacao(String tipo, double valor, double saldo) {
		
		this.tipo = tipo;
		this.valor = valor;
		this.saldo = saldo;
	}

	/**
	 * 
	 */
	public Operacao() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	

}
