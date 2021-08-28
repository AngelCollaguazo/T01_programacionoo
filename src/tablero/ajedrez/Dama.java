package tablero.ajedrez;

public class Dama extends Pieza{
	
	public String toString() {
		return "PiezaDama [damaBlanco=" + damaBlanco + ", damaNegro=" + damaNegro + "]";
	}
	private String damaBlanco;
	private String damaNegro;
	
	public String getDamaBlanco() {
		return damaBlanco;
	}
	public void setDamaBlanco(String damaBlanco) {
		this.damaBlanco = damaBlanco;
	}
	
	public String getDamaNegro() {
		return damaNegro;
	}
	public void setDamaNegro(String damaNegro) {
		this.damaNegro = damaNegro;
	}
	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}


}
