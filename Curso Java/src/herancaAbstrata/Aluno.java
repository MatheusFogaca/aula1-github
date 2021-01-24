package herancaAbstrata;

public class Aluno extends Pessoa {

	private String cursos;
	private String[] notas;
	
	
	
	public Aluno() {
		super();

	}

	public Aluno(String nome, String endereco, String telefone, String cursos) {
		super(nome, endereco, telefone);
		this.cursos = cursos;

	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public String[] getNotas() {
		return notas;
	}

	public void setNotas(String[] notas) {
		this.notas = notas;
	}

}
