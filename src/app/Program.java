package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import excecoes.LimiteSaque;
import excecoes.SaldoInsuficiente;

public class Program {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);

			System.out.println("Entre com os dados da conta");
			System.out.print("Numero:");
			int numero = sc.nextInt();
			System.out.print("Titular:");
			sc.nextLine();
			String titular = sc.nextLine();
			System.out.print("Saldo inicial:");
			double saldoInicial = sc.nextDouble();
			System.out.print("Limite de Saque:");
			double limiteSaque = sc.nextDouble();

			Conta novaConta = new Conta(numero, titular, saldoInicial, limiteSaque);

			System.out.print("Digite o valor para saque:");
			double quantia = sc.nextDouble();

			novaConta.sacar(quantia);

			System.out.print("Novo saldo:" + novaConta.getSaldo());

			sc.close();
		} 
		catch (LimiteSaque e) {
			System.out.println("Erro:"+e.getMessage());		
		}
		catch (SaldoInsuficiente e) {
			System.out.println("Erro:"+e.getMessage());	
		}
		catch (RuntimeException e) {
			System.out.println("Erro Inesperado!");	
		}

	}

}
