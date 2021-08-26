package deber.interfaces;

public class BibliotecaCasaLibro implements BibliotecaInterfaz {

	@Override
	public void solicitarCedulaIdentidad(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Porfavor su numero de Cedula: ");
	}

	@Override
	public void validarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Su nombre y apellidos son ");
	}

	@Override
	public void solicitarTipoSolicitud(String prestamo, String alquilar) {
		// TODO Auto-generated method stub
		System.out.println("Desea el libro para prestamo o desea alquilarlo");
	}

	@Override
	public void solicitarLibro(String libro) {
		// TODO Auto-generated method stub
		System.out.println("Que libro desea");
	}

	@Override
	public void entregarLibro() {
		// TODO Auto-generated method stub
		System.out.println("Aqui tiene su libro porfavor cuidelo");
	}

}





