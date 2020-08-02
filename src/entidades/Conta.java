package entidades;

import excecoes.LimiteSaque;
import excecoes.SaldoInsuficiente;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private double limiteSaque;

	public Conta(int numero, String titular, double saldo, double limiteSaque) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void depositar(double quantia) {

		saldo = saldo + quantia;

	}

	public void sacar(double quantia) {
		if (quantia > saldo) {
			throw new SaldoInsuficiente("Saldo insuficente!");
		} else if (quantia > limiteSaque) {
			throw new LimiteSaque("Limite de saque ultrapassado!");
		} else {
			saldo = saldo - quantia;
		}
	}
}
