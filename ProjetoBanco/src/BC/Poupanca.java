/**
 * 
 */
package BC;

/**
 * @author fil
 *
 */
public class Poupanca extends Conta {
	
	public Poupanca(int numeroconta, int numerocliente, double valo) {
		super(numeroconta, numerocliente, valo);
		
		super.setSaldo(addJuros(valo));
		// TODO Auto-generated constructor stub
	}

	private double juros = 0.10;

	

	@Override
	public void Contas() {
		// TODO Auto-generated method stub
		
	}

	public void deposito(double valor){
		
		double maisJuros = getSaldo() + addJuros(valor);
//		System.out.println(maisJuros+"teste");
		super.setSaldo(maisJuros);
		
		
	}
	
	public double addJuros(double valor){
		
		return (valor + (valor*juros));
					
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = (juros/100);
		
	}
	
	public void setSaldo(double valor){
		double qqcoisa = addJuros(valor);
		super.setSaldo(qqcoisa);
		
	}
	public void saque(double valor){
		super.setSaldo(getSaldo()-valor);
	}
	
}
