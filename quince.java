/* Dada una secuencia de números leídos por teclado, que acabe con un –1, 
 por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el algoritmo que
 calcule la media aritmética. ademas debe crear trozo de codigo que permita
 validar que el usuario no insertara numero negativos.*/

import java.util.Scanner;
public class quince {
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		int dato;
		int conta=0;
		int suma=0;
		int salir=0;
		System.out.println("Calculo de la media aritmetica");
		while(salir==0){
			System.out.println("Ingrese datos(presione -1 para terminar)");
			dato=entrada.nextInt();
			if(dato<0){
				if(dato==-1){salir=1;}
				else{System.out.println("Ingrese dato valido");}
			
			}
			else{suma=(suma+dato);
			conta++;
			}
		}
		System.out.println("la media aritmetica es: "+suma/conta);
		
		entrada.close();
	}
}
