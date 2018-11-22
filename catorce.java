/*Se pide representar el algoritmo que nos calcule la suma de los N primeros números pares.
  Es decir, si insertamos un 5, nos haga la suma de 2+4+6+8+10.*/

import java.util.Scanner;
public class catorce {
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese n primeros numeros");
		int n;
		int v;
		int c=0;
		int j=1;
		n=entrada.nextInt();
		int [] Array=new int [n];
		for(int i=0;i<n;i++){
			Array[i]=2*j;
			j++;
		}
		for(int k=0;k<n;k++){
			v=Array[k];
			c=v+c;
		}
		System.out.println("la suma de sus "+n+" primeros numeros pares es "+c);
		entrada.close();
	}
}
