/**
 * 
 */
package BC;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 	Heryson
 * 		&	Filipe
 *
 */
public class Agencia {


	ContaGenerica conta;

	/**
	 * Esta são as variaveis da agencia!
	 */
	/**
	 * numero desta agencia
	 */
	private String numAgencia;

	/**
	 * numero das conta nao usada no momento
	 */
	private String numeContas;

	/**
	 * numero das poupancas nao usadas no momento
	 */
	private String numPoupanca;

	/**
	 * Lista de Clientes (Contas da Agencia)
	 * O primeiro campo {CHAVE} (String) eh o numero da conta do cliente, e o segundo campo {VALOR} eh um cliente (objeto)
	 */
	protected HashMap<String, ClienteBancario> clientes = new HashMap<>();

	/**
	 * lista de contas da agência(NO FORMATO HASH MAP). O primeiro campo {CHAVE} eh o numero de conta, e o segundo campo {VALOR} eh uma conta (objeto)
	 */
	protected HashMap<String, Conta> contas = new HashMap<String, Conta>();

	/**
	 * relação da lista de contas com tal cliente: o primeiro campo {CHAVE} eh o numero de conta, e o segundo campo {VALOR} eh o numero de cliente
	 */
	protected HashMap<String, String> cclientes = new HashMap<String, String>();

	/**
	 * Construtor para Agencia que inicia com um numero de agencia definido
	 */
	public Agencia(String numagencia) {
		this.numAgencia = numagencia;
	}

	/**
	 * Construtor padrao para Agencia
	 */
	public Agencia (){

	}

	/**
	 * Get's e Set's das variaveis da classe
	 */
	/**
	 * getter para numero de agencia
	 * @return retorna o numero de agencia
	 */
	public String getAgencia() {
		return numAgencia;
	}

	/**
	 * setter para numero de agencia
	 * @param agencia recebe um numero de agencia para atribuir a este campo
	 */
	public void setAgencia(String agencia) {
		this.numAgencia = agencia;
	}

	/**
	 * retorna uma String  numero das contas
	 * @return
	 */
	public String getNumeContas() {

		return numeContas;
	}

	/**
	 * seta a variavel do numero de contas
	 * @param numCon
	 */
	public void setNumeContas(String numCon) {
		this.numeContas = numCon;
	}

	/**
	 * retorna uma String com numero da poupanca
	 * @return
	 */
	public String getNumPoupanca() {
		return numPoupanca;
	}

	/**
	 * Seta a variavel numro da poupanca
	 * @param numPoup
	 */
	public void setNumPoupanca(String numPoup) {
		this.numPoupanca = numPoup;
	}

	/**
	 * Cadastra uma Conta para um indivíduo na agência escolhida
	 * @param numagencia o número que definirá em qual agência será realizada a operação 
	 * @param numcliente número que representa o cliente
	 * @param numconta numero da conta desejado: digita-se um numero iniciando com 0 se for uma conta corrente, e com 1 se for uma poupança
	 * @return true se foi um sucesso, e false caso contrário
	 */
	public boolean cadastraContaCliente (String numagencia, String numcliente, String numconta) {
		// Se agência existir...
		if(this.getAgencia().equals(numagencia)){
			// E se o cliente existir E a conta ainda não existe....
			//System.out.println("Encontrei a agência!");
			if (this.clientes.containsKey(numcliente) && !this.contas.containsKey(numconta)){
				//	System.out.println("Encontrei o cliente!");
				// cadastre a conta do cliente
				// o tipo de conta depende do numero de conta fornecido: se começar com 0, é conta corrente, se começar com 1, é poupança
				//System.out.println("Número de conta " + numconta + " começa com " + numconta.charAt(0));
				if (numconta.startsWith("0")){
					System.out.println("É uma conta corrente!");
					Conta con = new ContaCorrente(numconta, numcliente);
					this.contas.put(numconta, con);
					//System.out.println("conta adicionada ao map de contas!");
					this.cclientes.put(numconta, numcliente);
					Set<String> numcontas = this.cclientes.keySet();
					System.out.println("Contas armazenadas: " + numcontas);
					System.out.println("parabéns, agora voce cadastrou a conta " + con.getNumConta() + " para o cliente: " + this.clientes.get(numcliente).getNomeCliente());
					alteraTaxaextra(numconta, 2.00);
					return true;

				}
				else if (numconta.startsWith("1")){
					System.out.println("É uma poupanca!");
					Conta con = new Poupanca(numconta, numcliente);
					this.contas.put(numconta, con);
					this.cclientes.put(numconta, numcliente);
					System.out.println("parabéns, agora voce cadastrou a conta " + con.getNumConta() + " para o cliente: " + this.clientes.get(numcliente).getNomeCliente());
					return true;
				}
			}

		}
		// Senão, desista
		System.out.println("Nao encontrei a agência. Desisto.");
		return false;
	}

