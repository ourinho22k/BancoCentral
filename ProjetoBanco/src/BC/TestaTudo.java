/**
 * 
 */
package BC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
		Agencia a = new Agencia(100);
		if(b.cadastraAgencia(2)) System.out.println("agencia cadastrada com sucesso");
		
//		
//		
//		
//		ContaCorrente c = new ContaCorrente(1, 200, 1000);
//		System.out.println(c.getSaldo());
//		c.saque(100);
//		System.out.println(c.getSaldo());
//		c.dePosito(10);
//		System.out.println(c.getSaldo()+"acaba aqui");
//		
//		a.listaContas.add(c);
//		
//		Poupanca p =new Poupanca(2, 500, 100);
//		System.out.println(p.getSaldo());
//		p.deposito(100);
//		System.out.println(p.getSaldo());
//		p.saque(10);
//		System.out.println(p.getSaldo());
//		p.deposito(100);
//		System.out.println(p.getSaldo()+"acaba aki");
//		
//		a.listaContas.add(p);
//		int teste;
//		ClienteBancario newc = new ClienteBancario(50, "Jessin da Tora");
//		HashMap<teste ClienteBancario>  lc =new HashMap<>();
	
		
		
		// TODO Auto-generated method stub

	}

}
