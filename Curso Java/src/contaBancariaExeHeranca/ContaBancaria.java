package contaBancariaExeHeranca;

public class ContaBancaria {
	
	private String cliente;
	private String conta;
	private double saldo;
	
		
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		String s = "ContaBancaria: ";
		s += " Cliente: " + cliente;
		s += " Conta: " + conta;
		s += " Saldo: " + saldo;
		s+= "";
		return s;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if((saldo - valor) >= 0) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	

}
