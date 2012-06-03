/**
 * 
 */
package BC;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


/**
 * @author fil
 *
 */
public class Banco {
	
	/*
	 * instanciando cliente 
	 * 
	 */

	/**
	 * 
	 */
//	HashMap<Cn,cL> ListaClientes = new HashMap();
	
	/**
	 * aqui deve ficas as agencias criadas
	 */
	 
	 
	 
	 
	 // supondo que estou fazendo com hashmap
	
	 
	 // Lista de agências do Banco
	 // O primeiro campo (String) é o número da agência, e o segundo campo (Agencia) é a agência em si
	 HashMap<String, Agencia> agencias = new HashMap<String, Agencia>();
	 
	 
//	 // Lista de Clientes (Contas da Agência)
//	 // O primeiro campo (String) é o número da conta do cliente, e o segundo campo é o cliente ao qual esta conta está associada
//	 HashMap<String, ClienteBancario> clientes = new HashMap<>();
	 
	 
//	 agencias
	/**
	 * 
	 */
	public Banco() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * cadastrar agência
	 */
	public Agencia cadastraAgencia(String numagencia){
//		String numagencia_convertido = String.valueOf(numagencia);
		if(!agencias.containsKey(numagencia))	{
			Agencia a = new Agencia(numagencia);
			agencias.put(numagencia, a);
			return a;
		}
		else return null;
	}
	
	/**
	 * cadastrar cliente na agência
	 */
	public ClienteBancario cadastraCliente (String numagencia, String numcliente, String nome) {
//		String numagencia_convertido = String.valueOf(numagencia);
		ClienteBancario c = new ClienteBancario(numcliente, nome);
		
		// Se agência existir...
		if(agencias.containsKey(numagencia)){
//			String numcliente_convertido = String.valueOf(numcliente);
//			String numconta_convertido = String.valueOf(numconta);
			// E se o cliente não existir....
			if (!agencias.get(numagencia).clientes.containsKey(numcliente)){
			// cadastre o cliente
				agencias.get(numagencia).clientes.put(numcliente, c);
				System.out.println("parabéns, agora voce cadastrou o cliente: " + agencias.get(numagencia).clientes.get(numcliente).getNomeCliente());
				return c;
			}
			// Senão, desista
			else return null;
		}
		else return null;
	}
	
	/**
	 * cadastrar a conta do cliente na agência
	 */
	public boolean cadastraContaCliente (String numagencia, String numcliente, String numconta) {
//		String numagencia_convertido = String.valueOf(numagencia);
//		String numcliente_convertido = String.valueOf(numcliente);
//		String numconta_convertido = String.valueOf(numconta);
		
		// Se agência existir...
		if(agencias.containsKey(numagencia)){
			// E se o cliente existir....
			System.out.println("Encontrei a agência!");
			if (agencias.get(numagencia).clientes.containsKey(numcliente)){
				System.out.println("Encontrei o cliente!");
			// cadastre a conta do cliente
				// o tipo de conta depende do numero de conta fornecido: se começar com 0, é conta corrente, se começar com 1, é poupança
				System.out.println("Número de conta " + numconta + " começa com " + numconta.charAt(0));
				if (numconta.startsWith("0")){
					System.out.println("É uma conta corrente!");
					Conta con = new ContaCorrente(numconta, numcliente);
					agencias.get(numagencia).contas.put(numconta, con);
					System.out.println("conta adicionada ao map de contas!");
//					else System.out.println("por algum motivo, falhou.");
//						agencias.get(numagencia_convertido).concliente.add(numconta_convertido);
						agencias.get(numagencia).cclientes.put(numconta, numcliente);
						Set<String> numcontas = agencias.get(numagencia).cclientes.keySet();
						System.out.println("Contas armazenadas: " + numcontas);
						System.out.println("parabéns, agora voce cadastrou a conta " + con.getNumConta() + " para o cliente: " + agencias.get(numagencia).clientes.get(numcliente).getNomeCliente());
						return true;
					
				}
				else if (numconta.startsWith("1")){
					System.out.println("É uma poupanca!");
					Conta con = new Poupanca(numconta, numcliente);
					agencias.get(numagencia).contas.put(numconta, con);
					agencias.get(numagencia).cclientes.put(numconta, numcliente);
						System.out.println("parabéns, agora voce cadastrou a conta " + con.getNumConta() + " para o cliente: " + agencias.get(numagencia).clientes.get(numcliente).getNomeCliente());
						return true;
				}
			}
			
		}
		// Senão, desista
				System.out.println("Nao encontrei a agência. Desisto.");
				return false;
			}
	
