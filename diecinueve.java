/* Leer tres números que denoten una fecha (día, mes, año). Comprobar que es 
 * una fecha válida. Si no es válida escribir un mensaje de error. Si es válida
 * escribir la fecha cambiando el número del mes por su nombre. Ej. si se 
 * introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”.*/

import java.util.Scanner;
public class diecinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int d;
		int m=0;
		int a=0;
		System.out.println("ingrese dia(1-31)");
		d=entrada.nextInt();
		if(d<=31){
			if(d>0){
				System.out.println("ingrese mes(1-12)");
				m=entrada.nextInt();
			}
			else{
				System.out.println("error de fecha");
			}
			if(m<=12){
				if(m>0){
					System.out.println("ingrese año");
					a=entrada.nextInt();
					if(a>0){
						switch(m){
						case 1:System.out.println(d+" de enero del "+a);
							break;
						case 2:System.out.println(d+" de febrero del "+a);
							break;
						case 3:System.out.println(d+" de marzo del "+a);
							break;
						case 4:System.out.println(d+" de abril del "+a);
							break;
						case 5:System.out.println(d+" de mayo del "+a);
							break;
						case 6:System.out.println(d+"de junio del "+a);
							break;
						case 7:System.out.println(d+" de julio del "+a);
							break;
						case 8:System.out.println(d+" de agosto del "+a);
							break;
						case 9:System.out.println(d+" de septiembre del "+a);
							break;
						case 10:System.out.println(d+" de octubre del "+a);
							break;
						case 11:System.out.println(d+" de noviembre del "+a);
							break;
						case 12:System.out.println(d+" de diciembre del "+a);
							break;
						default:{}	
						}
					}
					else{System.out.println("error año");
					}
				}
			}
			else{System.out.println("mes incorrecto");
			}
		}
		else{System.out.println("datos incorrectos");
		}
		entrada.close();
	}

}
