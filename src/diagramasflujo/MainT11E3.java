package diagramasflujo;

import java.util.Scanner;

public class MainT11E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);//TECLADO
		System.out.println("*************************************");
		System.out.println("*  UNIVERSIDAD CENTRAL DEL ECUADOR  *");
		System.out.println("*  ANGEL COLLAGUAZO                 *");
		System.out.println("*  PROGRAMACION I                   *");
		System.out.println("*  Ejercicio 3                      *");
		System.out.println("*************************************");
		System.out.println("Ingrese el valor del sueldo: ");
		int S=teclado.nextInt();
		int B=100;
		if(S<300) {
			System.out.println("Su bonificación es: "+B);
			System.out.println("El valor neto a recibir es: "+(S+B));
		}else if(S>=300 && S<=400) {
			System.out.println("Su bonificación es: "+(B-30));
			System.out.println("El valor neto a recibir es: "+(S+(B-30)));
		}else if(S>400){
			System.out.println("Su bonificación es: "+(B-50));		
			System.out.println("El valor neto a recibir es: "+(S+(B-50)));
		}
		}
	}