	/**
	 * Pesquisar as contas de um determinado indivíduo em uma agência bem definida
	 * @param numagencia
	 * @param numcliente
	 */
	public void pesquisaCliente (String numagencia, String numcliente){
//		String numagencia_convertido = String.valueOf(numagencia);
//		String numcliente_convertido = String.valueOf(numcliente);
//		Set<String> chaves = mapa.keySet();  
//        for (Iterator<String> iterator = chaves.iterator(); iterator.hasNext();)  
//        {  
//            String chave = iterator.next();  
//            if(chave != null)  
//                System.out.println(chave + mapa.get(chave));  
//        } 
		
		// se a agência existe...
		if (agencias.containsKey(numagencia)){
			System.out.println("achei a agencia, e seu numero eh: " + agencias.get(numagencia).getAgencia());
			// para cada conta do cliente
//			for (int i = 1 ; i <= (agencias.get(numagencia_convertido)).clientes.size() ; i++) {
			// Se o cliente existe na agência E há contas desse cliente 
			Set<String> numcontas = agencias.get(numagencia).cclientes.keySet();
			System.out.println("Contas armazenadas: " + numcontas);
			if (agencias.get(numagencia).clientes.containsKey(numcliente) && agencias.get(numagencia).cclientes.containsValue(numcliente)){
//				if (agencias.get(numagencia_convertido).cclientes.containsValue(numcliente_convertido)){
					for(Iterator vassoura = numcontas.iterator(); vassoura.hasNext();){
						
						if (agencias.get(numagencia).contas.containsKey(vassoura)){
							Object key = vassoura.next(); 
							System.out.println("conta: " + key);
						}
						
					}
					
					//CONTEM UM BUG - necessario descobrir porque está guardando NULL
//					System.out.println(agencias.get(numagencia_convertido).contas.get(agencias.get(numagencia_convertido).contas.containsValue(numcliente_convertido)));
//				}
			}
		}
	}
		
		/**
		 * Pesquisa os dados de um cliente a partir de 
		 * @param numagencia
		 * @param numcliente
		 */
	public void pesquisaConta (String numagencia, String numcliente, String numconta){
//		String numagencia_convertido = String.valueOf(numagencia);
//		String numcliente_convertido = String.valueOf(numcliente);
//		String numconta_convertido = String.valueOf(numconta);
//		ArrayList<String> texto = new ArrayList<>();
//		for (int i = 0 ; i <= (agencias.get(numagencia_convertido)).clientes.size() ; i++) {
		// Se a agência existe
			if (agencias.containsKey(numagencia)){
				System.out.println("contém esta agência!");
				// Se esta agência contém este cliente
				if (agencias.get(numagencia).clientes.containsKey(numcliente)){
					System.out.println("contem este cliente!");
					agencias.get(numagencia).clientes.get(numcliente).getNomeCliente();
//					if (agencias.get(numagencia_convertido).contas.get(numconta_convertido) != null){
//						System.out.println("contém esta conta!");
////						texto.add(agencias.get(numagencia_convertido).clientes.get(numcliente_convertido).toString());
//						System.out.println(agencias.get(numagencia_convertido).clientes.get(numcliente_convertido).toString());
//					}
				}
			}
		}
	}
//	public boolean CadastraCliente(String nome, String telefone) {
//		
//		
//		
//		
//		return 0;
//	}