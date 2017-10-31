package org.pepito.factorial2;

/**
 * Class that computes the factorial ot an integer(long) number
 * @author CarlosRamos
 *
 */
public class Factorial {

	public long compute(long valor) {
		long result;
		if (valor < 0) {
			throw new RuntimeException("The value is negative: " + valor);
		} else if (valor == 0 || valor == 1) {
			result = 1;
		} else {
			result = valor * compute(valor - 1);
		} 
		return result;
	}
}
