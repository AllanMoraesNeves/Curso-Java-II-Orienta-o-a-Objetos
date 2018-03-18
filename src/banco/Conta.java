package banco;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	protected String nome;
	private int agencia;
	private Cliente titular;
	protected int numero;


	public Conta(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public Conta() {

	}

	public int getNumero() {
		return numero;
	}

	public Conta(double saldo) {
		this.saldo += saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Conta com saldo " + this.saldo;
	}

	public void imprime() {
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);

	}

	public abstract void atualiza(double saldo);

	public void saca(double saldo) throws Exception {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
		} else {
			throw new SaldoInsuficienteException(saldo);
		}
	}
	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
	
}
