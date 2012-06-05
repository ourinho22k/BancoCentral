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
	public boolean cadastraAgencia(String numagencia){

		if(!agencias.containsKey(numagencia))	{
			Agencia a = new Agencia(numagencia);
			agencias.put(numagencia, a);
			return true;
		}
		else return false;
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
	* @return true se cliente excluido false caso contrario
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
	public String pesquisaNomeCliente(String nomeCliente){
	
		//if(listaClienteDoBanco.containsKey(key)
	
		
	
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
	
	
		if(existAgencia(numagencia)) { agencias.get(numagencia).cadastraCliente(numagencia, numcliente, nome);
		return	true;	};
			
	System.out.println("So negou ");
	return false;
}
	
	/**
	 * Cadastra a conta em uma agencia determinada OBS: contas com inicio 0 é uma conta corrente com inicio 1 é uma poupança
	 * EXP: 1003 é uma  poupanca , 0266 é uma comta corrente.
	 * @param numAgencia o numero da agendcia onde tera a conta 
	 * @param numCliente o numero do cliente 
	 * @param munConta o numero da dada conta
	 * @return true se deu certo false caso contrario 
	 */
	public boolean cadatraContaEmAgencia(String numAgencia, String numCliente, String munConta){
		
		if(!existeConta(numAgencia, munConta) ){
			agencias.get(numAgencia).cadastraContaCliente(numAgencia, numCliente, munConta);
		
		return true;
		
		}
		
		return false;
			
	}
	
	/**
	 * deposida o valor em uma agencia e uma conta determinada pelos valores de entrada
	 * @param numAgencia é o numero agencia a quem a conta pertense
	 * @param numContada numero da conta a ser acrecida o saldo 
	 * @param valor o valor a ser creditado na conta
	 * @return True se tudo deu certo falce caso contrario 
	 */
	public boolean depositoConta(String numAgencia, String numConta, double valor){
		
		if ( agencias.containsKey(numAgencia) && agencias.get(numAgencia).contas.containsKey(numConta))return agencias.get(numAgencia).depositoEmConta(numConta, valor);
		
		return false;
	
	}

	/**
	 * Saque é o decrecimo de valores em saldo da conta
	 * @param numAgencia numaro ca agencia a quem a conta pertence
	 * @param numConta numero da conta em si
	 * @param valor o valor aser decrecido do saldo 
	 * @return true se tudo bem false caso contrario
	 */
	public boolean saqueConta(String numAgencia, String numConta, double valor){
	
		if(existAgencia(numAgencia) && existeConta(numAgencia, numConta)) {
			agencias.get(numAgencia).saqueDaConta(numConta, valor);
			return true;
		}
		
		return false;
		
	}

	/**
	 * retorna o saldo de dada conta em uma determinada agencia
	 * @param numAgencia numero da agencia a que a conta pertense
	 * @param numConta numero da conta
	 * @return retorna uma String com o saldo da conta
	 */
	public String saldoConta(String numAgencia, String numConta){
		
		if (agencias.containsKey(numAgencia)&& agencias.get(numAgencia).contas.containsKey(numConta)) return agencias.get(numAgencia).saldoDaconta(numConta);
		
		return null;
		
	}
	
	/**
	 * Sera devolvido uma string com todo movimento de dada conta 
	 * @param numAgencia numero da agencia a que a conta pertence
	 * @param numConta numero da conta 
	 * @return retorna uma String com valores do movimento financeiro da conta
	 */
	public String extratoConta(String numAgencia, String numConta){
		
		if (agencias.containsKey(numAgencia) && agencias.get(numAgencia).contas.containsKey(numConta)) return agencias.get(numAgencia).extratoConta(numConta);
		
		return numConta;
		
	}
	
	/**
	 * examina se a agencia existe 
	 * @param numAgencia o numero da agencia a ser checada 
	 * @return retorna true se exite e false se nao exitir
	 */
	public boolean existAgencia(String numAgencia){
		
		if ( agencias.containsKey(numAgencia)) return true;
		
		return false;
	}
	
	/**
	 *  checa que o a agencia exite e se nesta agencia exite uma conta com dado numero 
	 * @param numAgencia numeo da agencia
	 * @param numConta numero da conta
	 * @return retona True caso exista e false caso ano exita
	 */
	public boolean existeConta(String numAgencia, String numConta){
		
		if (agencias.containsKey(numAgencia)&& agencias.get(numAgencia).contas.containsKey(numConta))return true;
	
		return false;
	}
	
}