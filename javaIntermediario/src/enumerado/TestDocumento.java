package enumerado;

public class TestDocumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}*/
		
		Pessoa pf = new Pessoa();
		pf.setTipo(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumDoc(pf.getTipo().geraNumeroTeste());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipo(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumDoc(pj.getTipo().geraNumeroTeste());
		System.out.println(pj);
	}

}
