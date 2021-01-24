package enumerado;

public class Pessoa {
	
	private TipoDocumento Tipo;
	private String numDoc;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(TipoDocumento tipo, String numDoc) {
		super();
		Tipo = tipo;
		this.numDoc = numDoc;
	}
	
	public TipoDocumento getTipo() {
		return Tipo;
	}
	public void setTipo(TipoDocumento tipo) {
		Tipo = tipo;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	@Override
	public String toString() {
		return "Pessoa [Tipo=" + Tipo + ", numDoc=" + numDoc + "]";
	}
	
	

}
