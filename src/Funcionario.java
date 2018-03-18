import javax.print.attribute.standard.JobOriginatingUserName;

public abstract class Funcionario {
	
	private String nome;
	protected double salario;

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonus();
}

class Gerente extends Funcionario{

	public double getBonus() {
		return this.salario * 0.3;
	}
}

class Desenvolvedor extends Funcionario{
	
	public double getBonus() {
		return this.salario * 0.25;
	}
}

class TotalizadorDeBonus{
	private double total = 0;
	
	public double getTotal() {
		return total;
	}
	
	public void Adiciona(Funcionario f) {
		total += f.getBonus();		
	}
	
}

class TestaFuncionario{
	public static void main(String[] args) {
		
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000);
		System.out.println(joaquim.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.Adiciona(joaquim);
		System.out.println(totalizador.getTotal());
		
		
	}
}