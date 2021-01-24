package classeObject;

public class Test {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCursos("Ciencia da Computaçao");
		double[] notas = {10, 9, 8 ,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "djasjdklajs";
		String s2 = "djasjdklajs";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno.setCursos("Sistemas");
		double[] notas2 = {10, 5, 7 , 3};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
