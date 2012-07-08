/**
 * 
 */
package MN;

import BC.Banco;
import java.util.Scanner;

import ST.Estado;

/**
 * @author fil
 *
 */
public class Menu {







	/**
	 * Menu mostra opcoes de operacao para o banco 
	 */



	public void mostraMenu(Banco banco){
		//		Banco banco = new Banco();
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
			System.out.println("	15.	existe agencia?");
			System.out.println("	16.	existe conta?");
			System.out.println("	17.	listar agencias");
			System.out.println("	18.	listar contas de X agencia");
			System.out.println("	19.	recup banco");
			System.out.println("	20.	recup agencia");
			System.out.println("	21.	salvar agencia");
			System.out.println("--------------------------");
			System.out.println("	Digite uma opcao:____");



			Scanner entra = new Scanner(System.in);
			opcao = entra.nextInt();

			/**
			 * switch que chama as varias opcoes do Menu 
			 */
			switch (opcao) {

			case 1:

				//				System.out.println("Deseja cadastrar uma agencia? S/N\n");
				//				
				//				Scanner entrad = new Scanner(System.in);
				//				  String nome = entrad.next();
				//				  System.out.println(nome);

				//				  if (nome.equals("s")||nome.equals("S")){


//				System.out.println("Digite o numero da agencia:");
//
//				Scanner entrad = new Scanner(System.in);
//				String numAgencia = entrad.next();
//				System.out.println(numAgencia);
//				//								String  numAgencia = Integer.toString(entrou);
//				//								System.out.println (numAgencia);
				banco.cadastraAgencia();


				//				else {
				//					System.out.println("Desistencia do cadastro da agencia");

				break;

				//				String string = new Integer(number).toString();


			case 2:

				System.out.println("Deseja cadastrar um cliente em uma agencia ?\n");

				System.out.println("Digite o nome do cliente:");

				Scanner entrad = new Scanner(System.in);
				String nome = entrad.next();


				System.out.println("Digite o numero da agencia:");

				entrad = new Scanner(System.in);
				String numAgencia = entrad.nextLine();

				//				String numAgencia =  Integer.toString(entrou);

				System.out.println("Digite o numero do cliente:");

				entrad = new Scanner(System.in);
				String numCliente= entrad.nextLine();
				//				 String  numCliente = Integer.toString(entrou);

				System.out.println(banco.cadastraClienteEmAgencia(numAgencia, numCliente, nome));
				//System.out.println("agencia " + banco.agencias.get(numAgencia).getAgencia() + " agora tem " + banco.agencias.get(numAgencia).clientes.size() + " clientes.");


				break;

			case 3:


				System.out.println("Digite o numero da agencia: \n");


				entrad = new Scanner(System.in);
				String peganumAgencia = entrad.next();
				System.out.println(peganumAgencia);

				System.out.println("Digite o numero do cliente \n");


				entrad = new Scanner(System.in);
				String peganumCliente= entrad.next();


				System.out.print(banco.pesquisaClienteEmagencia(peganumAgencia, peganumCliente));
				//					banco.agencias.get(peganumAgencia).pesquisaCliente(peganumAgencia, peganumCliente);

				break;
			case 4:
				System.out.println("Digite o numero da agencia: \n");


				entrad = new Scanner(System.in);
				numAgencia = entrad.next();

				System.out.println("Digite o numero do cliente \n");


				entrad = new Scanner(System.in);
				numCliente = entrad.next();


				System.out.println(banco.excluirCienteDaAgendia(numAgencia, numCliente));

				break;
			case 5:

				System.out.println("Digite o numero da agencia: \n");


				entrad = new Scanner(System.in);
				numAgencia = entrad.next();

				System.out.println("Digite o numero do cliente \n");


				entrad = new Scanner(System.in);
				numCliente = entrad.next();

				System.out.println("Digite o numero da conta \n");


				entrad = new Scanner(System.in);
				String  numConta = entrad.next();

				System.out.println(banco.cadatraContaEmAgencia(numAgencia, numCliente, numConta));
				break;
			case 6:


				System.out.println("Digite o numero da agencia: \n");


				entrad = new Scanner(System.in);
				numAgencia = entrad.next();

				System.out.println("Digite o numero do cliente \n");


				entrad = new Scanner(System.in);
				numCliente = entrad.next();

				System.out.println("Digite o numero da conta \n");


				entrad = new Scanner(System.in);
				numConta = entrad.next();

				System.out.println(banco.excluirContaDaAgencia(numAgencia, numCliente, numConta));

				break;
			case 7:

				System.out.println("Digite o numero da agencia: \n");


				entrad = new Scanner(System.in);
				numAgencia = entrad.next();

				System.out.println("Digite o numero do cliente \n");


				entrad = new Scanner(System.in);
				numCliente = entrad.next();

				System.out.println("Digite o numero da conta \n");


				entrad = new Scanner(System.in);
				numConta = entrad.next();



				System.out.println(banco.pesquisaContaNaAgencia(numAgencia, numCliente, numConta));

				break;
			case 8:
				System.out.println("Digite o numero da agencia: \n");


				entrad = new Scanner(System.in);
				numAgencia = entrad.next();

				System.out.println("Digite o numero da conta \n");


				entrad = new Scanner(System.in);
				numConta = entrad.next();



				System.out.println(banco.saldoConta(numAgencia, numConta));

				break;
case 9:
	System.out.println("Digite o numero da agencia: \n");


	entrad = new Scanner(System.in);
	numAgencia = entrad.next();

	System.out.println("Digite o numero da conta \n");


	entrad = new Scanner(System.in);
	numConta = entrad.next();



	System.out.println(banco.extratoConta(numAgencia, numConta));

	break;
case 10:
	System.out.println("Digite o numero da agencia: \n");


	entrad = new Scanner(System.in);
	numAgencia = entrad.next();

	System.out.println("Digite o numero da conta \n");


	entrad = new Scanner(System.in);
	numConta= entrad.next();

	System.out.println("Digite o valor do deposito: \n");

	entra = new Scanner(System.in);
	int valor = entra.nextInt();

	System.out.println(banco.depositoConta(numAgencia, numConta, valor));

	break;
case 11:

	System.out.println("Digite o numero da agencia: \n");


	entrad = new Scanner(System.in);
	numAgencia = entrad.next();

	
	System.out.println("Digite a senha: \n");


	entrad = new Scanner(System.in);
	String senha = entrad.next();
	
	System.out.println("Digite o numero da conta: \n");


	entrad = new Scanner(System.in);
	numConta = entrad.next();

	System.out.println("Digite o valor do saque: \n");

	entra = new Scanner(System.in);
	valor = entra.nextInt();

	System.out.println(banco.saqueConta(numAgencia, numConta, senha, valor));


	break;
case 12:
	System.out.println("Digite o numero da agencia: \n");


	entrad = new Scanner(System.in);
	numAgencia = entrad.next();

	System.out.println("Digite o numero da conta \n");


	entrad = new Scanner(System.in);
	numConta = entrad.next();




	System.out.println("Digite a senha atual: \n");


	entrad = new Scanner(System.in);
	 senha  = entrad.next();



	System.out.println("Digite nova senha: \n");


	entrad = new Scanner(System.in);
	String novaSenha  = entrad.next();

	System.out.println(banco.alterarSenhaConta(numAgencia, numConta, senha, novaSenha));


	break;
case 13:
	//salvar sistema
	
	System.out.println(banco.salvarEstadoBC(banco));


	break;
case 14:
	opcao = 14;
	break;

case 15:
	System.out.println("Digite o numero da agencia: \n");


	entrad = new Scanner(System.in);
	numAgencia = entrad.next();

	System.out.println(banco.existAgencia(numAgencia));

	break;

case 16:
	System.out.println("Digite o numero da agencia: \n");


	entrad = new Scanner(System.in);
	numAgencia = entrad.next();

	System.out.println("Digite o numero da conta \n");


	entrad = new Scanner(System.in);
	numConta = entrad.next();

	System.out.println(banco.existeConta(numAgencia, numConta));
	
	break;

case 17:
	System.out.println(banco.listaAgenciasNesteBanco());
	break;

	
case 18:
	System.out.println("Digite o numero da agencia: \n");


	entrad = new Scanner(System.in);
	numAgencia = entrad.next();
	
	System.out.println(banco.listacontasAgencia(numAgencia));
	break;
case 19:
	
	banco = banco.recupEstadoBC();
	
	break;
	
case 20:
	
	banco.recupEstadoAG();
	
	break;
	
case 21:
	
	banco.salvarEstadoAG();
	
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
