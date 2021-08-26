package tarea.modificadores.acceso.restaurante;

public class Cliente {
	//nombre y apelllidos son atributos public y aplican para todos 
	public String nombre;
	public String apellido;
	
	// pedido es un atributo protected y solo aplica para la clase el paquete y la subclase
	protected String pedido;
	
	// numero cuenta es un atributo private  y solo aplica para la clase
	private String numeroCuenta;
	
	 //edad es default y solo aplica para la clase y el paquete
	int edad;
	
public void obtenerNumeroDeOrden() {
	System.out.println("El nombre del cliente es: " +nombre);
	System.out.println("El apellido del cliente es: " +apellido);
	System.out.println("El pedido del cliente es: " +pedido);
	System.out.println("El numero de cuenta del cliente es: " +numeroCuenta);
		
	}
public void entregarPedido() {
	
}
	
	protected void realizarPedido() {
		
		
	}
}
