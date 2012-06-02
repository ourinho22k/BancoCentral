/**
 * 
 */
package BC;

import java.util.HashMap;

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
	 int conta;
	 
	 // Lista de agências do Banco
	 // O primeiro campo (String) é o número da agência, e o segundo campo (Agencia) é a agência em si
	 HashMap<String, Agencia> agencias = new HashMap<>();
	 
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
	public Agencia cadastraAgencia(int numagencia){
		Agencia a = new Agencia(numagencia);
		String numagencia_convertido = String.valueOf(numagencia);
		if(!agencias.containsKey(numagencia_convertido))	{
			agencias.put(numagencia_convertido, a);
			return a;
		}
		else return null;
	}
	
	/**
	 * cadastrar cliente na agência
	 */
	public ClienteBancario cadastraCliente (int numagencia, int numcliente, int numconta) {
		String numagencia_convertido = String.valueOf(numagencia);
		ClienteBancario c = new ClienteBancario(numcliente, "José");
		
		// Se agência não existir...
		if(!agencias.containsKey(numagencia_convertido)){
			String numcliente_convertido = String.valueOf(numcliente);
			String numconta_convertido = String.valueOf(numconta);
			// E se o cliente não existir....
			if (agencias.get(numagencia_convertido).clientes.get(numcliente_convertido) == null){
			// cadastre o cliente
				agencias.get(numagencia_convertido).clientes.put(numconta_convertido, c);
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
	public void cadastraContaCliente (int numagencia, int numcliente, int numconta) {
		String numagencia_convertido = String.valueOf(numagencia);
		
		// Se agência não existir...
		if(!agencias.containsKey(numagencia_convertido)){
			String numcliente_convertido = String.valueOf(numcliente);
			String numconta_convertido = String.valueOf(numconta);
			// E se o cliente existir....
			if (agencias.get(numagencia_convertido).clientes.get(numcliente_convertido) != null)
			// cadastre a conta do cliente
				agencias.get(numagencia_convertido).contas.put(numconta_convertido, numcliente_convertido);
			// Senão, desista
		}
	}
		
	/**
	 * Pesquisar as contas de um determinado indivíduo em uma agência bem definida
	 * @param numagencia
	 * @param numcliente
	 */
		public void pesquisaCliente (int numagencia, int numcliente){
			String numagencia_convertido = String.valueOf(numagencia);
			String numcliente_convertido = String.valueOf(numcliente);
//			Set<String> chaves = mapa.keySet();  
//	        for (Iterator<String> iterator = chaves.iterator(); iterator.hasNext();)  
//	        {  
//	            String chave = iterator.next();  
//	            if(chave != null)  
//	                System.out.println(chave + mapa.get(chave));  
//	        } 
			for (int i = 0 ; i <= (agencias.get(numagencia_convertido)).clientes.size() ; i++) {
				if (agencias.containsKey(numagencia_convertido))
					if (agencias.get(numagencia_convertido).clientes.containsKey(numcliente_convertido)){
						System.out.println(agencias.get(numagencia_convertido).clientes.get(numcliente_convertido));
					}
			}
		}
		
		/**
		 * Pesquisa os dados de um cliente a partir de 
		 * @param numagencia
		 * @param numcliente
		 */
		public void pesquisaConta (int numagencia, int numcliente, int numconta){
			String numagencia_convertido = String.valueOf(numagencia);
			String numcliente_convertido = String.valueOf(numcliente);
			String numconta_convertido = String.valueOf(numconta);
			for (int i = 0 ; i <= (agencias.get(numagencia_convertido)).clientes.size() ; i++) {
				if (agencias.containsKey(numagencia_convertido))
					if (agencias.get(numagencia_convertido).clientes.containsKey(numcliente_convertido)){
						if (agencias.get(numagencia_convertido).contas.get(numcliente_convertido).contains(numconta_convertido)){
							System.out.println(agencias.get(numagencia_convertido).clientes.get(numcliente_convertido).toString());
						}
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