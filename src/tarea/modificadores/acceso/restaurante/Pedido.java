package tarea.modificadores.acceso.restaurante;

public class Pedido extends Cliente {
	public void pedidocomida() {
	System.out.println(nombre);
	System.out.println(apellido);
	System.out.println(edad);
	System.out.println(pedido);
	System.out.println(numeroCuenta);
	obtenerNumeroDeOrden();
	realizarPedido();
	entregarPedido();
	}

}



