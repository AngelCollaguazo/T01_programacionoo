package ejercicios.interfaces.consultorio;

public class ConsultorioLaCarolina implements ConsultorioInterfaz{

	@Override
	public void solicitarDatos(String datos) {
		// TODO Auto-generated method stub
		System.out.println("Cuales son sus datos");
	}

	@Override
	public void validarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Sus datos estan siendo validados");
	}

	@Override
	public void solicitarTipoDeConsulta(String consulta) {
		// TODO Auto-generated method stub
		System.out.println("Que consulta desea realizarse");
	}

	@Override
	public void solicitarDescuento(float descuento) {
		// TODO Auto-generated method stub
		System.out.println("Aplicamos un descuento en la consulta que se va a realziar");
	}

	@Override
	public void realizarConsulta() {
		// TODO Auto-generated method stub
		System.out.println("Un gusto puede realizarse su consuta");
	}

}