	/**
	 * Exclui uma Conta de um Cliente em específico de uma determinada agência
	 * @param numagencia número da agência onde será realizada a operação
	 * @param numcliente número do cliente o qual terá uma conta removida
	 * @param numconta número da conta que será removida
	 * @return retorna true se conseguir remover com sucesso, e false caso contrário
	 */
	public boolean excluiContaCliente (String numagencia, String numcliente, String numconta) {
		// Se agência existir...
		//int numagencia_convertido = Integer.parseInt(numagencia);
		if(this.getAgencia().equals(numagencia)){
			// E se o cliente existir E a conta existir....
			System.out.println("Encontrei a agência!");
			if (this.clientes.containsKey(numcliente) && this.contas.containsKey(numconta)){
				System.out.println("Encontrei o cliente e sua conta!");
				// remova esta conta do cliente
				this.contas.remove(numconta);
				this.cclientes.remove(numconta);
				return true;
			}
		}
		// Senão, desista
		System.out.println("Nao encontrei a agência. Desisto.");
		return false;
	}

	/**
	 * Cadastra um Cliente na agência desejada
	 * @param numagencia número da agência onde será realizada a operação
	 * @param numcliente número desejado para o cliente
	 * @param nome nome do indivíduo
	 * @return retorna um cliente (embora seja inútil - poderia retornar um boolean)
	 */
	public boolean cadastraCliente (String numagencia, String numcliente, String nome) {

		ClienteBancario c = new ClienteBancario(numcliente, nome);
		//System.out.println("recebi numagencia " + numagencia + " e recebi numcliente " + numcliente + " e o nome " + nome);
		// Se agência existir...
		System.out.println("O numero desta agencia: " + this.getAgencia());
		if(this.getAgencia().equals(numagencia)){
			// E se o cliente não existir....
			//System.out.println("Eu enxergo a agencia.");
			if (!this.clientes.containsKey(numcliente)){
				// cadastre o cliente
				//System.out.println("O cliente nao existe.");
				this.clientes.put(numcliente, c);
				System.out.println("parabéns, agora voce cadastrou o cliente: " + this.clientes.get(numcliente).getNomeCliente());
				return true;
			}
			// Senão, desista

			else {
				return false;
			}
		}
		else {
			System.out.println("Nao encontrei agencia.");
			return false;
		}
	}

	/**
	 * Remove um cliente, e todas as contas associadas a este, de uma agência
	 * @param numagencia número da agência onde será feita a operação
	 * @param numcliente número do cliente o qual se deseja excluir
	 * @return retorna true em caso de sucesso, e false caso contrário
	 */
	public boolean excluiCliente (String numagencia, String numcliente) {
		// Se agência existir...
		if(this.getAgencia().equals(numagencia)){
			// E se o cliente existir....
			if (this.clientes.containsKey(numcliente)){
				if (this.cclientes.containsValue(numcliente)) {
					System.out.println("Este cliente ainda tem contas. Nao se pode remover um cliente com contas.");
					return false;
				}
				else{

					//				Set<String> numcontas = this.cclientes.keySet();

					// remova o cliente
					this.clientes.remove(numcliente);
					System.out.println("Cliente removido com sucesso. ");
					return true;
				}
			}
			// Senão, desista
			else return false;
		}
		else return false;
	}

