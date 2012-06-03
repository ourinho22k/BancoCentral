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

	
	/**
	 * Menu mostra opcoes de operacao para o banco 
	 */
	
	

	public void mostraMenu(int opcao ){

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
				
				
				break;

				
			case 2:
	
	
				break;
	
			case 3:
	
	
				break;
			case 4:
	
	
				break;
			case 5:
	
	
				break;
			case 6:
	
	
				break;
			case 7:
	
	
				break;
			case 8:
	
	
				break;
			case 9:
	
	
				break;
			case 10:
	
	
				break;
			case 11:
	
	
				break;
			case 12:
	
	
				break;
			case 13:
	
	
				break;
			case 14:
	
	
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
