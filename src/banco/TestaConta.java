package banco;

public class TestaConta {

	public static void main(String[] args) throws Exception {
		ContaCorrente conta = new ContaCorrente("allan", 123, 0);

		conta.deposita(0);

		try {
			conta.saca(100);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
			System.out.println("saldo insuficiente");
		}
		System.out.println(conta.getSaldo());

		System.out.println(conta.getNome());

	}

}
