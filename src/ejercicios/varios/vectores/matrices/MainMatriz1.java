package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		// TODO Auto-generated method stub
		//1. Decalre una matriz[3,4] de tipo char y desarrolle un programa que 
		//vaya solicitando cada una de sus posiciones
		
		System.out.println("Ingrese el numero de filas del vector: " );
		//El ususario digita el numero de filas y yo debo leer desde teclado
		int longitudFila =lector.nextInt();
		
		System.out.println("Ingrese el numero de columnas del vector: " );
		//El ususario digita el numero de columnas y yo debo leer desde teclado
		int longitudColumnas =lector.nextInt();
		
		char A[][] = new char[longitudFila][longitudColumnas];
		for (int fila=0; fila<longitudFila; fila++) {
			for (int columna=0; columna <longitudColumnas; columna ++) {
				System.out.println("Ingrese valor de la fila: " +fila+ " columna: " +columna);
				//El ususario digita el valor por teclado y acontinuación lo lee
				char n =lector.next().charAt(0);
				A[fila][columna] = n;
			}
		}
		
		System.out.println("Iniciamos a imprimir la matriz");
		for (int fila=0; fila<longitudFila; fila++) {
			for (int columna=0; columna <longitudColumnas; columna ++) {
				System.out.print(A[fila][columna]+" ");
	}
			System.out.println();
}
}
}