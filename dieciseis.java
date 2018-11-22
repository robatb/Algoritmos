/* Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo 
 *  que nos pida una clave. Solo tenemos 3 intentos para acertar, si
 *  fallamos los 3 intentos nos mostrara un mensaje indicándonos que 
 *  hemos agotado esos 3 intentos. (Recomiendo utilizar un interruptor).
 *  Si acertamos la clave, saldremos directamente del programa.*/

import java.util.Scanner;
public class dieciseis {
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		String clave=null;
		for(int i=0;i<3;i++){
			System.out.println("Ingrese Clave");
			clave=entrada.nextLine();
			
			if(!clave.equals("eureka")){
				System.out.println("Clave erronea");
			}
			else{i=3;}
		}
		if(!clave.equals("eureka")){
			System.out.println("Se agotaron sus intentos");
		}
		entrada.close();
	}

}
