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
	/**
	 * getter para nome do cliente
	 * @return retorna uma string com o nome do cliente (campo)
	 */
	public String getNomeCliente() {
		return NomeCliente;
	}

	/**
	 * setter para nome do cliente
	 * @param nomeCliente recebe um nome e atribui ao campo nome do cliente
	 */
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	/**
	 * getter para numero do cliente
	 * @return retorna uma string com o numero do cliente
	 */
	public String getNumCliente() {
		return NumCliente;
	}

	/**
	 * setter para numero do cliente
	 * @param numCliente recebe uma string e atribui ao campo numcliente
	 */
	public void setNumCliente(String numCliente) {
		this.NumCliente = numCliente;
	}

	/**
	 * getter para endereco
	 * @return retorna o campo endereco
	 */
	public String getEndereco() {
		return Endereco;
	}

	/**
	 * setter para endereco
	 * @param endereco recebe uma string e atribui ao campo endereco
	 */
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	/**
	 * getter para o campo telefone
	 * @return retorna o campo telefone
	 */
	public String getTelefone() {
		return Telefone;
	}

	/**
	 * setter para o campo telefone
	 * @param telefone recebe uma string e atribui ao campo telefone
	 */
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	/**
	 * getter para o campo RG
	 * @return retorna o campo RG
	 */
	public String getRG() {
		return RG;
	}

	/**
	 * setter para o campo RG
	 * @param rG recebe uma string e atribui ao campo RG
	 */
	public void setRG(String rG) {
		RG = rG;
	}

	/**
	 * getter para o campo CPF
	 * @return retorna o campo CPF
	 */
	public String getCPF() {
		return CPF;
	}

	/**
	 * setter para o campo CPF
	 * @param cPF recebe uma string e atribui ao campo CPF
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	/**
	 * override do metodo toString para imprimir os campos do cliente
	 */
	@Override
	public String toString() {
		return "ClienteBancario \nNome: " + getNomeCliente() + "\n Endereco: " + Endereco + "Telefone:"
				+ getTelefone() + "RG: " + getRG() + "CPF: " + getCPF() + "]";
	}

	/**
	 * construtor, exigencia minima pra um cliente estanciar um cliente nome e numero do cliente
	 */
	public ClienteBancario(String numCliente,String nomeCliente) {
		// TODO Auto-generated constructor stub
		setNumCliente(numCliente);
		setNomeCliente(nomeCliente);
	
	
	}

}
