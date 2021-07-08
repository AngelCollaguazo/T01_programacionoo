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
			System.out.println("Número Correcto");
		}else {
			//NO
			System.out.println("Número Incorrecto");
			System.out.println("El número es: "+ A);
			
		}

	}

}
