/**
 * 
 */
package BC;

/**
 * @author fil
 *
 */
public abstract class Conta implements ContaGenerica {

	

	/**
	 * este é o numero desta conta, devera ser unico em cada agencia
	 */
	private int NumConta;
	/**
	 * este é o numero do cliente , cada cliente tem seu Cadastro Unico ! isto relacionara o cliente com os serviço
	 * ofericidos a ele pelo banco
	 */
	private int NumCliente;
	/**
	 * hue cada conta dem que ter seu saldo !
	 */
	private double Saldo;

	private double CPMF;
	
//	private double taxaExtra;
//	
//	private double juros;
//	
	public double getCPMF() {
		return CPMF;
	}

	public void setCPMF(double cPMF) {
		CPMF = (cPMF/100);
	}

//	public double getTaxaExtra() {
//		return taxaExtra;
//	}
//
//	public void setTaxaExtra(double taxaExtra) {
//		this.taxaExtra = (taxaExtra/100);
//	}

	/**
	 * esta é uma senha para a conta so pra conta "futura implementacao"
	 */
		private String senha;
	
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/*
	 * construtos unico que obriga a setar numero ca conta , numero do cliente e o saldo inicial
	 */
		public Conta(int numeroconta,int numerocliente,double valo) {
		// TODO Auto-generated constructor stub
			setNumConta(numeroconta);
			setNumCliente(numerocliente);
			setSaldo(valo);
	}

	public int getNumConta() {
		return NumConta;
	}

	public void setNumConta(int numConta) {
		NumConta = numConta;
	}

	public int getNumCliente() {
		return NumCliente;
	}

	public void setNumCliente(int numCliente) {
		NumCliente = numCliente;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void saque(double valor){
		double saldoAtual = getSaldo();
		double descontado;
		if (saldoAtual >= valor ){
			
			descontado = saldoAtual - valor;
			
			setSaldo(descontado);
		}
		
	}

	public void dePosito(double valor){
		
		double saldoatual = getSaldo();
			setSaldo( saldoatual + valor);
		
	}
	/*
	 * verifica se tem fundos pra saques com CPMF
	 */
	public boolean vericaFundosCPMF(double valor){
		
		
		if (valor + (valor * getCPMF())>= getSaldo()) return true;
		return false;
	}

	@Override
	public String toString() {
		return "Conta [NumConta=" + NumConta + ", NumCliente=" + NumCliente
				+ ", Saldo=" + Saldo + ", CPMF=" + CPMF + "]";
	}
	
}
