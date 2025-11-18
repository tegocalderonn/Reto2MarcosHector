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
			case 1:Funciones1.menuLongitud(sc);
				break;
			case 2:Funciones1.menuPeso(sc);
			break;
			case 3:Funciones2.menuTemperatura(sc);
			break;
			case 4:Funciones2.menuVolumen(sc);
			break;
			case 5:Funciones3.menuMoneda(sc);
			break;
			case 6:Funciones3.menuAngulo(sc);
			break;
			case 0:System.out.println("Has salido del programa");break;
			default:System.out.println("Número no válido");
				break;
			}
		} while (n1!=0);
	}

}
