/**
 * 
 */
package BC;

import java.util.Scanner;

/**
 * @author fil
 *
 */
public class Menu {

	 Banco banco = new Banco();
	
	
	
	
	
	/**
	 * Menu mostra opcoes de operacao para o banco 
	 */
	
	

	public void mostraMenu(){
		int opcao=0 ;
		while(opcao != 14){
			
			System.out.println("--- Menu Banco ---");
			System.out.println("	1.	Cadastrar agencia");
			System.out.println("	2.	Cadastrar cliente na agencia");
			System.out.println("	3.	Pesquisar cliente na agencia");
			System.out.println("	4.	Excluir cliente da agencia");
			System.out.println("	5.	Cadastrar conta (associada a um cliente) na agencia");
			System.out.println("	6.	Excluir conta da agencia (corrente ou pupanca)");
			System.out.println("	7.	Pesuquisar conta na agencia (corrente ou pupanca)");
			System.out.println("	8.	Saldo (geral ) de uma conta (corrente ou pupanca)");
			System.out.println("	9.	Extrato (detalhado) de uam conta (corrente ou pupanca)");
			System.out.println("	10.	Deposito em  uma conta (corrente ou pupanca)");
			System.out.println("	11.	Saque em uma conta (corrente ou pupanca)");
			System.out.println("	12.	Alterar senha do cliente");
			System.out.println("	13.	Salvar estado do sistema");
			System.out.println("	14.	SAIR");
			System.out.println("--------------------------");
			System.out.println("	Digite uma opcao:____");
			
			

			Scanner entra = new Scanner(System.in);
			opcao = entra.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Deseja cadastrar uma conta? S/N\n");
				
				Scanner entrad = new Scanner(System.in);
				  String nome = entrad.next();
				
				  if (nome.equals("s")||nome.equals("S")){
				
					
						System.out.println("Digite o numero da agencia:");
				
							Scanner entrada = new Scanner(System.in);
								int entrou = entrada.nextInt();
	
								String  numAgencia = Integer.toString(entrou);
								System.out.println (numAgencia);
					System.out.println (banco.cadastraAgencia(numAgencia));
					
				}
				else {
					System.out.println("Desistencia de cadastra agencia");
				}
				break;
//				String string = new Integer(number).toString();

				
			case 2:
				
				System.out.println("Deseja cadastrar um clirnte em uma agencia ?\n");
				
				System.out.println("Digite o nome do cliente:");
				
				 entrad = new Scanner(System.in);
				   nome = entrad.next();
				 
				
				System.out.println("Digite o numero da agencia:");
				
				Scanner entrada11 = new Scanner(System.in);
				 int entrou = entrada11.nextInt();
				
				String numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero do cliente:");
				
				 entrad = new Scanner(System.in);
				 entrou = entrad.nextInt();
				 String  numCliente = Integer.toString(entrou);
					
				 
				 System.out.println (banco.cadastraClienteEmAgencia(numAgencia, numCliente, nome));
				
	
	
				break;
	
			case 3:
				
				
					System.out.println("Digite o numero da agencia: \n");
				
					
					  entrada11 = new Scanner(System.in);
					  entrou = entrada11.nextInt();
					
					numAgencia =  new Integer(entrou).toString();
					
					System.out.println("Digite o numero do cliente \n");
					
					
					  entrada11 = new Scanner(System.in);
					  entrou = entrada11.nextInt();
					
					numCliente =  Integer.toString(entrou);
					 				
					
					banco.pesquisaClienteEmagencia(numAgencia, numCliente);
					
					
				break;
			case 4:
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero do cliente \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numCliente =  Integer.toString(entrou);
				 				
				
				System.out.println (banco.excluirCienteDaAgendia(numAgencia, numCliente));
	
				break;
			case 5:
	
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero do cliente \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numCliente =  Integer.toString(entrou);
				
				System.out.println("Digite o numero da conta \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				String numConta =  Integer.toString(entrou);
				
				System.out.println (banco.cadatraContaEmAgencia(numAgencia, numCliente, numConta));
	
				break;
			case 6:
	
				
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero do cliente \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numCliente =  Integer.toString(entrou);
				
				System.out.println("Digite o numero da conta \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				 numConta =  Integer.toString(entrou);
				
				 System.out.println (banco.excluirContaDaAgencia(numAgencia, numCliente, numConta));
	
				break;
			case 7:
				
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero do cliente \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numCliente =  Integer.toString(entrou);
				
				
				
				System.out.println (banco.pesquisaContaNaAgencia(numAgencia, numCliente));
	
				break;
			case 8:
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero da conta \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numConta =  Integer.toString(entrou);
				
				
				
				System.out.println (banco.saldoConta(numAgencia, numConta));
	
				break;
			case 9:
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero da conta \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numConta =  Integer.toString(entrou);
				
				
				
				System.out.println (banco.extratoConta(numAgencia, numConta));
	
				break;
			case 10:
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero da conta \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numConta =  Integer.toString(entrou);
				
				System.out.println("Digite o valor do deposito: \n");
				
				 entra = new Scanner(System.in);
				int valor = entra.nextInt();
				
				System.out.println (banco.depositoConta(numAgencia, numConta, valor));
	
				break;
			case 11:
				
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero da conta: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numConta =  Integer.toString(entrou);
				
				System.out.println("Digite o valor do deposido: \n");
				
				 entra = new Scanner(System.in);
				 valor = entra.nextInt();
				
				 System.out.println (banco.saqueConta(numAgencia, numConta, valor));
	
	
				break;
			case 12:
				System.out.println("Digite o numero da agencia: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numAgencia =  Integer.toString(entrou);
				
				System.out.println("Digite o numero da conta \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				numConta =  Integer.toString(entrou);
				
				
				
				
				System.out.println("Digite a senha atual: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				String senha =  Integer.toString(entrou);
				
				System.out.println("Digite nova senha: \n");
				
				
				  entrada11 = new Scanner(System.in);
				  entrou = entrada11.nextInt();
				
				String novaSenha =  Integer.toString(entrou);
				
				
				System.out.println (banco.alterarSenhaConta(numAgencia, numConta, senha, novaSenha));
	
	
				break;
			case 13:
	
	
				break;
			case 14:
						opcao = 14;
	
				break;
				
				
	}
		}
			}
	/**
	 * 
	 */
	public Menu() {
		
		
		// TODO Auto-generated constructor stub
	}

}
