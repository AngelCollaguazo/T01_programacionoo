package deber.interfaces;

public class BibliotecaCentral implements BibliotecaInterfaz{

	@Override
	public void solicitarCedulaIdentidad(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Cual es su numero de cedula");
	}

	@Override
	public void validarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Su nombre es: ");
		System.out.println("Su apellido es: ");
	}

	@Override
	public void solicitarTipoSolicitud(String prestamo, String alquilar) {
		// TODO Auto-generated method stub
		System.out.println("Que desea: ");
		System.out.println("1- Prestamo Libro");
		System.out.println("2.- Alquilar libro");
	}

	@Override
	public void solicitarLibro(String libro) {
		// TODO Auto-generated method stub
		System.out.println("Cual libro desea");
	}

	@Override
	public void entregarLibro() {
		// TODO Auto-generated method stub
		System.out.println("Recuerde que el libro esta en buen estado cualquier daño debe pagarlo");
	}

}




