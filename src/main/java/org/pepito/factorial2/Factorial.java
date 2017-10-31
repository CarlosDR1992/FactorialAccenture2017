package org.pepito.factorial2;

public class Factorial {

	public long compute(long valor) {
		if (valor == 0 || valor == 1) {
			return 1;
		} else if (valor == 2) {
			return 2;
		} else if (valor == 3) {
			return 6;
		} else {
			return valor * compute(valor - 1);
		}
	}
}
