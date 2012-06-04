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
	  * Lista de agências do Banco
	  * O primeiro campo (String) é o número da agência, e o segundo campo (Agencia) é a agência em si
	  */
	 
	 HashMap<String, Agencia> agencias = new HashMap<String, Agencia>();
	 
	 
	 /**
	  * Lista de Clientes do Banco
	  * O primeiro campo (String) é o número da agência, e o segundo campo (Agencia) é a agência em si
	  */
	 
	 HashMap<String, ClienteBancario> listaClienteDoBanco = new HashMap<String, ClienteBancario>();
	
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

		if(!agencias.containsKey(numagencia))	{
			Agencia a = new Agencia(numagencia);
			agencias.put(numagencia, a);
			return a;
		}
		else return null;
	}
	
	/**
	* Cadastra o Cliente do Banco na lista de Clientes do Banco( No banco agencia central) 
	* @param numcliente : Cadastro Unico deste Cliente do Banco para controle do banco e gerencia de serviços(do Cliente)
	* @param nome : Nome o Cliente que esta sendo cadastrado 
	* @return retona verdadeiro ou falso (sucesso ou nao)
	*/
	public boolean cadastraClienteNobanco (String numcliente , String nome) {
		
		ClienteBancario c = new ClienteBancario(numcliente, nome );
		
				// E se o cliente não existir....
				if (!this.listaClienteDoBanco.containsKey(numcliente)){
					// cadastre o cliente
					listaClienteDoBanco.put(numcliente, c);
						//System.out.println("parabéns, agora voce cadastrou o cliente: " + this.ClienteDoBanco.get(numcliente).getNomeCliente());
				return true;
			}
		// Senão, desista
			else return false;
		}
	
	/**
	* Apaga o Clinete do bando da Lista do banco 
	* @return
	*/
	public boolean delClienteLisataDoBanco(String numcliente, String nome ){
	
		
		
			// E se o cliente existir....
			if (listaClienteDoBanco.containsKey(numcliente)){
				
					System.out.println("Este cliente não esta cadastrado.");
					return false;
				}
				else{
				
				// remova o cliente
				listaClienteDoBanco.remove(numcliente);
				System.out.println("Cliente removido com sucesso. ");
				return true;
				}
	}

	/**
	 * implementa depois
	 * @param nomeCliente
	 * @return
	 */
	public String pesquisaCliente(String nomeCliente){
	
		//fazer depois
	
		
	
	return nomeCliente;
	
}

	/**
	 * Cadastra o Cliente do Banco na dada agencia (se a agencia exixtir)
	 * @param numagencia
	 * @param numcliente
	 * @param nome
	 * @return
	 */
	public boolean cadastraClienteEmAgencia(String numagencia, String numcliente, String nome){
	
	if(!agencias.containsKey(numagencia))	{
			
		if(agencias.get(numagencia).cadastraCliente(numagencia, numcliente, nome)) return true;
			else {
				
				return false;	
		
			}
	}
	
	return false;
}

//	public String imprimeConta(String numConta, String numAgencia){
//	
//	return agencias.get(numAgencia).imprimeDadosDaConta(numConta);
//	}
	
//	public String imprimeListaDoCliente(){
//		
//		listaClienteDoBanco.toString();
//		
//		
//		return null;
//				
//	}

}