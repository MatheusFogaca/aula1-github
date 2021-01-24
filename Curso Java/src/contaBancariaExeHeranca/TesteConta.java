package contaBancariaExeHeranca;

public class TesteConta {

	public static void main(String[] args) {

		System.out.println("*** Teste Conta ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setCliente("Matheus");
		contaSimples.setConta("01");
		
		System.out.println(contaSimples);
		
		contaSimples.depositar(100);
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);

		/// ****************////
		
		System.out.println("*** Teste Conta Poupança ***");

		Poupanca poupanca = new Poupanca();
		poupanca.setCliente("Matheus");
		poupanca.setConta("001");
		poupanca.setDiaRendimento(02);
		System.out.println(poupanca);
		
		poupanca.depositar(100);
		realizarSaque(poupanca, 50);
		realizarSaque(poupanca, 70);
		if (poupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo: " + poupanca.getSaldo());
		}else {
			System.out.println("hoje nao é dia de rendimento!");
		}
		
		//// ***************** ////
		
		System.out.println("*** Teste Conta Especial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setCliente("Matheus");
		contaEspecial.setConta("011");
		contaEspecial.setLimite(50);
		
		System.out.println(contaEspecial);
		
		contaEspecial.depositar(100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);

	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo atual: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para o saque de: " + valor + ";" );
		}
	}

}
