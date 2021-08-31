package reserva.de.viajes;

import java.util.Scanner;

import tablero.ajedrez.Pieza;

public class MainBus {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		// TODO Auto-generated method stub

		Adulto adulto1 = new Adulto();
		adulto1.setnombrePasajero("Andres");
		adulto1.apellidoPasajero("Alvarez");
		adulto1.setCodigoSeguroSocial(0001);
		adulto1.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto2 = new Adulto();
		adulto2.setnombrePasajero("Javier");
		adulto2.apellidoPasajero("Alvarez");
		adulto2.setCodigoSeguroSocial(0001);
		adulto2.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto3 = new Adulto();
		adulto3.setnombrePasajero("Andres");
		adulto3.apellidoPasajero("Alvarez");
		adulto3.setCodigoSeguroSocial(0001);
		adulto3.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto4 = new Adulto();
		adulto4.setnombrePasajero("Andres");
		adulto4.apellidoPasajero("Alvarez");
		adulto4.setCodigoSeguroSocial(0001);
		adulto4.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto5 = new Adulto();
		adulto5.setnombrePasajero("Andres");
		adulto5.apellidoPasajero("Alvarez");
		adulto5.setCodigoSeguroSocial(0001);
		adulto5.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto6 = new Adulto();
		adulto6.setnombrePasajero("Andres");
		adulto6.apellidoPasajero("Alvarez");
		adulto6.setCodigoSeguroSocial(0001);
		adulto6.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto7 = new Adulto();
		adulto7.setnombrePasajero("Andres");
		adulto7.apellidoPasajero("Alvarez");
		adulto7.setCodigoSeguroSocial(0001);
		adulto7.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto8 = new Adulto();
		adulto8.setnombrePasajero("Andres");
		adulto8.apellidoPasajero("Alvarez");
		adulto8.setCodigoSeguroSocial(0001);
		adulto8.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto9 = new Adulto();
		adulto9.setnombrePasajero("Andres");
		adulto9.apellidoPasajero("Alvarez");
		adulto9.setCodigoSeguroSocial(0001);
		adulto9.setNombreEmpresaDeTrabajo("Tapensa");

		Adulto adulto10 = new Adulto();
		adulto10.setnombrePasajero("Andres");
		adulto10.apellidoPasajero("Alvarez");
		adulto10.setCodigoSeguroSocial(0001);
		adulto10.setNombreEmpresaDeTrabajo("Tapensa");

		Adolescente adolescente1 = new Adolescente();
		adolescente1.setnombrePasajero("Andres");
		adolescente1.apellidoPasajero("Alvarez");
		adolescente1.setDeporteQuePractica("Futbol");

		Adolescente adolescente2 = new Adolescente();
		adolescente2.setnombrePasajero("Andres");
		adolescente2.apellidoPasajero("Alvarez");
		adolescente2.setDeporteQuePractica("Futbol");

		Adolescente adolescente3 = new Adolescente();
		adolescente3.setnombrePasajero("Andres");
		adolescente3.apellidoPasajero("Alvarez");
		adolescente3.setDeporteQuePractica("Futbol");

		Adolescente adolescente4 = new Adolescente();
		adolescente4.setnombrePasajero("Andres");
		adolescente4.apellidoPasajero("Alvarez");
		adolescente4.setDeporteQuePractica("Futbol");

		Adolescente adolescente5 = new Adolescente();
		adolescente5.setnombrePasajero("Andres");
		adolescente5.apellidoPasajero("Alvarez");
		adolescente5.setDeporteQuePractica("Futbol");

		Adolescente adolescente6 = new Adolescente();
		adolescente6.setnombrePasajero("Andres");
		adolescente6.apellidoPasajero("Alvarez");
		adolescente6.setDeporteQuePractica("Futbol");

		Adolescente adolescente7 = new Adolescente();
		adolescente7.setnombrePasajero("Andres");
		adolescente7.apellidoPasajero("Alvarez");
		adolescente7.setDeporteQuePractica("Futbol");

		Adolescente adolescente8 = new Adolescente();
		adolescente8.setnombrePasajero("Andres");
		adolescente8.apellidoPasajero("Alvarez");
		adolescente8.setDeporteQuePractica("Futbol");

		Adolescente adolescente9 = new Adolescente();
		adolescente9.setnombrePasajero("Andres");
		adolescente9.apellidoPasajero("Alvarez");
		adolescente9.setDeporteQuePractica("Futbol");

		Adolescente adolescente10 = new Adolescente();
		adolescente10.setnombrePasajero("Andres");
		adolescente10.apellidoPasajero("Alvarez");
		adolescente10.setDeporteQuePractica("Futbol");

		System.out.println(
				"Recuerde que los pasajeros adultos siempre se les asigna los asientos de la ventana "
				+ "y los pasajeros adolescentes los asientos de los pasillos");

		System.out.println("Ingrese el numero de filas del bus: ");
		int longitudFila = lector.nextInt();

		System.out.println("Ingrese el numero de columnas del bus: ");
		int longitudColumnas = lector.nextInt();

		char A[][] = new char[longitudFila][longitudColumnas];
		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {
				System.out.println("Ingrese pasajero de la fila: " + fila + " columna: " + columna);
				char n = lector.next().charAt(0);
				A[fila][columna] = n;
			}
		}

		System.out.println("Iniciamos a imprimir la matriz");
		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {
				System.out.print(A[fila][columna] + " ");
			}
			System.out.println();
		}

	}
}
