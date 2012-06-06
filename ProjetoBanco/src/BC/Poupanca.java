/**
 * 
 */
package BC;

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
	 * construtor generico
	 */
	@Override
	public void Contas() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * deposito acrecenta o valor que sera depositado nesta conta mais os valro do juros
	 * @param valor valor que sera acercentado no saldo da conta
	 */
	public void deposito(double valor){
		
		double maisJuros = getSaldo() + addJuros(valor);

		super.setSaldo(maisJuros);
		
		
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
		double qqcoisa = addJuros(valor);
		super.setSaldo(qqcoisa);
		
	}
	/**
	 * saque decrecenta o valor em saldo , checando se o valor é maior que saldo 
	 * se aque for maior que saldo imprime "Saldo insuficiente"
	 */
	public void saque(double valor){
		if (getSaldo() >= valor){
					
				super.saque(valor);
	}
		else {
			System.out.println("saldo insuficiente");
		}
		}
	
	
}
