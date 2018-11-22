/* Algoritmo que nos diga si una persona puede acceder a cursar un ciclo formativo 
   de grado superior o no. Para acceder a un grado superior, si se tiene un titulo
   de bachiller, en caso de no tenerlo, se puede acceder si hemos superado una prueba de acceso.*/

import java.util.Scanner;
public class once {
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		String R;
		System.out.println("¿Usted posee titulo bachiller?(si o no)");
		R=entrada.nextLine();
		switch (R){
		case "si":
			System.out.println("Usted puede acceder al curso");
			break;
		case "no":
			System.out.println("Usted debe realizar un test para acceder al C.G.S.");
			break;
		default:
			System.out.println("Ingrese si o no");
			break;
		}
		entrada.close();
	}
}