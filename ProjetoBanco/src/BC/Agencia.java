/**
 * 
 */
package BC;

import java.util.HashSet;

/**
 * @author fil
 *
 */
public class Agencia {

	
	Conta conta;
	/**
	 * Este é o numero da agenca!
	 */
	private static short Agencia;
	
	private int numeContas = 0;
	
	private int numPoupanca = 0;
	

	/**
	 * lista de contas, aqui deve fiar todas as ccontas desta agencia!!
	 */
	HashSet<Conta> listaContas = new HashSet<>();
	 
 
	
	/**
	 * 
	 */
	public Agencia() {
		// TODO Auto-generated constructor stub
	}

	
	public void criaContaCorrente(int numeconta,int numecliente,double valor){
		
		setNumeContas(); 
		
		ContaCorrente contCorrente = new ContaCorrente(getNumeContas(), numecliente, valor); 
			
		listaContas.add(contCorrente);
		
			}
		
		
	public void criaPoupanca(int numeconta,int numecliente,double valor){
		
		setNumPoupanca();
		
		Poupanca pupanca = new Poupanca(getNumPoupanca(), numecliente, valor);
		
		listaContas.add(pupanca);
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
