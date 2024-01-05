package com.loiane.estruturadados.lista.teste;

import java.util.Comparator;

public class CompararNumero implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1.intValue() == o2.intValue()) return 0;
		return o1.intValue() < o2.intValue() ? -1 : 1;
	}

}
