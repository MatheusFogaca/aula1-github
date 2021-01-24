package enumerado;

public class Teste {

	public static void main(String[] args) {
		
		usandoConstante();
		System.out.println();
		usandoEnum();

	}
	
	private static void usandoConstante() {
		int segunda = DiaSemanaConstante.SEGUNDA;
		int terca = DiaSemanaConstante.TERCA;
		int quarta = DiaSemanaConstante.QUARTA;
		int quinta = DiaSemanaConstante.QUINTA;
		int sexta = DiaSemanaConstante.SEXTA;
		int sabado = DiaSemanaConstante.SABADO;
		int domingo = DiaSemanaConstante.DOMINGO;
		
		System.out.println("Teste utitilizando a constante no Java");
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		
	}

	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("SEGUNDA");
			break;
		case 2:
			System.out.println("TERCA");
			break;
		case 3:
			System.out.println("QUARTA");
			break;
		case 4:
			System.out.println("QUINTA");
			break;
		case 5:
			System.out.println("SEXTA");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		}
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("SEGUNDA");
			break;
		case TERCA:
			System.out.println("TERCA");
			break;
		case QUARTA:
			System.out.println("QUARTA");
			break;
		case QUINTA:
			System.out.println("QUINTA");
			break;
		case SEXTA:
			System.out.println("SEXTA");
			break;
		case SABADO:
			System.out.println("SABADO");
			break;
		case DOMINGO:
			System.out.println("DOMINGO");
			break;
		}
	}
	
	private static void usandoEnum() {
	
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Imprimindo com o Enum");
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
	}

}
