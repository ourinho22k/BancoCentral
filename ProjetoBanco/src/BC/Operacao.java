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
	/**
	 * valor do saldo 
	 */
	private double saldo;
	/**
	 * retorna um double de saldo 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * seta o valor de saldo 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * retorna uma String de tipos
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * seta o valor de Tipor recebendo uam String
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * retorna um double com o valor de Valor
	 * @return
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * seta o valor de Valor, recebendo um bouble Valor
	 * @param valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * retorna a um tipo data
	 * @return
	 */
	public Date getData() {
		return data;
	}
	/** 
	 * quando esta é chamada seta a variavel data com a hora, dia, mes e ano do sistema na hora que é chama 
	 */
	public void setData() {
		this.data = new java.util.Date();
	}
	/**
	 * retorna uma String com dados das operaçoes efetuadas em uma conta(extrato)
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "\nTipo de Operacao:	" + getTipo() + "\n\nValor da Operacao:	"
				+ getValor() +"\nSaldo Atual:		"+ getSaldo() +"\nNa Data"+ getData() ;
	}


	/**
	 * 
	 * este construtor obriga inicialiszar com os valores
	 */
	public Operacao(String tipo, double valor, double saldo) {
		
		this.tipo = tipo;
		this.valor = valor;
		this.saldo = saldo;
	}

	/**
	 * construtos generico
	 */
	public Operacao() {
		// TODO Auto-generated constructor stub
	}

	
	

}
