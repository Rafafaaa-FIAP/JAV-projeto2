package br.com.fiap.heranca;


/*
 * Assinatura de método
 * 
 * É verificado por meio de 3 aspectos:
 * 		- O método precisa ter mesmo nome;
 * 		- O método precisa ter a mesma quantidade de parâmetros;
 * 		- O método precisa ter os mesmos tipos de dados nos parâmetros de entrada.
 * 
 * Exemplos de assinatura de método:
 *  
 * Método 1: public void somar(int valor1, int valor2) {...} <- Referência
 * Método 2: public int somar(int valor3, int valor4) {...} - Mesma assinatura do Método 1
 * Método 3: public void somar(int valor1, float valor3) {...} - Não tem a mesma assinatura do Método 1
 * Método 4: public double somar(double valor1, double valor2) {...} - Não tem a mesma assinatura do Método 1
 * 
 * 
 * 
 * Sobreposição ou sobrescrita de método
 * 
 * É verificado por meio de 2 aspectos:
 * 		- Necessidade de ser subclasse de uma herança;
 * 		- Necessário ter a mesma assinatura.
 * 
 * 
 * 
 * Classe abstrata
 * 		- Inibe a criação de objetos da classe no qual foi marcada como "abstract" 
 * 
 * 
 * 
 * Sobrecarga
 * 		- Não pode ter a mesma assinatura de método
 * */


public class Teste {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.andar();
		carro.frear();
		carro.abrirPortaMalas();
		carro.setAno(2023);
		carro.verificarAno();
		carro.percorrer(10);
		carro.percorrer(20);
		System.out.println("A distância total percorrida pelo carro é " + carro.verificarKMPercorrido());
		
		Moto moto = new Moto();
		moto.andar();
		moto.frear();
		moto.empinar();
		moto.percorrer(90);
		moto.percorrer(10);
		float km = moto.verificarKMPercorrido();
		System.out.println("A distância total percorrida pela moto é " + km);
		
		Barco barco = new Barco();
		barco.andar();
		barco.frear();
		barco.flutuar();
		barco.percorrer(80);
		barco.percorrer(30);
		float km2 = barco.verificarKMPercorrido();
		System.out.println("A distância total percorrida pelo barco é " + km2);
		
		Veiculo carro2 = new Carro();
		carro2.andar();
		carro2.frear();
		
	}

}
