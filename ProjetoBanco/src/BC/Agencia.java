/**
 * 
 */
package BC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 	Heryson
 * 		&	Filipe
 *
 */
public class Agencia {

	
ContaGenerica conta;
	
/**
 * Este as variaveis da agencia!
 */
private String numAgencia;
	
private String numeContas;

private String numPoupanca;

/**
 * Lista de Clientes (Contas da Agência)
 * O primeiro campo (String) é o número da conta do cliente, e o segundo campo é o cliente ao qual esta conta está associada
 */
 
protected HashMap<String, ClienteBancario> clientes = new HashMap<>();

/**
 * lista de contas da agência(NO FORMATO HASH MAP). O primeiro campo é uma conta, e o segundo campo é o número de cliente
 */
 protected HashMap<String, Conta> contas = new HashMap<String, Conta>();

/**
 * relação da lista de contas com tal cliente: o primeiro campo é o número de conta, e o segundo é o número de cliente
 */
protected HashMap<String, String> cclientes = new HashMap<String, String>();

/**
 * Construtor para Agência que inicia com um número de agência definido
 */
public Agencia(String numagencia) {
	this.numAgencia = numagencia;
	// TODO Auto-generated constructor stub
}

/**
 * Construtor padrão para Agência
 */
public Agencia (){
	
}

/**
 * Get's e Set's das variaveis da classe
 */
public String getAgencia() {
return numAgencia;
}

public void setAgencia(String agencia) {
this.numAgencia = agencia;
}


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

/**
 * Cadastra uma Conta para um indivíduo na agência escolhida
 * @param numagencia o número que definirá em qual agência será realizada a operação 
 * @param numcliente número que representa o cliente
 * @param numconta numero da conta desejado: digita-se um numero iniciando com 0 se for uma conta corrente, e com 1 se for uma poupança
 * @return true se foi um sucesso, e false caso contrário
 */
public boolean cadastraContaCliente (String numagencia, String numcliente, String numconta) {
	// Se agência existir...
	if(this.getAgencia() == numagencia){
		// E se o cliente existir E a conta ainda não existe....
		System.out.println("Encontrei a agência!");
		if (this.clientes.containsKey(numcliente) && !this.contas.containsKey(numconta)){
			System.out.println("Encontrei o cliente!");
		// cadastre a conta do cliente
			// o tipo de conta depende do numero de conta fornecido: se começar com 0, é conta corrente, se começar com 1, é poupança
			System.out.println("Número de conta " + numconta + " começa com " + numconta.charAt(0));
			if (numconta.startsWith("0")){
				System.out.println("É uma conta corrente!");
				Conta con = new ContaCorrente(numconta, numcliente);
				this.contas.put(numconta, con);
				System.out.println("conta adicionada ao map de contas!");
					this.cclientes.put(numconta, numcliente);
					Set<String> numcontas = this.cclientes.keySet();
					System.out.println("Contas armazenadas: " + numcontas);
					System.out.println("parabéns, agora voce cadastrou a conta " + con.getNumConta() + " para o cliente: " + this.clientes.get(numcliente).getNomeCliente());
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
	if(this.getAgencia() == numagencia){
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
	
		// Se agência existir...
		if(this.getAgencia() == numagencia){
			// E se o cliente não existir....
			if (!this.clientes.containsKey(numcliente)){
				// cadastre o cliente
				this.clientes.put(numcliente, c);
					System.out.println("parabéns, agora voce cadastrou o cliente: " + this.clientes.get(numcliente).getNomeCliente());
			return true;
		}
		// Senão, desista
		else return false;
	}
	else return false;
}

/**
 * Remove um cliente, e todas as contas associadas a este, de uma agência
 * @param numagencia número da agência onde será feita a operação
 * @param numcliente número do cliente o qual se deseja excluir
 * @return retorna true em caso de sucesso, e false caso contrário
 */
public boolean excluiCliente (String numagencia, String numcliente) {
	// Se agência existir...
	if(this.getAgencia() == numagencia){
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
 * @param numagencia
 * @param numcliente
 */
public void pesquisaCliente (String numagencia, String numcliente){
	// se a agência existe...
	if (this.getAgencia() == numagencia){
		System.out.println("achei a agencia, e seu numero eh: " + this.getAgencia());
		// Se o cliente existe na agência E há contas desse cliente 
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
}

/**
 * Pesquisa os dados de um cliente a partir de seu número, em uma agência
 * @param numagencia número da agência de onde se deseja realizar a pesquisa
 * @param numcliente número do cliente desejado
 * @return retorna true caso consiga encontrar algo, e false caso contrário
 */
public boolean pesquisaConta(String numagencia, String numcliente){
 //Se a agência existe
	if (this.getAgencia() == numagencia){
		System.out.println("contém esta agência!");
		// Se esta agência contém este cliente
		if (this.clientes.containsKey(numcliente)){
			System.out.println("contem este cliente!");
			System.out.println("Cliente:" + this.clientes.get(numcliente).getNomeCliente());
			return true;
		}
	}
	return false;
}

/**
 * Deposida na conta deste numero acrecenta no saldo  
 * @param numDaConta numero da conta que sera creditado o valor 
 * @param valor o valor que sera criditado 
 * return retona true se operacao for feita e false caso contrario
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
 * Saque ou retirada da conta deste numero decrece o saldo 	
 * @param numDaConta : este é o numero da conta que sera faita a operacoa 
 * @param valor : o valor que sera retirado da conta
 * @return true se ocorreu tudo bem , false caso contrario
 */
public boolean saqueDaConta(String numDaConta, double valor){
	
	contas.get(numDaConta).saque(valor);
	
	return false;
}


/**
 * redotna uma string com o extrato desta conta 
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
 * @return retorna true se tudo bem e faulse caso contrario
 */
public boolean alteraSenhaConta(String numConta, String senha, String novaSenha){
	
	if (contas.containsKey(numConta)){
		contas.get(numConta).setSenha(senha,novaSenha);
	}
	
	return false;
	
}

@Override
public String toString() {
	return "Agencia [conta=" + conta.toString() + ", numAgencia=" + numAgencia
			+ ", numeContas=" + numeContas + ", numPoupanca=" + numPoupanca
			+ ", clientes=" + clientes.toString() + ", contas=" + contas + ", cclientes="
			+ cclientes.toString() + "]";
}
 
}
