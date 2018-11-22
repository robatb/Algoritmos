/* Realizar un algoritmo que dado un número entero, visualice en pantalla si es par o impar.
 si se teclea un cero, se vuelva a pedir el número por teclado 
(así hasta que se teclee un número mayor que cero) (recuerda la estructura mientras)*/

import java.util.Scanner;
public class diez {
	public static void main(String[]args){
		int n;
		int aux=1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero");
		n=entrada.nextInt();
		
		while(n<=0){
			System.out.println("ingrese un numero mayor que cero");
			n=entrada.nextInt();
		}
		for(int i=0;i<n;i++){
			aux=1-aux;
		}
		if(aux==0){
			System.out.println("es un numero impar");
		}
		if(aux==1){
			System.out.println("es un numero par");
		}
		entrada.close();
	}
}
