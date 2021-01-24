package classeObject;

import java.util.Arrays;

public class Aluno {

	private String cursos;
	private String[] notas;

	public Aluno() {
		super();

	}

	public Aluno(String nome, String endereco, String telefone, String cursos) {

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

	@Override
	public String toString() {
		return "Aluno [cursos=" + cursos + ", notas=" + Arrays.toString(notas) + "]";
	}

	public void setNotas(double[] notas2) {
		// TODO Auto-generated method stub

	}
	
	

}
