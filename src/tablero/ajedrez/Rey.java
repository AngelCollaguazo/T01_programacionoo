package tablero.ajedrez;

public class Rey extends Pieza{
	
	private String reyBlanco;
	private String reyNegro;
	
	
	public String getReyBlanco() {
		return reyBlanco;
	}
	public void setReyBlanco(String reyBlanco) {
		this.reyBlanco = reyBlanco;
	}

	@Override
	public String toString() {
		return "PiezaRey [reyBlanco=" + reyBlanco + ", reyNegro=" + reyNegro + "]";
	}
	public String getReyNegro() {
		return reyNegro;
	}
	public void setReyNegro(String reyNego) {
		this.reyNegro = reyNegro;
	}
	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}

}
