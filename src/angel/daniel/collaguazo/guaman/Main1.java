package angel.daniel.collaguazo.guaman;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa que solicite ingresar un n�mero (solo positivos), y as�
		 * seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero (-1),
		 * cuando se ingrese el numero -1, ya no solicitar� m�s n�meros y en ese momento
		 * el programa debe imprimir la suma solo de los n�meros pares ingresados y el
		 * promedio solo de los n�meros impares ingresados hasta ese momento
		 */
		Scanner teclado = new Scanner(System.in);// TECLADO
		int sp = 0;
		int si = 0;
		float pi = 0;
		int ci = 0;
		int i;
		for (i = 1; i != -1; i++) {
			System.out.println("Ingrese un numero positivo");
			int n = teclado.nextInt();
			if (n == -1) {
				i = -2;
			} else if (n % 2 == 0) {
				sp = sp + n;
			} else {
				si = si + n;
				ci = ci + 1;
				pi = si / ci;
			}
		}
		System.out.println("La suma de los pares es: " + sp);
		System.out.println("El promedio de los impares es: " + pi);
		System.out.println("La cantidad de numeros impares ingresados es: " + ci);
	}
}






