package pruebas;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa que solicite ingresar un n�mero (solo positivos), y as�
		 * seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero cero
		 * (0), cuando se ingrese el numero cero, ya no solicitar� m�s n�meros y en ese
		 * momento el programa debe imprimir la suma solo de los n�meros ingresados
		 * hasta ese momento. Adicional debera imrpimir la cantidad de numeros
		 * ingresados por el usuario Con Bucle While
		 */
		Scanner teclado = new Scanner(System.in);// TECLADO
		float s = 0;
		float p = 0;
		int c = 0;
		float i = 1;
		while (i != 0) {
			System.out.println("Ingrese un numero positivo");
			int n = teclado.nextInt();
			if (n == 0) {
				i = -1;
			} else {
				s = s + n;
				p = s / i;
				c = c + 1;
			}
			i++;
		}
		System.out.println("La suma es: " + s);
		System.out.println("El promedio es: " + p);
		System.out.println("La cantidad de numeros ingresados es: " + c);
	}
}





