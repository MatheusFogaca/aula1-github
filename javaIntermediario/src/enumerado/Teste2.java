package enumerado;

public class Teste2 {

	public static void main(String[] args) {
	
		DiaSemana2 dia = DiaSemana2.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		
		Data data = new Data(1, 4, 2016,DiaSemana2.SEXTA);
	}

}
