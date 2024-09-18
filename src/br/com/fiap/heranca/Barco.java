package br.com.fiap.heranca;

public class Barco extends Veiculo {
	private String leme;
	
	
	
	public void flutuar() {
		System.out.println("O barco flutua.");
	}

	@Override
	public float verificarKMPercorrido() {
		return km;
	}

	

	public String getLeme() {
		return leme;
	}
	public void setLeme(String leme) {
		this.leme = leme;
	}	
}
