package br.com.fiap.heranca;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected int ano;
	protected String chassi;
	protected float km;

	
	
	public void andar() {
		System.out.println("O veículo anda.");
	}
	
	public void frear() {
		System.out.println("O veículo frea.");
	}
	
	public void percorrer(float distancia) {
		this.km += distancia;
		System.out.println("O veículo percorreu a distância de " + distancia + "km.");
	}
	
	public abstract float verificarKMPercorrido();

	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
}
