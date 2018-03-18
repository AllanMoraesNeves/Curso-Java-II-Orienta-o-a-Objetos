package banco;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
	}

	public ContaCorrente() {
	}

	public ContaCorrente(int i, String string) {
		super.nome = string;
		super.saldo = i;
	}

	public void atualiza(double saldo) {
		super.saldo += (saldo * 2);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	public void deposita(int i) {
		super.saldo += i;
		
	}

}