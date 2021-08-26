package ejercicios.interfaces.matricula;

public class MatriculaESPE implements MatriculaInterfaz{

	@Override
	public void solicitarDatos(String datos) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese sus datos porfavor");
	}

	@Override
	public void validarMateriasAprobadas() {
		// TODO Auto-generated method stub
		System.out.println("Estamos analizando las materias que tiene aprobadas");
	}

	@Override
	public void validarProfesoresDisponibles() {
		// TODO Auto-generated method stub
		System.out.println("Analizando cuantos profesores estan disponibles");
	}

	@Override
	public void validarCuposExistentes() {
		// TODO Auto-generated method stub
		System.out.println("Espere estamos analizando cuantos cupos estan disponibles");
	}

	@Override
	public void imprimirComprobante() {
		// TODO Auto-generated method stub
		System.out.println("Matricula exitosa aqui tiene su comprobante");
	}

}




