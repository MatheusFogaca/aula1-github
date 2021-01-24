package excessoes;

public class MultiCatchs {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + " =" + (numeros[i] / denominador[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posicao do array invalido");
			}
			/*
			 * Colocando os catch da mesma familia tudo um catch só
			 * catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
			 */
		}

	}

}
