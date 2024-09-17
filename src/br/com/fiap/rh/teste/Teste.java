package br.com.fiap.rh.teste;

import br.com.fiap.rh.model.Aluno;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Rafael", 16, 1.73f, false);
		// aluno.verificarIdadeInscricao();
		
		// int faixaNota = aluno.definirFaixaAluno(98);
		// aluno.verificarNivelAluno(faixaNota);
		
		int notas[] = { 98, 100, 76, 85, 64, 92 };
		// aluno.verificarNiveisTodosAlunos(notas);
		// aluno.verificarNiveisTodosAlunosWhile(notas);
		aluno.verificarNiveisTodosAlunosDoWhile(notas);
	}

}
