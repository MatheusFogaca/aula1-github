package aula52Exercicio;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	public void adicionarContatato(Contato c) throws AgendaCheia {

		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if (cheia) {
			// lancar exception
			throw new AgendaCheia();

		}

	}

	public int consultaContatoPorNome(String nome) throws ContatoNaoExiste {

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if(contatos[1].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		// lancar a exception de contato nao existe
		throw new ContatoNaoExiste(nome);
		
	}

	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			if(c != null) {
				s += c.toString() + "\n";
			}
			
		}
		return s;
	}

}
