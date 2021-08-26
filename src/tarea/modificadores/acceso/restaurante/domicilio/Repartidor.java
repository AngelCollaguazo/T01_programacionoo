package tarea.modificadores.acceso.restaurante.domicilio;

import tarea.modificadores.acceso.restaurante.Pedido;

public class Repartidor {
	
		public void entregarelpedido() {
			Pedido juan = new Pedido();
			juan.pedidocomida();
			juan.nombre="";
			juan.apellido="";
			juan.edad="";
			juan.entregarPedido();
			realizarPedido();
		}
}
