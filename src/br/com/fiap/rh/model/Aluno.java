package br.com.fiap.rh.model;

public class Aluno {
	
	private String nome;
	private int idade;
	private float altura;
	private boolean autorizadoPelosPais;
	
	public Aluno (String nome, int idade, float altura, boolean autorizadoPelosPais) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.autorizadoPelosPais = autorizadoPelosPais;
	}
	
	public void verificarIdadeInscricao() {
		boolean idadeAceita = this.idade >= 17;
		
		if (idadeAceita) {
			System.out.println("Aluno inscrito com sucesso!");
		}
		else if (autorizadoPelosPais) {
			System.out.println("Aluno inscrito com sucesso!");
		}
		else {
			System.out.println("O aluno " + this.nome + " não pode ser inscrito!");
		}
	}
	
	public int definirFaixaAluno(int nota) {
		int faixaNota = 0;
		
		if (nota == 100) {
			faixaNota = 100;
		}
		else if (nota >= 90 && nota < 100) {
			faixaNota = 90;
		}
		else if (nota >= 80 && nota < 90) {
			faixaNota = 80;
		}
		else if (nota >= 70 && nota < 80) {
			faixaNota = 70;
		}
		
		return faixaNota;
	}
	
	public void verificarNivelAluno(int faixaNota) {
		switch (faixaNota) {
			case 100: {
				System.out.println("O aluno é excepcional!");
				break;
			}
			case 90: {
				System.out.println("O aluno é ótimo.");
				break;
			}
			case 80: {
				System.out.println("O aluno é bom.");
				break;
			}
			case 70: {
				System.out.println("O aluno é regurar.");
				break;
			}
			default: {
				System.out.println("O aluno está reprovado.");
			}
		}
	}
	
	public void verificarNiveisTodosAlunos(int[] notas) {
		for (int i = 0; i < notas.length; i++) {
			int faixaNota = definirFaixaAluno(notas[i]);
			verificarNivelAluno(faixaNota);
		}
	}
	
	public void verificarNiveisTodosAlunosWhile(int[] notas) {
		int i = 0;
		while (i < notas.length) {
			int faixaNota = definirFaixaAluno(notas[i]);
			verificarNivelAluno(faixaNota);
			
			i++;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public boolean isAutorizadoPelosPais() {
		return autorizadoPelosPais;
	}
	public void setAutorizadoPelosPais(boolean autorizadoPelosPais) {
		this.autorizadoPelosPais = autorizadoPelosPais;
	}
}
