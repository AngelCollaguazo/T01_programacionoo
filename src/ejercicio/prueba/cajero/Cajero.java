package ejercicio.prueba.cajero;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);// TECLADO
		int retirar;
		int cambiar;
		int opc = 0;
		while (opc != 4) {
			System.out.println("*************************************************");
			System.out.println("*** Banco del Pichincha seleccione una opción ***");
			System.out.println("*** 1. Retirar dinero                         ***");
			System.out.println("*** 2. Cambiar de clave                       ***");
			System.out.println("*** 3. Bloquear Cuenta                        ***");
			System.out.println("*** 4. Salir                                  ***");
			System.out.println("*************************************************");

			System.out.println("Seleccione un Opccion: ");
			opc = teclado.nextInt();
			if (opc == 1) {
				System.out.println("Ingrese valor a retirar: ");
				retirar = teclado.nextInt();
				System.out.println("El valor a retirar es: " + retirar);
			} else {
				if (opc == 2) {
					System.out.println("Ingrese nueva clave: ");
					cambiar = teclado.nextInt();
					System.out.println("Su clave ah sido cambiada: " + cambiar);
				} else {
					if (opc == 3) {
						System.out.println("Su cuenta ha sido bloqueada");
					}
				}

			}
		}
	}
}
