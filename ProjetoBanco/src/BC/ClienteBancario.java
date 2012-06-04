/**
 * 
 */
package BC;

/**
 * @author fil
 *
 */
public class ClienteBancario {

	/**
	 * Nome do cliente do banco
	 */
	private String NomeCliente;
	/**
	 * este é o numero do cliente , com este numero as contas serao localizadas
	 */
	private String NumCliente;
	/**
	 * sera o endereco, opcional 
	 */
	private String Endereco;
	/**
	 * telefone do cara, opcional
	 */
	private String Telefone;
	/**
	 * registro geral do cliente tambem opcional por enquanto
	 */
	private String RG;
	/**
	 * CPF do cliente, opcional por enquanto
	 */
	private String CPF;

	/**
	 * geters e seters da galera acima
	 */
	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public String getNumCliente() {
		return NumCliente;
	}

	public void setNumCliente(String numCliente) {
		this.NumCliente = numCliente;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	
	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

	@Override
	public String toString() {
		return "ClienteBancario [NomeCliente=" + NomeCliente + ", Endereco=" + Endereco + ", Telefone="
				+ Telefone + ", RG=" + RG + ", CPF=" + CPF + "]";
	}

	/*
	 * construtor, exigencia minima pra um cliente estanciar um cliente nome e numero do cliente
	 */
	public ClienteBancario(String numCliente,String nomeCliente) {
		// TODO Auto-generated constructor stub
		setNumCliente(numCliente);
		setNomeCliente(nomeCliente);
	
	
	}

}
