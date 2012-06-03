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
//	private int Agencia;
	
	private String Agencia;
	
	public String getAgencia() {
		return Agencia;
	}

	public void setAgencia(String agencia) {
		this.Agencia = agencia;
	}

	private String numeContas;
	
	private String numPoupanca;
	
	
	// Lista de Clientes (Contas da Agência)
	// O primeiro campo (String) é o número da conta do cliente, e o segundo campo é o cliente ao qual esta conta está associada
	HashMap<String, ClienteBancario> clientes = new HashMap<>();
	
	/**
	 * lista de contas (NO FORMATO HASH SET), aqui deve fiar todas as contas desta agencia!!
	 */
//	HashSet<Conta> listaContas = new HashSet<Conta>();
	
	/**
	 * lista de contas da agência(NO FORMATO HASH MAP). O primeiro campo é uma conta, e o segundo campo é o número de cliente
	 */
	HashMap<String, Conta> contas = new HashMap<String, Conta>();
	
	/**
	 * relação da lista de contas com tal cliente: o primeiro campo é o número de conta, e o segundo é o número de cliente
	 */
	HashMap<String, String> cclientes = new HashMap<String, String>();
	/**
	 * 
	 */
	/**
	 * 
	 */
	
	public Agencia(String numagencia) {
		this.Agencia = numagencia;
		// TODO Auto-generated constructor stub
	}
	
	public Agencia (){
		
	}
	

	
	public void criaContaCorrente(String numecliente,double valor){
		
//		setNumeContas(); 
		
		
		ContaCorrente contCorrente = new ContaCorrente(getNumeContas(), numecliente); 
		
		
			
//		listaContas.add(contCorrente);
//		listacontas.put(numcliente , getNumeContas);
		
			}
		
		
	public void criaPoupanca(String numecliente,double valor){
		
//		setNumPoupanca();
		
		Poupanca pupanca = new Poupanca(getNumPoupanca(), numecliente);
		
//		listacontas.add(pupanca);
	}
	/**
	 * 
	 */
//	public boolean CriaConta(int NumCliente, float Deposito1, int NumConta) {
//		return 0;
//	}

	public String getNumeContas() {
		
		return numeContas;
	}


	public void setNumeContas(String numCon) {
		this.numeContas = numCon;
	}


	public String getNumPoupanca() {
		return numPoupanca;
	}


	public void setNumPoupanca(String numPoup) {
		this.numPoupanca = numPoup;
	}

	
}
