/**
 * 
 */
package BC;

/**
 * @author fil
 *
 */
public class ContaCorrente extends Conta {

	public ContaCorrente(int numeroconta, int numerocliente) {
		super(numeroconta, numerocliente);
		// TODO Auto-generated constructor stub
	}

	

	public void saque(double valor){
		double saldoatual = getSaldo();
		
		if (saldoatual >= valor + (valor * 0.01)){
		setSaldo(saldoatual-valor - (valor * 0.01)) ;
		}
		else {
			System.out.print("saldo insuficiente");
		}
		
		
	}

	public double extrato(){
		double saldoAtual = getSaldo();
		saldoAtual = saldoAtual - 2.00;
		return getSaldo();
	}

	public double saldo(){
		return getSaldo();
	}
	@Override
	public void Contas() {
		// TODO Auto-generated method stub
		
	}

	
	
}
