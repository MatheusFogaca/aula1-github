package aula52Exercicio;

public class AgendaCheia extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda est� cheia!";
	}

}
