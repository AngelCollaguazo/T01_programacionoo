package diagramasflujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese dos n�meros:");
		Scanner teclado =new Scanner(System.in);//TECLADO
		int A=teclado.nextInt();
		System.out.println("n�mero ingresado 1:" + A);
		int B=teclado.nextInt();
		System.out.println("n�mero ingresado 2:" + B);
		
		int S = A+B;
		int R = A-B;
		int P = A*B;
		
		System.out.println("La suma es:"+S);
		System.out.println("La resta es:"+R);
		System.out.println("El producto es:"+P);

	}

}
