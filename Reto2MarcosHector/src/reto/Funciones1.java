package reto;

import java.util.Scanner;

public class Funciones1 {
public static double millasaKilometros(double longitud) {
	return longitud*1.609;
}
public static double kilometrosaMillas(double longitud) {
	return longitud/1.609;
}
public static double kilogramoaLibra(double peso) {
	return peso * 2.205;
}
public static double libraakilogramo(double peso) {
	return peso/2.205;
}
public static void menuLongitud(Scanner sc) {
	int n1=0;
	double n2=0;
	do {
		System.out.println("Selecciona la conversión de longitud");
		System.out.println("1. Millas a Kilometros");
		System.out.println("2. Kilometros a Millas");
		System.out.println("0. Salir");
		String e1=sc.nextLine();
		n1=Integer.parseInt(e1);
		switch (n1) {
		case 1:System.out.println("Introduce las millas que deseas convertir a kilometros");
			String e2=sc.nextLine();
			n2=Double.parseDouble(e2);
			System.out.println(Funciones1.millasaKilometros(n2));
			break;
		case 2:System.out.println("Introduce los kilometros que deseas convertir a millas");
		e2=sc.nextLine();
		n2=Double.parseDouble(e2);
		System.out.println(Funciones1.kilometrosaMillas(n2));
		break;
		case 0: break;
		default:System.out.println("Número no valido");
			break;
		}
	} while (n1!=0);
}
public static void menuPeso(Scanner sc) {
	int n1=0;
	double n2=0;
	do {
		System.out.println("Selecciona la conversión de peso");
		System.out.println("1. Libras a Kilogramos");
		System.out.println("2. Kilogramos a libras");
		System.out.println("0. Salir");
		String e1=sc.nextLine();
		n1=Integer.parseInt(e1);
		switch (n1) {
		case 1:System.out.println("Introduce las libras que deseas convertir a kilogramos");
			String e2=sc.nextLine();
			n2=Double.parseDouble(e2);
			System.out.println(Funciones1.libraakilogramo(n2));
			break;
		case 2:System.out.println("Introduce los kilogramos que deseas convertir a libras");
		e2=sc.nextLine();
		n2=Double.parseDouble(e2);
		System.out.println(Funciones1.kilogramoaLibra(n2));
		break;
		case 0: break;
		default:System.out.println("Número no valido");
			break;
		}
	} while (n1!=0);
}
}
