package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz{

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Porfavor ingrese la tarjeta");
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Porfavor ingrese su clave");
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Seleccione que tipo de transaccion desea realizar");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el monto que desea retirar");
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Espere un momento estamos validando su Saldo");
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Retire su dinero");
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Realizando la transaccion espere un momento");
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Imprimiendo su recibo puede retirarlo");
	}

}
