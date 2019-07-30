package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class Login {
	public static void main(String[] args) {
		// Criando uma conta
		Conta minhaConta;
		minhaConta = new Conta();

		// alterando os valores minhaConta
		minhaConta.setTitular("Rocha");
		minhaConta.setSaldo(2000.0);
		boolean consegui = minhaConta.saca(2001);

		if (consegui) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}

		System.out.println("Saldo atual é: " + minhaConta.getSaldo());
		System.out.println(minhaConta.getTitular());
		System.out.println("Seu rendimento " + minhaConta.calculaRendimento());
	}
}
