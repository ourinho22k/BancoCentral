/**
 * 
 */
package BC;

import java.util.Collection;
import java.util.HashSet;

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
		
//		Agencia a = new Agencia();
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
		
		ClienteBancario c = new ClienteBancario(010, "Alternativo");
		ClienteBancario d = new ClienteBancario(011, "Heline");
		ClienteBancario a = new ClienteBancario(010, "Pinto Biu");
		ClienteBancario q = new ClienteBancario(010, "Alternativo");
		Collection<ClienteBancario> hasteste = new HashSet<ClienteBancario>();
		System.out.println( hasteste.add(c));
		System.out.println( hasteste.add(d));
		System.out.println( hasteste.add(a));
		System.out.println( hasteste.add(q));
		System.out.println(hasteste.toString());
		
		// TODO Auto-generated method stub

	}

}
