package br.com.fiap.heranca;

public class Carro extends Veiculo {
	private String volante;
	
	
	
	public void abrirPortaMalas() {
		System.out.println("Abrir porta malas.");
	}
	
	public void verificarAno() {
		System.out.println("O ano do carro é " + ano);
	}
	
	@Override
	public void andar() {
		System.out.println("O carro está andando.");
	}

	@Override
	public void frear() {
		System.out.println("O carro está freando.");
	}
	
	@Override
	public void percorrer(float kmPercorrido) {
		this.km += kmPercorrido;
		System.out.println("O carro percorreu a distância de " + km + "km.");
	}

	@Override
	public float verificarKMPercorrido() {
		return km;
	}
	
	
	
	public String getVolante() {
		return volante;
	}
	public void setVolante(String volante) {
		this.volante = volante;
	}
}
