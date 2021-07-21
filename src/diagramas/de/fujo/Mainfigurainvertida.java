package diagramas.de.fujo;

import java.util.Scanner;

public class Mainfigurainvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese el número de filas: ");
		Scanner teclado = new Scanner(System.in);// TECLADO
		int n = teclado.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();// Salto de linea
		}
	}
}
