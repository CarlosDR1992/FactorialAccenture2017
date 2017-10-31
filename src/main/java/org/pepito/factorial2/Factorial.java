package org.pepito.factorial2;

/**
 * Class that computes the factorial ot an integer(long) number
 * @author CarlosRamos
 *
 */
public class Factorial {

	public long compute(long valor) {
		if (valor < 0) {
			throw new RuntimeException("The value is negative: " + valor);
		} else if (valor == 0 || valor == 1) {
			return 1;
		} else {
			return valor * compute(valor - 1);
		}
	}
}
