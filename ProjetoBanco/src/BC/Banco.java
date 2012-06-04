/**
 * 
 */
package BC;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


/**
 * @author 	Heryson
 * 		&	Filipe
 */
public class Banco {
	
	
	/**
	 * aqui deve ficas as agencias criadas
	 */
	  
	 /*
	  * Lista de agências do Banco
	  * O primeiro campo (String) é o número da agência, e o segundo campo (Agencia) é a agência em si
	  */
	 
	 HashMap<String, Agencia> agencias = new HashMap<String, Agencia>();
	 
	
	/**
	 * Construtor Banco
	 */
	public Banco() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * cadastrar agência
	 */
	public Agencia cadastraAgencia(String numagencia){
//		String numagencia_convertido = String.valueOf(numagencia);
		if(!agencias.containsKey(numagencia))	{
			Agencia a = new Agencia(numagencia);
			agencias.put(numagencia, a);
			return a;
		}
		else return null;
	}
}