// Daniel

package reto;

import java.util.Scanner;

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
	public static void menuVolumen(Scanner sc) {
		int f = 0;
		do {
			System.out.println("=== Selecciona el tipo de conversion ===");
			System.out.println("1. De celsius a farenheit");
			System.out.println("2. De farenheir a celsius");
			System.out.println("0. Salir ");
			String entrada = sc.nextLine();
			f = Integer.parseInt(entrada);
			switch (f) {
			case 1:
				System.out.println("Introduce los grados a convertir a farenheit");
				String e2 = sc.nextLine();
				double cant = Double.parseDouble(e2);				
				System.out.println(conversionAFarenheit(cant) + "ºF");
				break;
			case 2:
				System.out.println("Introduce los grados farenheit a convertir a celsius");
				String e3 = sc.nextLine();
				double cant2 = Double.parseDouble(e3);
				System.out.println(conversionAFarenheit(cant2) + "C");
				break;
			default: System.out.println("Valor introducido no valido.");
				break;
			}
		} while (f != 0);
	}

}
