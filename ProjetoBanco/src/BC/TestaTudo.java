/**
 * 
 */
package BC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author fil
 *
 */
public class TestaTudo {

	/**
	 * 
	 */
	public TestaTudo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Banco b = new Banco();
		
		
		System.out.println(b.cadastraAgencia("10"));
		System.out.println( b.existAgencia("10"));
		System.out.println( b.existAgencia("11"));
		System.out.println("rep se agencia existe");
		System.out.println(b.existAgencia("10"));
		System.out.println(b.cadastraClienteEmAgencia("10", "200", "vai filhada mae"));
		System.out.println(b.cadatraContaEmAgencia("10", "200", "0103"));
		
//		o , "Filipe"));
//		Set set = b.agencias.keySet();
//
//        // Iterate over the Set to see what it contains.
//        Iterator iter = set.iterator();
//        while (iter.hasNext())
//        {
//            Object o = iter.next();
//            System.out.println("keySet: " + o.toString());
//        }
	
		
//		Set set1 = b.listaClienteDoBanco.keySet();
//
//        // Iterate over the Set to see what it contains.
//        Iterator iter1 = set1.iterator();
//        while (iter1.hasNext())
//        {
//            Object c = iter1.next();
//            System.out.println("keySet: " + c.toString());
//        }

		
//		System.out.println(b.listaClienteDoBanco.get("500"));
//		System.out.println(b.listaClienteDoBanco.get("600"));
//		System.out.println(b.listaClienteDoBanco.get("700"));
//		System.out.println(b.listaClienteDoBanco.get("800"));
//		b.listaClienteDoBanco.get("500").setNomeCliente("Doin pe de pato");
//		
//		System.out.println(b.listaClienteDoBanco.isEmpty());
//		System.out.println("ẗeste se muda");
//		System.out.println(b.listaClienteDoBanco.get("500"));
//		System.out.println( b.imprimeListaDoCliente());
		
		
//		Agencia a = new Agencia();
//		a = b.cadastraAgencia("2");
//		if(a != null) System.out.println("agencia cadastrada com sucesso");
//		a.cadastraCliente("2", "203", "Joao");
//		a.cadastraContaCliente("2", "203", "001");
//		System.out.println("banco agora tem " + b.agencias.size() + " agencias.");
//		
//		Agencia a2 = b.cadastraAgencia("7");
//		if(a2 != null) System.out.println("agencia cadastrada com sucesso");
//		
//		a2.cadastraCliente("7", "110", "Jose");
//		a2.cadastraContaCliente("7", "110", "003");
//		
//		a.cadastraCliente("2", "105", "Maria");
//		a.cadastraContaCliente("2", "105", "140");
//		a.cadastraContaCliente("2", "203", "103");
//		
//		System.out.println("banco agora tem " + b.agencias.size() + " agencias.");
//		
//		System.out.println("agencia " + b.agencias.get("2").getAgencia() + " agora tem " + b.agencias.get("2").clientes.size() + " clientes.");
//		System.out.println("agencia " + b.agencias.get("2").getAgencia() + " agora tem " + b.agencias.get("2").cclientes.size() + " contas de clientes.");
//		a.pesquisaCliente("2", "203");
//		
//		a.pesquisaConta("2", "203");
//		// se quiser tentar remover um cliente que ainda tem contas, descomente a proxima linha
////		a.excluiCliente("2", "203");
//		a.excluiContaCliente("2", "203", "103");
//		a.pesquisaCliente("2", "203");
//		a.excluiContaCliente("2", "203", "001");
//		a.pesquisaCliente("2", "203");
//		a.excluiCliente("2", "203");
//		a.pesquisaConta("2", "203");
//		
//		Banco b = new Banco();
//		Agencia a = new Agencia(100);
//		if(b.cadastraAgencia(2)) System.out.println("agencia cadastrada com sucesso");
//		
//		
//		
//		
//		ContaCorrente c = new ContaCorrente(1, 200);
////		c.dePosito(300);
//		System.out.println(c.getSaldo());
//		c.saque(100);
//		System.out.println(c.getSaldo());
//		c.dePosito(10);
//		System.out.println(c.getSaldo());
//		c.saque(1000);
//		System.out.println(c.getSaldo()+"acaba aqui");
//		
//		a.listaContas.add(c);
//		
	
//		a.listaContas.add(p);
//		int teste;
//		ClienteBancario newc = new ClienteBancario(50, "Jessin da Tora");
//		HashMap<teste ClienteBancario>  lc =new HashMap<>();
	
//	ContaCorrente c = new ContaCorrente(555, 300);
//	
//	c.dePosito(1000);
//	System.out.println(c.getSaldo());
//	c.saque(100);
//	System.out.println(c.getSaldo());
//	c.dePosito(200);
//	System.out.println(c.getSaldo());
//	System.out.println("----------- Extrato de Conta -----------");
//	c.extrato();
//	System.out.println("----------------------------------------");
//		
		 // Create a Set with the keys in the HashMap.
//        Set set = b.listaClienteDoBanco.keySet();
//
//        // Iterate over the Set to see what it contains.
//        Iterator iter = set.iterator();
//        while (iter.hasNext())
//        {
//            Object o = iter.next();
//            System.out.println("keySet: " + o.toString());
//        }
		// TODO Auto-generated method stub

	}
}