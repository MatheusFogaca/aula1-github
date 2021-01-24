package enumerado;

public enum DiaSemana2 {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4),SEXTA(5), SABADO(6),
	DOMINGO(7);
	
	private int valor;
	
	private DiaSemana2(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
