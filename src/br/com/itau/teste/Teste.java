package br.com.itau.teste;

import br.com.itau.model.ContaBancaria;

public class Teste {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria("Rafael", 100);
		cb.mostrarSaldo();
		cb.sacarSaldo(50);
		cb.mostrarSaldo();
		cb.depositarSaldo(25);
		cb.mostrarSaldo();
	}

}
