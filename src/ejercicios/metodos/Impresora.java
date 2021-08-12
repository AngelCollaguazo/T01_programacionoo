//1. declaracion del paquete
package ejercicios.metodos;

//2. declaracion de importaciones

//3.Comentarios
//Clse que se encarga de realizar una impresion en formato A4

//4.  Declaracion de la clase
public class Impresora {
	
	//5. Constantes
	//6. Variable
	public String color;
	
	//7. constructor
	public Impresora() {
		
	}
	
	
	//8. métodos
	public void imprimir(String datosAImprimir, int letra) {
		System.out.println("Logo UCE");
		System.out.println("****************");
		System.out.println(datosAImprimir);
		System.out.println("****************");
		System.out.println("Pie de firma");
		
	}
	
}
