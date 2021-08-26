package ejercicios.interfaces.matricula;

public class MatriculaUCE implements MatriculaInterfaz{

	@Override
	public void solicitarDatos(String datos) {
		// TODO Auto-generated method stub
		System.out.println("Porfavor cuales son sus datos");
	}

	@Override
	public void validarMateriasAprobadas() {
		// TODO Auto-generated method stub
		System.out.println("Estamos validando sus materias aprobadas");
	}

	@Override
	public void validarProfesoresDisponibles() {
		// TODO Auto-generated method stub
		System.out.println("Un momento estamos validando cuantos proferores estan disponibles");
	}

	@Override
	public void validarCuposExistentes() {
		// TODO Auto-generated method stub
		System.out.println("Calculando cuantos cupos estan disponibles");
	}

	@Override
	public void imprimirComprobante() {
		// TODO Auto-generated method stub
		System.out.println("Aqui tiene su comprobante");
	}

}





