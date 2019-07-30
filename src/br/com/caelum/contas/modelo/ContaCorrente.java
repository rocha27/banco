package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	public String negativoso;

	@Override
	public boolean saca(double valor) {
		if (valor > 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= (valor);
		return true;
	}

	public String getTipo() {
		return "Conta Corrente";

	}

	public double getValorImposto() {
		return this.getSaldo() * 0.02;
	}

	public String valorNegativo() {

		return negativoso;
	}

	public void executandoValorNegativo() {
		if (saldo < 0) {
			negativoso = " saldo negativo";
		}
	}

}
