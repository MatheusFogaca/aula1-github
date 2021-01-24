package Aula40;

public class sobrecarga {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1 , n1");
		aluno.setEndereco("Rua 2 , n 2");
		professor.setEndereco("Rua 3 , n 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	
	}
}
