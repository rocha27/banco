package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta2 {
	public static void main(String[] args) {
		Conta x = new Conta();
		x.setSaldo(100);
		x.saca(10);
		
		System.out.println(x.getSaldo());
	}
}
