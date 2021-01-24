package aula52Exercicio;

public class ContatoNaoExiste extends Exception {
	
	private String nomeDoContato;
	
	public ContatoNaoExiste(String nomeDoContato) {
		this.nomeDoContato = nomeDoContato;
	}
	
	@Override
	public String getMessage() {
	
		return "Contato: " + nomeDoContato + "Não existe na agenda!";
	}

}
