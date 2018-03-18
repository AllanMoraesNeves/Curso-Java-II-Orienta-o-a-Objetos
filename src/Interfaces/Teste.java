package Interfaces;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		
		AreaCalculavel c = new Circulo(2);
		System.out.println(c.calculaArea());
	}

}
