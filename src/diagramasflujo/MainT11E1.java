package diagramasflujo;

import java.util.Scanner;

public class MainT11E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner teclado =new Scanner(System.in);//TECLADO
		System.out.println("*************************************");
		System.out.println("*  UNIVERSIDAD CENTRAL DEL ECUADOR  *");
		System.out.println("*  ANGEL COLLAGUAZO                 *");
		System.out.println("*  PROGRAMACION 1                   *");
		System.out.println("*  Ejercicio 1                      *");
		System.out.println("*************************************");
		System.out.println("Ingrese el primer n�mero: ");
		float A=teclado.nextInt();
		System.out.println("Ingrese el segundo n�mero: ");
		float B=teclado.nextInt();
		
		if(B==0) {
			//SI
			System.out.println("La divi�n es imposible");
		}else {
			//NO
			float D=A/B;
			System.out.printf("La divisi�n es: " + D);		
		}
	}
}

