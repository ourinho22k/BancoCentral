/**
 * 
 */
package BC;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

/**
 * @author fil
 *
 */
public class ContaCorrente extends Conta {

	public ContaCorrente(int numeroconta, int numerocliente) {
		super(numeroconta, numerocliente);
		// TODO Auto-generated constructor stub
	}

	

	public void saque(double valorSaque, String tipos){
		
		double saldoatual = getSaldo();
		setTipos("saldo");
//		if (tipos.equals(null))tipos = "saque";
		
		if (saldoatual >= valorSaque + (valorSaque * 0.01)){
		
			setSaldo(saldoatual-valorSaque - (valorSaque * 0.01));
		
		Operacao op = new Operacao(tipos, valorSaque, getSaldo());
		
			op.setData();
				listaOperacoes.add(op);
		}
		else {
			System.out.print("saldo insuficiente");
		}
		
		
	}

	public void extrato(){
		saque(2.00, "extrato");
		System.out.println(imprimeExtrato());
		
	}
	
	public String imprimeExtrato(){
		return listaOperacoes.toString();
	}

	public double saldo(){
		return getSaldo();
	}
	@Override
	public void Contas() {
		// TODO Auto-generated method stub
		
	}

	
	
}
