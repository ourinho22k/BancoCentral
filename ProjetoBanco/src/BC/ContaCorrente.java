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

	public ContaCorrente(String numeroconta, String numerocliente) {
		super(numeroconta, numerocliente);
		// TODO Auto-generated constructor stub
	}


	

	public void saque(double valorSaque){
		
		if (!getTipos().equals("extrato")) setTipos("saque");
		
		double saldoatual = getSaldo();
		

		
		if (saldoatual >= valorSaque + (valorSaque * 0.01)){
		
			setSaldo(saldoatual-valorSaque - (valorSaque * 0.01));
		
		Operacao op = new Operacao(getTipos(), valorSaque, getSaldo());
		
			op.setData();
				listaOperacoes.add(op);
		}
		else {
			System.out.print("saldo insuficiente");
		}
		
		
	}
	


	public String extratos(){
		
		setTipos("extrato");
		
			saque(2.00 );
		
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
