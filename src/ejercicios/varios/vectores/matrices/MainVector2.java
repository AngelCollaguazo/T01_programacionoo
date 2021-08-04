package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		// TODO Auto-generated method stub
		//Declare un vector X cuya longitud se solicite al usuario , de tipo int y construya un
		//programa que pida al usuario queingrese los valores paracada posicion y  
	    //finalmente que se imprima todos los valores ingresados
		System.out.println("Ingrese el tamaño del vector: ");
		int n =lector.nextInt();
	   int X[] = new int[n];
		for(int i=0; i<n; i++) {
		System.out.println("Ingrese valor de la posición: " + i);
		 int p =lector.nextInt();
		X[i]=p;
		}
		//Recorriendo el vector lleno
		for(int i=0; i<n; i++) {
			System.out.println("El valor de la posición: " + i);
			System.out.println(X[i]);
		}
	}

}
