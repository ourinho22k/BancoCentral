/**
 * 
 */
package BC;



/**
 * @author fil
 *
 */
public class ContaCorrente extends Conta {

	
	/**
	 * contrutor publico 
	 * @param numeroconta
	 * @param numerocliente
	 */
	
	public ContaCorrente(String numeroconta, String numerocliente) {
		super(numeroconta, numerocliente);
		// TODO Auto-generated constructor stub
	}

	/**
	 * sobrescreve a variavel taxa extra recebendo um double
	 */
	@Override
	public void setTaxaExtra(double taxaExtra) {
		// TODO Auto-generated method stub
		super.setTaxaExtra(taxaExtra);
	}
/**
 * realiza um saque
 * @param valorSaque recebe um valor e executa um saque em uma determinada conta corrente
 */
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
	

	/**
	 * retorna uma String com um desconto  coma cobranca de uma taxa
	 * @return
	 */
	public String extratos(){
		
		setTipos("extrato");
		
			saque(getTaxaExtra());
		
		return listaOperacoes.toString();
	}
	
	/**
	 * retorna um double com valor de saldo
	 * @return
	 */
	public double saldo(){
		return getSaldo();
	}
	
	
	


	/**
	 * construtor generico
	 */
	@Override
	public void Contas() {
		// TODO Auto-generated method stub
		
	}

	
}
