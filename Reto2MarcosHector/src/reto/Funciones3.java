package reto;

import java.util.Scanner;

public class Funciones3 {

	public static double euroAdolar(double n) {
		return n*1.16;
	}
	public static double dolarAeuro(double n) {
		return n*0.86;
	}
	public static double gradoAradian(double n) {
		return (n*Math.PI)/180;
	}
	public static double radianAgrado(double n) {
		return (n*180)/Math.PI;
	}
	public static void menuMoneda(Scanner sc) {
		int opcion=0;
		do {
			System.out.println("Selecciona la conversion de moneda");
			System.out.println("1. De euro a dolar");
			System.out.println("2. De dolar a euro");
			System.out.println("0. Salir");
			 opcion=Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1: {
				System.out.println("Introduce la cantidad de euros que deseas convertir a dolares");
				double e=Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.euroAdolar(e));
				break;
				
			}
			case 2: { 
				System.out.println("Introduce la cantidad de dolares que deseas convertir a euros");
				double d=Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.dolarAeuro(d));
				break;
			}
			case 0: {
				break;
			}
			default:
				System.out.println("Numero no valido");
				break;
			}
		}while(opcion!=0);
	}
	public static void menuAngulo(Scanner sc) {
		int opcion=0;
		do {
			System.out.println("Selecciona la conversion de moneda");
			System.out.println("1. De grado a radian");
			System.out.println("2. De radian a grado");
			System.out.println("0. Salir");
			opcion=Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1: {
				System.out.println("Introduce la cantidad de grados que deseas convertir a radianes");
				double e=Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.gradoAradian(e));
				break;
			}
			case 2: { 
				System.out.println("Introduce la cantidad de radianes que deseas convertir a grados");
				double d=Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.radianAgrado(d));
				break;
			}
			case 0: {
				break;
			}
			default:
				System.out.println("Numero no valido");
				break;
			}
			
		} while (opcion!=0);
	}
}
