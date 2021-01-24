package Aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contado = new Contato();
		contado.setNome("Matheus");
		// contado.setEndereco("Joao Pedro");
		// contado.setTelefone("19 - 99841233");

		// criar objeto telefone

		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("19 ");
		telefone.setNumero("999523105");

		Telefone telefone2 = new Telefone();
		telefone2.setTipo("fixo");
		telefone2.setDdd("19 ");
		telefone2.setNumero("34251414");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

		contado.setTelefones(telefones);

		// criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Pedro");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Piracicaba");
		end.setEstado("Sao Paulo");
		end.setCep("13400-000");

		// contado.setTelefone(telefone);
		contado.setEndereco(end);

		System.out.println(contado.getNome());
		// System.out.println(contado.getTelefone());

		if (contado != null && contado.getEndereco() != null) {
			System.out.println(contado.getEndereco().getCidade());
		}

		if (contado != null && contado.getTelefones() != null) {
			for (Telefone t : contado.getTelefones()) {
				System.out.println(t.getDdd() + t.getNumero());
			}
		}
	}

}
