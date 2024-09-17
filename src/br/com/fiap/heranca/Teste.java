package br.com.fiap.heranca;

public class Teste {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		veiculo.andar();
		veiculo.frear();
		
		Carro carro = new Carro();
		carro.andar();
		carro.frear();
		carro.abrirPortaMalas();
		carro.setAno(2023);
		carro.verificarAno();
		
		Moto moto = new Moto();
		moto.andar();
		moto.frear();
		moto.empinar();
		
		Barco barco = new Barco();
		barco.andar();
		barco.frear();
		barco.flutuar();
		
	}

}
