package restaurante;

public class Turno {
	
	public String color;
	
	public Turno() {
		
	}
		public void imprimir(String datosAImprimir,String nombre, String cedula, String telefono, int numTurno, int letra, String entrada, String platofuerte,String postre ) { 
			System.out.println("Restaurante Las Delicias");
			System.out.println("LOGO");
			System.out.println(datosAImprimir+"Nombre:"+nombre+ " C.I:"+cedula+ " Telefono:"+telefono+ " Turno:#"+numTurno);
			System.out.println("Pedido Entrada: "+entrada+ " Plato Fuerte:" +platofuerte+ " Postre:"+postre);
			System.out.println("Lo mejor de lo mejor");
			System.out.println("Disfruta y vuelve pronto ");
		}
		
}
