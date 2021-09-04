package ejercicio.prueba.cajero;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);// TECLADO
		int r;
		int c;
		int o = 0;
		while (o != 4) {
			System.out.println(" Banco del Pichincha seleccione una opción");
			System.out.println(" 1. Retirar dinero  ");
			System.out.println(" 2. Cambiar de clave ");
			System.out.println(" 3. Bloquear cuenta");
			System.out.println(" 4. Salir");

			System.out.println("Seleccione un Opccion: ");
			o = teclado.nextInt();
			if (o == 1) {
				System.out.println("Ingrese valor a retirar: ");
				r = teclado.nextInt();
				System.out.println("El valor a retirar es: " + r);
			} else {
				if (o == 2) {
					System.out.println("Ingrese nueva clave: ");
					c = teclado.nextInt();
					System.out.println("Su clave ah sido cambiada: " + c);
				} else {
					if (o == 3) {
						System.out.println("Su cuenta ha sido bloqueada");
					}
				}

			}
		}
	}
}
