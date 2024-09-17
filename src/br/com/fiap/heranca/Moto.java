package br.com.fiap.heranca;

public class Moto extends Veiculo {
	private String guidao;
	
	
	
	public void empinar() {
		System.out.println("A moto da grau.");
	}



	public String getGuidao() {
		return guidao;
	}
	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}
}