	/**
	 * Pesquisar as contas de um determinado indivíduo em uma agência bem definida
	 * @param numagencia número da agência de onde se deseja realizar a pesquisa
	 * @param numcliente número do cliente desejado
	 * 
	 */
	public void pesquisaCliente (String numagencia, String numcliente){
		// se a agência existe...
		//System.out.println("recebi numagencia " + numagencia + " e recebi numcliente" + numcliente);
		if (this.getAgencia().equals(numagencia)){
			//System.out.println("achei a agencia, e seu numero eh: " + this.getAgencia());
			// Se o cliente existe na agência E há contas desse cliente 
			
			System.out.println("Cliente: " + this.clientes.get(numcliente).getNomeCliente());
			System.out.println("Contas do cliente:\n");
			Set<String> numcontas = this.cclientes.keySet();
			System.out.println("Contas armazenadas: " + numcontas);
			if (this.clientes.containsKey(numcliente) && this.cclientes.containsValue(numcliente)){
				for(String vassoura : numcontas){
					System.out.println("Procurando pela conta:" + vassoura);
					if (this.cclientes.containsKey(vassoura) && this.cclientes.get(vassoura).equalsIgnoreCase(numcliente)){

						System.out.println("conta: " + vassoura);
					}
					
				}
			}
		}
		
		else {
			System.out.println("Nao exixte este cliente");
		}
	}

	/**
	 * Pesquisa os dados de um cliente a partir de seu número, em uma agência
	 * @param numagencia número da agência de onde se deseja realizar a pesquisa
	 * @param numcliente número do cliente desejado
	 * @return retorna true caso consiga encontrar algo, e false caso contrario
	 */
	public boolean pesquisaConta(String numagencia, String numcliente, String numconta){
		//Se a agência existe
		if (this.getAgencia().equals(numagencia)){
			System.out.println("contém esta agência!");
			// Se esta agência contém este cliente e esta conta
			if (this.clientes.containsKey(numcliente) && this.contas.containsKey(numconta)){
				//System.out.println("contem esta conta!");
				System.out.println("Dados da conta:\n");
				System.out.println(this.contas.get(numconta).toString());
				//			System.out.println("Cliente:" + this.clientes.get(numcliente).getNomeCliente());
				return true;
			}
		}
		return false;
	}

	/**
	 * Deposita na conta deste numero acrecenta no saldo  
	 * @param numDaConta numero da conta que sera creditado o valor 
	 * @param valor o valor que sera criditado 
	 * @return retona true se operacao for feita e false caso contrario
	 */
	public boolean depositoEmConta( String numDaConta , double valor){

		//	if (pesquisaConta(numAgencia, numCliente)){

		contas.get(numDaConta).dePosito(valor);
		//		
		//	return true;
		//	}

		return true;

	}

	/**
	 * Saque ou retirada da conta deste numero decresce o saldo 	
	 * @param numDaConta : este eh o numero da conta que sera faita a operacao 
	 * @param valor : o valor que sera retirado da conta
	 */
	public void saqueDaConta(String numDaConta, double valor){

		contas.get(numDaConta).saque(valor);

		//	return false;
	}


	/**
	 * retorna uma string com o extrato desta conta 
	 * @param numConta o numero da contas a ser impressa
	 * @return string com o movimento finaceiro da conta 
	 */
	public String extratoConta(String numConta){

		return contas.get(numConta).extrato();

	}

	/**
	 * Retona uma string da conta 
	 * @param numConta o numero da conta a ser de
	 * @return
	 */
	public String dadosDaConta(String numConta){

		contas.get(numConta).toString();

		return numConta;

	}
	/**
	 * retona uma string com o saldo da conta
	 * @param numConta é o numero da conta a ser mostrad o saldo 
	 * @return string
	 */
	public String saldoDaconta(String numConta){

		double convert=contas.get(numConta).getSaldo(); 
		String conv = Double.toString(convert);
		return conv;


	}
	/**
	 * Altera a senha de uma conta
	 * @param numConta numero da conta que vai ter senha alterada
	 * @param senha senha atual 
	 * @param novaSenha nova senha
	 * @return retorna true se tudo bem e false caso contrario
	 */
	public boolean alteraSenhaConta(String numConta, String senha, String novaSenha){

		if (contas.containsKey(numConta)){
			contas.get(numConta).setSenha(senha,novaSenha);
		}

		return false;

	}

	/**
	 * seta a taxa extra nas contas
	 */
	public void alteraTaxaextra( String numConta, double taxaExtra ){

		contas.get(numConta).setTaxaExtra(taxaExtra);
	}

	/**
	 * override de toString para imprimir campos de Agencia
	 */
	@Override
	public String toString() {
		return "Agencia [conta=" + conta.toString() + ", numAgencia=" + numAgencia
				+ ", numeContas=" + numeContas + ", numPoupanca=" + numPoupanca
				+ ", clientes=" + clientes.toString() + ", contas=" + contas + ", cclientes="
				+ cclientes.toString() + "]";
	}

}
