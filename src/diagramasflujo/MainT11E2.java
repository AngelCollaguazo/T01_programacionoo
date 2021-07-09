package diagramasflujo;

import java.util.Scanner;

public class MainT11E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);//TECLADO
		System.out.println("*************************************");
		System.out.println("*  UNIVERSIDAD CENTRAL DEL ECUADOR  *");
		System.out.println("*  ANGEL COLLAGUAZO                 *");
		System.out.println("*  PROGRAMACION I                   *");
		System.out.println("*  Ejercicio 2                      *");
		System.out.println("*************************************");
		System.out.println("Ingrese el primer número: ");
		int A=teclado.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int B=teclado.nextInt();
		int mul ;
		mul=A%B;
		if(mul==0) {
			//SI
			System.out.println(+A+ " Es multiplo de " +B);
		}else {
			//NO
			System.out.println(+A+ " No es multiplo de " +B);		
		}

	}

}
