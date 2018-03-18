package banco;

public class SaldoInsuficienteException  extends RuntimeException{

	private final double saldoAtual;
	
	public SaldoInsuficienteException(double saldoAtual) {
		super("Saldo insuficiente: " + saldoAtual);
		this.saldoAtual = saldoAtual;
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	
}
