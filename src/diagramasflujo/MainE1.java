package diagramasflujo;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el valor del sueldo: ");
		
		Scanner teclado =new Scanner(System.in);//TECLADO
		int S=teclado.nextInt();
		
		if(S<300) {
			//SI
			int B=40;
			System.out.println("Su bonificación es: "+B);
		}else {
			//NO
			int B=0;
			System.out.println("Su bonificación es: "+B);
			
		}

	}

}
