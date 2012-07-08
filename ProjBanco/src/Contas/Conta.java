/**
 * 
 */
package Contas;

import OP.Operacao;
import java.util.ArrayList;

/**
 * @author fil
 *
 */
public abstract class Conta {

	/**
	 * lista das operacoes realizadas numa conta
	 */
	ArrayList<Operacao> listaOperacoes= new ArrayList<Operacao>();
	
	
	/**
	 * numero desta conta
	 */
	private String NumConta;
	/**
	 * numero do cliente (do dono) desta conta
	 */
	private String NumCliente;
	
	/**
	 * valor de saldo nesta conta
	 */
	private double Saldo;
	/**
	 * valor do CPMF cobrado a depender da conta
	 */
	private double CPMF;
	/**
	 * tido de variavel, depende da operacao (deposito ou saque) sera guadada para a confecsao do extrato da conta 
	 */
	public String tipos;
	/**
	 * valor da taxa extra ( nao esta sendo usada nesta versao)
	 */
	private double taxaExtra;
	
	/**
	 * esta eh uma senha para a conta so para a conta "futura implementacao"
	 */
	private String senha = "111";


	
		
//	private double juros;
//	
	//	public double getTaxaExtra() {
//		return taxaExtra;
//	}
//
//	public void setTaxaExtra(double taxaExtra) {
//		this.taxaExtra = (taxaExtra/100);
//	}
	
	
	/**
	 * retorna um double do valor CPMF	
	 * @return
	 */
	public double getCPMF() {
		return CPMF;
	}
	/**
	 * seta o valor da variavel CPMF recebendo um valor double
	 * @param cPMF
	 */
	public void setCPMF(double cPMF) {
		CPMF = (cPMF/100);
	}
	/**
	 * retona uma String com valor da variavel 
	 * @return
	 */
	public String getTipos() {
		return tipos;
	}
	/**
	 * seta a variavel tipos resebendo uma String
	 * @param tipos
	 */
	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
	/**
	 * retorna o valor da taxa extra 
	 * @return
	 */
	public double getTaxaExtra() {
		return taxaExtra;
	}
	/**
	 * seta o valor da taxa extra recebendo um double
	 * @param taxaExtra
	 */
	public void setTaxaExtra(double taxaExtra) {
		this.taxaExtra = taxaExtra;
	}
	/**
	 * retorna uma String com a senha	
	 * @return
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * Seta o valor da senha mas precisa-se da senha defaul: 111, para setar um novo valor
	 * @param senha guarda o valor em Strind a senha 
	 * @param novaSenha traz o valor da nova senha no caso de trocas de senha
	 * @return
	 */
	public boolean setSenha(String senha,String novaSenha) {
		
		if (getSenha().equals(novaSenha)){
			this.senha = senha;
			return true;
		}
		
		return false;
	}

	
	/**
	 * construtor unico que obriga a setar numero da conta , numero do cliente 
	 * @param numeroconta numero da conta associada ao cliente
	 * @param numerocliente numero do cliente desta agencia
	 */
	public Conta(String numeroconta,String numerocliente) {
		// TODO Auto-generated constructor stub
			setNumConta(numeroconta);
			setNumCliente(numerocliente);
	}
	/**
	 * getter de numconta
	 * @return retorna o numero de conta
	 */
	public String getNumConta() {
		return NumConta;
	}

	/**
	 * setter de numconta
	 * @param numConta recebe um numero e atribui ao campo da conta. Dependendo do primeiro digito do numero da conta, sera uma CC ou Poupanca
	 */
	public void setNumConta(String numConta) {
		this.NumConta = numConta;
	}

	/**
	 * getter de numcliente
	 * @return retorna o numero do cliente (do dono) desta conta
	 */
	public String getNumCliente() {
		return NumCliente;
	}

	/**
	 * setter de numcliente
	 * @param numCliente recebe um numero e atribui ao numero de cliente
	 */
	public void setNumCliente(String numCliente) {
		this.NumCliente = numCliente;
	}

	/**
	 * getter de saldo
	 * @return retorna o saldo desta conta
	 */
	public double getSaldo() {
		return Saldo;
	}

	/**
	 * setter de saldo
	 * @param saldo recebe um valor e atribui a saldo. Depende da operacao
	 */
	public void setSaldo(double saldo) {
		Saldo = saldo;
 	}

	/**
	 * realiza um saque nesta conta
	 * @param valor recebe o valor que sera descontado da conta. O funcionamento exato depende do tipo de conta
	 */
	public boolean saque(String senha, double valor){
		
		setTipos("saque");
		
		double saldoAtual = getSaldo();
		
		
		
		
		if (getSenha().equals(senha) && saldoAtual >= valor ){
			
			
			setSaldo(saldoAtual - valor);
			
			Operacao op = new Operacao(tipos, valor, getSaldo());
			
			op.setData();
				listaOperacoes.add(op);
			
			return true;
			
		}
	
		return false;
	}

	/**
	 * realiza um deposito na conta
	 * @param valor recebe um valor que sera depositado na conta. O funcionamento exato depende do tipo de conta
	 */
	public boolean dePosito(double valor){
		
		setTipos("deposito");
		
		double saldoatual = getSaldo();
			 setSaldo( saldoatual + valor);
			
			Operacao op = new Operacao(getTipos(), valor, getSaldo());
		op.setData();
		return listaOperacoes.add(op);
	}
	
	/**
	 *  verifica se tem fundos pra saques com CPMF
	 *  @param valor se baseia no valor recebido para o calculo do CPMF
	 */
	public boolean vericaFundosCPMF(double valor){
		
		
		if (valor + (valor * getCPMF())>= getSaldo()) return true;
		return false;
	}

	/**
	 * adiciona uma operacao (usado para extrato)
	 * @param dados recebe dados para adicionar a lista (depende da operacao)
	 */
	public boolean addOperacoes(Operacao dados){
		
		listaOperacoes.add(dados);
		return true;
		
	}
	/**
	 * Retira extrato desta conta
	 * @return retorna a lista de operacoes realizadas nesta conta, nesta sessao, por ora
	 */
	public String extrato(){
		
		return listaOperacoes.toString();
	}

	/**
	 * metodo toString retona um String para impressão campos da conta
	 */
	@Override
	public String toString() {
		return "Conta Numero: " + getNumConta() + "\n Numero do Cliente: " + getNumCliente();
	}
}
