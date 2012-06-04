/**
 * 
 */
package BC;

import java.util.ArrayList;

/**
 * @author fil
 *
 */
public abstract class Conta implements ContaGenerica {

	
	ArrayList<Operacao> listaOperacoes= new ArrayList<Operacao>();
	
	
	/**
	 * este é o numero desta conta, devera ser unico em cada agencia
	 */
	private String NumConta;
	/**
	 * este é o numero do cliente , cada cliente tem seu Cadastro Unico ! isto relacionara o cliente com os serviço
	 * ofericidos a ele pelo banco
	 */
	private String NumCliente;
	/**
	 * hue cada conta dem que ter seu saldo !
	 */
	
	private double Saldo;

	private double CPMF;
	
	public String tipos;
	
	private double taxaExtra;
	
	/**
	 * esta é uma senha para a conta so pra conta "futura implementacao"
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
	
	
		
	public double getCPMF() {
		return CPMF;
	}

	public void setCPMF(double cPMF) {
		CPMF = (cPMF/100);
	}
	
	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
		
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/*
	 * construtos unico que obriga a setar numero ca conta , numero do cliente e o saldo inicial
	 */
	public Conta(String numeroconta,String numerocliente) {
		// TODO Auto-generated constructor stub
			setNumConta(numeroconta);
			setNumCliente(numerocliente);
	}

	public String getNumConta() {
		return NumConta;
	}

	public void setNumConta(String numConta) {
		this.NumConta = numConta;
	}

	public String getNumCliente() {
		return NumCliente;
	}

	public void setNumCliente(String numCliente) {
		this.NumCliente = numCliente;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void saque(double valor){
		
		setTipos("saque");
		
		double saldoAtual = getSaldo();
		
		double descontado;
		
		
		if (saldoAtual >= valor ){
			
			descontado = saldoAtual - valor;
			
			setSaldo(descontado);
			
			Operacao op = new Operacao(tipos, valor, getSaldo());
			
			op.setData();
				listaOperacoes.add(op);
			
			
			
		}
		
	}

	public void dePosito(double valor){
		
		setTipos("deposito");
		
		double saldoatual = getSaldo();
			setSaldo( saldoatual + valor);
			
			Operacao op = new Operacao(getTipos(), valor, getSaldo());
		op.setData();
		listaOperacoes.add(op);
	}
	
	/**
	 *  verifica se tem fundos pra saques com CPMF
	 */
	public boolean vericaFundosCPMF(double valor){
		
		
		if (valor + (valor * getCPMF())>= getSaldo()) return true;
		return false;
	}

	public boolean addOperacoes(Operacao dados){
		
		listaOperacoes.add(dados);
		return true;
		
	}
	
	public String extrato(){
		
		return listaOperacoes.toString();
	}

	@Override
	public String toString() {
		return "Conta [NumConta=" + NumConta + ", NumCliente=" + NumCliente
				+ ", Saldo=" + Saldo + ", CPMF=" + CPMF + "]";
	}
	}
