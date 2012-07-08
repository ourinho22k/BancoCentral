/**
 * 
 */
package EXC;

/**
 * @author fil
 *
 */
public class SaldoInsuficiente extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficiente(String mensagen){
		super(mensagen);
	}
	
	/**
	 * 
	 */
	public SaldoInsuficiente() {
		// TODO Auto-generated constructor stub
		super("Saldo incuficiente.");
	}


}
