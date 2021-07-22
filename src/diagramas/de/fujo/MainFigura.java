package diagramas.de.fujo;

import java.util.Scanner;

public class MainFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese el número de filas: ");

		Scanner teclado = new Scanner(System.in);// TECLADO
		int n = teclado.nextInt();

		for (int fila = 1; fila <= n; fila++) {
			for (int ast = 1; ast <= fila; ast++) {
				System.out.print("*");
			}
			System.out.println();//Salto de linea
		}

	}

}
