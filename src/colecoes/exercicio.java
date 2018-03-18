package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class exercicio {

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();

		ContaPoupanca c1 = new ContaPoupanca(400, "Caio");
		c1.atualiza(1500);
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca(467, "Adriano");
		c2.atualiza(2050.99);
		contas.add(c2);

		ContaPoupanca c3 = new ContaPoupanca(230, "Victor");
		c3.atualiza(1070.0);
		contas.add(c3);

		Collections.sort(contas);

		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
		
		
		
        Set<Conta> conta1s = new HashSet<Conta>();

        ContaCorrente c11 = new ContaCorrente(123, "Mauricio");
        ContaCorrente c21 = new ContaCorrente(123, "Adriano");
        ContaCorrente c31 = new ContaCorrente(444, "Luiz");

        conta1s.add(c11);
        conta1s.add(c21);
        conta1s.add(c31);

        System.out.println("Total de contas no HashSet: " + conta1s.size());
   
	}

}
