package ejercicios.interfaces.consultorio;

public class ConsultorioVozAndes implements ConsultorioInterfaz{

	@Override
	public void solicitarDatos(String datos) {
		// TODO Auto-generated method stub
		System.out.println("Porfavor me permite sus datos");
	}

	@Override
	public void validarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Espere un momento validamos sus datos");
	}

	@Override
	public void solicitarTipoDeConsulta(String consulta) {
		// TODO Auto-generated method stub
		System.out.println("Que Consulta desea");
	}

	@Override
	public void solicitarDescuento(float descuento) {
		// TODO Auto-generated method stub
		System.out.println("Esta consulta tiene un descuento");
	}

	@Override
	public void realizarConsulta() {
		// TODO Auto-generated method stub
		System.out.println("Porfavor adelante le realizaremos su respectiva consulta");
	}

}




