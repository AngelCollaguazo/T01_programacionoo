package angel.daniel.collaguazo.guaman;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);// TECLADO
		int s = 0;
		float p = 0;
		int c = 0;
		int i;
		for (i = 1; i != 0; i++) {
			System.out.println("Ingrese un numero positivo");
			int n = teclado.nextInt();
			if (n == 0) {
				i = -1;
			} else {
				s = s + n;
				p = s / i;
				c = c + 1;
			}
		}
		System.out.println("La suma es: " + s);
		System.out.println("El promedio es: " + p);
		System.out.println("La cantidad de numeros ingresados es: " + c);
	}
}
