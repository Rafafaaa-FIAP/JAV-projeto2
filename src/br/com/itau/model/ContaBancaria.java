package br.com.itau.model;

public class ContaBancaria {
	
	private String nome;
	private float saldo;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}
	
	

	public ContaBancaria(String nome) {
		this.nome = nome;
		this.saldo = 0;
	}
	
	public ContaBancaria(String nome, float saldo_inicial) {
		this.nome = nome;
		this.saldo = saldo_inicial;
	}
	
	

	public void mostrarSaldo() {
		System.out.println("O saldo atual é: " + this.saldo);
	}

	public void sacarSaldo(float valor_sacar) {
		this.saldo -= valor_sacar;
	}

	public void depositarSaldo(float valor_depositar) {
		this.saldo += valor_depositar;
	}
}
