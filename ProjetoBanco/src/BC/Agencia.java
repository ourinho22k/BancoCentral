/**
 * 
 */
package BC;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author fil
 *
 */
public class Agencia {

	
	ContaGenerica conta;
	/**
	 * Este é o numero da agenca!
	 */
	private int Agencia;
	
	private int numeContas = 0;
	
	private int numPoupanca = 0;
	
	// Lista de Clientes (Contas da Agência)
	// O primeiro campo (String) é o número da conta do cliente, e o segundo campo é o cliente ao qual esta conta está associada
	HashMap<String, ClienteBancario> clientes = new HashMap<>();
	
	/**
	 * lista de contas (NO FORMATO HASH SET), aqui deve fiar todas as contas desta agencia!!
	 */
//	HashSet<Conta> listaContas = new HashSet<Conta>();
	
	/**
	 * lista de contas (NO FORMATO HASH MAP). O primeiro campo é o número de conta, e o segundo campo é o número de cliente
	 */
	HashMap<String, String> contas = new HashMap<>();
	
	/**
	 * 
	 */
	public Agencia(int numagencia) {
		this.Agencia = numagencia;
		// TODO Auto-generated constructor stub
	}
	
	public Agencia (){
		
	}
	

	
	public void criaContaCorrente(int numecliente,double valor){
	
		setNumeContas(); 
		
		String numcliente = String.valueOf(numecliente);
		
		ContaCorrente contCorrente = new ContaCorrente(getNumeContas(), numecliente); 
		
		
			
//		listaContas.add(contCorrente);
//		listacontas.put(numcliente , getNumeContas);
		
			}
		
		
	public void criaPoupanca(int numecliente,double valor){
		
		setNumPoupanca();
		
		Poupanca pupanca = new Poupanca(getNumPoupanca(), numecliente);
		
//		listacontas.add(pupanca);
	}
	/**
	 * 
	 */
//	public boolean CriaConta(int NumCliente, float Deposito1, int NumConta) {
//		return 0;
//	}

	public int getNumeContas() {
		
		return numeContas;
	}


	public void setNumeContas() {
		this.numeContas = numeContas++;
	}


	public int getNumPoupanca() {
		return numPoupanca;
	}


	public void setNumPoupanca() {
		this.numPoupanca = numPoupanca++;
	}

	
}
