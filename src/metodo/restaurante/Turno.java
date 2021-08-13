package metodo.restaurante;

public class Turno {
	
	public String turno;

	public Turno() {

	}

	public void Imprimir(String datosAImprimir, String nombre, String cedula, String telefono, String pedido, 
			String numTurno) {
		System.out.println("Restaurante las delicias");
		System.out.println("LOGO");
		System.out.println(datosAImprimir +" Nombre de:" + nombre + " Cédula:" + cedula
				+ " Telefono: " + telefono + " Su pedido:" + pedido + " El numero de turno es:"
				+ numTurno);
		System.out.println("Lo mejor de lo mejor");
		System.out.println("Disfrute y vuelva pronto");

	}

}
