package diagramasflujo;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero");
		
		Scanner teclado =new Scanner(System.in);//TECLADO
		int A=teclado.nextInt();
		
		if(A>7) {
			//SI
			System.out.println("N�mero Correcto");
		}else {
			//NO
			System.out.println("N�mero Incorrecto");
			System.out.println("El n�mero es: "+ A);
			
		}

	}

}
