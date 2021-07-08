package diagramasflujo;

import java.util.Scanner;

public class MainT11E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner teclado =new Scanner(System.in);//TECLADO
		System.out.println("Ingrese el primer número: ");
		int A=teclado.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int B=teclado.nextInt();
		
		if(B==0) {
			//SI
			System.out.println("La divión es imposible");
		}else {
			//NO
			int D=A/B;
			System.out.println("La división es : " +D);		
		}
	}
}

