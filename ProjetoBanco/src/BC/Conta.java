/**
 * 
 */
package BC;

/**
 * @author fil
 *
 */
public abstract class Conta implements ContaGenerica {

	/**
	 * 
	 */
	private short NumConta;
	/**
	 * 
	 */
	private int NumCliente;
	/**
	 * 
	 */
	private java.lang.Float Saldo;

	/**
	 * 
	 */
	public Conta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public boolean Deposito(float Valor) {
		return 0;
	}

	/**
	 * 
	 */
	public float Saque() {
		return 0;
	}

}
