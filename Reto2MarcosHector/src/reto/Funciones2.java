// Daniel Ortego

package reto;

public class Funciones2 {

	public static double conversionAFarenheit(double c) {
		return (c * 9 / 5) + 32;
	}

	public static double conversorACensius(double f) {
		return ((f - 32) * 5 / 9);
	}

	public static double conversorAGalones(double l) {
		return (l / 3.785);
	}

	public static double conversorALitros(double g) {
		return (g * 3.785);
	}

}
