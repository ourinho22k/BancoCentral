/**
 * 
 */
package BC;

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
		
		ContaCorrente c = new ContaCorrente(1, 200, 1000);
		System.out.println(c.getSaldo());
		c.saque(100);
		System.out.println(c.getSaldo());
		c.dePosito(10);
		System.out.println(c.getSaldo()+"acaba aqui");
		
		Poupanca p =new Poupanca(2, 500, 100);
		System.out.println(p.getSaldo());
		p.deposito(100);
		System.out.println(p.getSaldo());
		p.saque(10);
		System.out.println(p.getSaldo());
		p.deposito(100);
		System.out.println(p.getSaldo()+"acaba aki");
		
		
		// TODO Auto-generated method stub

	}

}
