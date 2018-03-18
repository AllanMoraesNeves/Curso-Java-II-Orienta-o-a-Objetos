package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class TestaColecoes {

	public static void main(String[] args) {
		List<String> nomes = new LinkedList<>();
		nomes.add("allan");
		nomes.add("teste");
		nomes.add("die");
		nomes.add("die");
		
		//nao permite iguais
		Set<String> set = new HashSet<>();
		set.add("allan");
		set.add("teste");
		set.add("die");
		set.add("die");
		System.out.println("set "+set);
		System.out.println(set.size());
		//System.out.println(nomes.get(0));
	//	System.out.println(nomes.contains("allan"));
		
		Map<String, Conta> setConta1 = new HashMap<String, Conta>();
		ContaPoupanca c23 = new ContaPoupanca(222);
		ContaPoupanca c24 = new ContaPoupanca(2221);
		setConta1.put("diretor", c23);
		setConta1.put("gerente", c24);
		System.out.println("mapa: " + setConta1.get("diretor").getSaldo());
		System.out.println("mapa: "+ setConta1.size());
		
		Set<ContaPoupanca> setConta = new HashSet<>();
		ContaPoupanca c3 = new ContaPoupanca(222);
		ContaPoupanca c4 = new ContaPoupanca(2221);
		setConta.add(c3);
		setConta.add(c4);
		setConta.add(c4);
		
		System.out.println("tamanho setCOnta: "+ setConta.size());
		
		for (String nome : nomes) {
			System.out.println("listando nomes: " + nome);
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		ContaPoupanca c1 = new ContaPoupanca(1500);
		ContaPoupanca c2 = new ContaPoupanca(700);
		contas.add(c1);
		contas.add(c2);
		
		Collections.sort(nomes);
		
		for (String nome : nomes) {
			System.out.println("nomes ordenado: "+nome);
		}
		
		Collections.sort(contas);
		for (Conta conta : contas) {
			System.out.println("listando contas ordenados: " + conta);
		}
		
		
	}

}
