package reto;
import java.util.Locale;
import java.util.Scanner;
import reto.Funciones1;
import reto.Funciones2;
import reto.Funciones3;
public class Reto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in).useLocale(Locale.US);
		int n1=0;
		double n2=0;
		//inicio del double
		do {
			System.out.println("Selecciona el tipo de conversión");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("5. Moneda");
			System.out.println("6. Angulo");
			System.out.println("0. Salir");
			String opcion=sc.nextLine();
			n1=Integer.parseInt(opcion);
			switch (n1) {
			//Menu de longitud
			case 1:Funciones1.menuLongitud(sc);
				break;
			//Menu de peso
			case 2:Funciones1.menuPeso(sc);
			break;
			//menu de temperatura
			case 3:Funciones2.menuTemperatura(sc);
			break;
			//Menu de volumen
			case 4:Funciones2.menuVolumen(sc);
			break;
			//Menu de monedas
			case 5:Funciones3.menuMoneda(sc);
			break;
			//Menu de angulos
			case 6:Funciones3.menuAngulo(sc);
			break;
			//Salir
			case 0:System.out.println("Has salido del programa");break;
			//Default en caso de que sea un numero fuera del 0 al 6
			default:System.out.println("Número no válido");
				break;
			}
		} while (n1!=0);
	}

}
