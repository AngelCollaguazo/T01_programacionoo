package diagramas.de.fujo;

import java.util.Scanner;

public class Main1 {
	//Se ingreso por teclado un número e imprime los 5 numeros siguientes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);//TECLADO
		System.out.println("Ingrese un número: ");
		int N=teclado.nextInt();
		for (int C=N+1;C<=N+5;C++) {
			System.out.println(C);
		}
		System.out.println("Se ha finalizado la impresión de los 5");

	}

}
