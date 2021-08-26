package deber.interfaces;

public interface BibliotecaInterfaz {
	
	public void solicitarCedulaIdentidad(String numero);

	public void validarDatos();

	public void solicitarTipoSolicitud(String prestamo, String alquilar);

	public void solicitarLibro(String libro);

	public void entregarLibro();

}





