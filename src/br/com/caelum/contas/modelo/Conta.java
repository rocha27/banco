package br.com.caelum.contas.modelo;

public class Conta implements Comparable<Conta> {
	protected int numero;
	protected String agencia;
	protected double saldo;
	protected String titular;
	protected String dataAbertura;

	public boolean saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public double calculaRendimento() {
		double rendimento = this.getSaldo() * 0.1;
		return rendimento;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.getTitular();
		dados += ", Número: " + this.getNumero();
		dados += ", Agência: " + this.getAgencia();
		dados += ", Saldo: " + this.getSaldo();
		dados += ", Rendimento: " + this.calculaRendimento();
		return dados;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Object getTipo() {
		return "Conta";
	}
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}
