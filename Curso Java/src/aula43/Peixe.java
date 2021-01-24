package aula43;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas = "Barbatanas e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: " + caracteristicas;
		
		return s;
	}

}
