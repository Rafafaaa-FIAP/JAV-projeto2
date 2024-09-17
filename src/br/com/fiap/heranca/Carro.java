package br.com.fiap.heranca;

public class Carro extends Veiculo {
	private String volante;
	
	
	
	public void abrirPortaMalas() {
		System.out.println("Abrir porta malas.");
	}
	
	public void verificarAno() {
		System.out.println("O ano do carro é " + ano);
	}

	
	
	public String getVolante() {
		return volante;
	}
	public void setVolante(String volante) {
		this.volante = volante;
	}
}
