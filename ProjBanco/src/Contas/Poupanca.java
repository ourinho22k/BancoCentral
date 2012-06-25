/**
 * 
 */
package Contas;

import OP.Operacao;

/**
 * @author fil
 *
 */
public class Poupanca extends Conta {
	
	
	
	/**
	 * Construtor especifico da casse poupanca
	 * @param numeroconta seta o valor da variavel numero de conta erdaso da classe Contas
	 * @param numerocliente seta o valor da variavel numro do cliente 
	 */
	public Poupanca(String numeroconta, String numerocliente) {
		super(numeroconta, numerocliente);
	}

		
		// TODO Auto-generated constructor stub
	
	/**
	 * variavel juros usado para acrecer no valor do deposito de uma poupaça
	 */
	private double juros = 0.10;
	
		
	/**
	 * deposito acrecenta o valor que sera depositado nesta conta mais os valro do juros
	 * @param valor valor que sera acercentado no saldo da conta
	 */
	public boolean dePosito(double valor){
		
		setTipos("deposito");
						
		setSaldo( getSaldo()+addJuros(valor));
		
		Operacao op = new Operacao(tipos, valor, getSaldo());
		
		op.setData();
		return	listaOperacoes.add(op);
		
		 
		
	}
	/**
	 * recebe um valor e acrecenta os juros neste valor  
	 * @param valor
	 * @return retorna o valor passado mais os juros
	 */
	public double addJuros(double valor){
		
		return (valor + (valor*juros));
					
	}
	/**
	 * devolve um Double com o valor da variavel juros
	 * @return retona valor de Juros
	 */
	public double getJuros() {
		return juros;
	}
	/**
	 * seta a variavel juros em pocentagem 
	 * @param juros
	 */
	public void setJuros(double juros) {
		this.juros = (juros/100);
		
	}
	/**
	 * seta a variavel saldo e echama o metodo addJuros, somando o valor mais os juros
	 */
	public void setSaldo(double valor){
		
		super.setSaldo(valor);
		
	}
	
	
	
//	/**
//	 * saque decrecenta o valor em saldo , checando se o valor é maior que saldo 
//	 * se aque for maior que saldo imprime "Saldo insuficiente"
//	 */
//	public boolean saque(String senha,	double valor){
//		
//		if(getSenha().equals(senha)){
//			System.out.println("entrou");
//		if (getSaldo() >= valor){
//			System.out.println("entrou aqui");
//				super.saque(getSenha(), valor);
//				return true;
//	}
//		}
//		
//		return false;
//		}

}
