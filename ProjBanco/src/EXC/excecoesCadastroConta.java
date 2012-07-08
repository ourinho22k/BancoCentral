/**
 * 
 */
package EXC;

/**
 * @author fil
 *
 */
public class excecoesCadastroConta extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public excecoesCadastroConta(String mensagen){
		
		super (mensagen);
		
	}

	/**
	 * 
	 */
	public excecoesCadastroConta() {
		// TODO Auto-generated constructor stub
		super("Erro ao cadastrar");
	}

}
