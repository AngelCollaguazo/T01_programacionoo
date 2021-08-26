package menu;

public class Paciente {
	
	private String nombre; //SET y GET
	private String apellido;  //SET y GET
	private int edad;  //SET y GET
	
	private void caminar() {
		
	}
	private void correr() {
		
	}
	
	
	//Metodos SET y GET
	//Siempre son publicos 
	//nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Apellido
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//edad
	public void setEdad(int edad1) {
		this.edad = edad1;
	}
	
	//Nombre
	public String getNombre() {
		return this.nombre;
	}
	
	//Apellido
	public String getApellido() {
		return this.apellido;
	}
	
	//edad
	public int getEdad() {
		return this.edad;
	}
}
