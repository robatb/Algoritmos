/* Desarrollar un algoritmo que nos calcule el cuadrado de los 9 primeros números naturales*/

import java.util.Scanner;
public class doce {
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		int n;
		int c=0;
		int i=1;
		System.out.println("ingrese n numeros");
		n=entrada.nextInt();
		System.out.println("Los cuadrados de los primeros n numeros naturales");
		while(i<=n){
			c=i*i;
			System.out.println("el cuadrado de "+i+" = "+c);
			i++;
		}
		
		entrada.close();
	}
	
	
}
