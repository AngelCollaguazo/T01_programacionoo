package ejercicios.interfaces;

public class CajeroProdubanco implements CajeroInterfaz{

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido ingrese su tarjeta porfavor");
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su tarjeta como muestra en la imagen");
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Que transaccion desea realizar");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Que monto desea retirar");
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Espere un momento estamos validando su Saldo");
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Puede retirar su dinero");
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Espere un momento realizando la transaccion");
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Aqui tiene su recibo puede retirarlo");
	}

}
