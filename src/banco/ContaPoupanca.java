package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
	}

	public ContaPoupanca(int i) {
		super.saldo += i;
	}

	public ContaPoupanca(int i, String string) {
		super.numero = i;
		super.nome = string;
	}

	public void atualiza(double saldo) {
		super.saldo += saldo;

	}

}