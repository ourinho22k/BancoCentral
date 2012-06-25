/**
 * 
 */
package Contas;

import OP.Operacao;
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
	public boolean saque(String senha, double valorSaque){
		
		


			if (!getTipos().equals("extrato")){

				setTipos("saque");
			
				double saldoatual = this.getSaldo();



				if (getSenha().equals(senha) && saldoatual >= valorSaque + (valorSaque * 0.01)){

					this.setSaldo(saldoatual-valorSaque - (valorSaque * 0.01));

					Operacao op = new Operacao(getTipos(), valorSaque, getSaldo());

					op.setData();
					this.listaOperacoes.add(op);
					return true;
				}
				
			}	
		
			if (getTipos().equals("extrato")){

							
				double saldoatual = getSaldo();



				if (getSenha().equals(senha) && saldoatual >= valorSaque ){

					this.setSaldo(saldoatual-valorSaque);
					
					
					Operacao op = new Operacao(getTipos(), valorSaque, getSaldo());

					op.setData();
					this.listaOperacoes.add(op);
					return true;
				}
				
			}	
		return false;

		
	}
	

	/**
	 * retorna uma String com um desconto  coma cobranca de uma taxa
	 * @return
	 */
	public String extratosCor(){
						
		setTipos("extrato");
		
			this.saque(this.getSenha(), this.getTaxaExtra());
			
			return this.listaOperacoes.toString();
			
			
		
		
	}
	
	/**
	 * retorna um double com valor de saldo
	 * @return
	 */
	public double saldo(){
		return this.getSaldo();
	}
	
		

}
