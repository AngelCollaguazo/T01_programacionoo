package tablero.ajedrez;

import java.util.Arrays;

public class MainTablero {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Rey reyBlanco = new Rey();
	reyBlanco.setReyBlanco("Rey Blanco");
	Rey reyNegro = new Rey();
	reyNegro.setReyNegro("Rey Negro");
		
	Dama damaBlanco = new Dama();
	damaBlanco.setDamaBlanco("Dama Blanco");
	Dama damaNegro = new Dama();
	damaNegro.setDamaBlanco("Dama Negro");


	Torre torreBlanco1 = new Torre();
	torreBlanco1.setTorreBlanco("Torre Blanco 1");
	Torre torreBlanco2 = new Torre();
	torreBlanco2.setTorreBlanco("Torre Blanco 2");
	Torre torreNegro1 = new Torre();
	torreNegro1.setTorreNegro("Torre Negro 1");
	Torre torreNegro2 = new Torre();
	torreNegro2.setTorreNegro("Torre Negro 2");
	
	Alfil alfilBlanco1 = new Alfil();
	alfilBlanco1.setAlfilBlanco("Alfil Blanco 1");
	Alfil alfilBlanco2 = new Alfil();
	alfilBlanco2.setAlfilBlanco("Alfil Blanco 2");
	Alfil alfilNegro1 = new Alfil();
	alfilNegro1.setAlfilNegro("Alfil Negro 1");
	Alfil alfilNegro2 = new Alfil();
	alfilNegro2.setAlfilNegro("Alfil Negro 2");
	
	
	Caballo caballoBlanco1 = new Caballo();
	caballoBlanco1.setCaballoBlanco("Caballo Blanco 1");
	Caballo caballoBlanco2 = new Caballo();
	caballoBlanco2.setCaballoBlanco("Caballo Blanco 2");
	Caballo caballoNegro1 = new Caballo();
	caballoNegro1.setCaballoNegro("Caballo Negro 1");
	Caballo caballoNegro2 = new Caballo();
	caballoNegro2.setCaballoNegro("Caballo Negro 2");
	
	Peon peonBlanco1= new Peon();
	peonBlanco1.setPeonBlanco("Peon Blanco 1");
	Peon peonBlanco2= new Peon();
	peonBlanco2.setPeonBlanco("Peon Blanco 2");
	Peon peonBlanco3= new Peon();
	peonBlanco3.setPeonBlanco("Peon Blanco 3");
	Peon peonBlanco4= new Peon();
	peonBlanco4.setPeonBlanco("Peon Blanco 4");
	Peon peonBlanco5= new Peon();
	peonBlanco5.setPeonBlanco("Peon Blanco 5");
	Peon peonBlanco6= new Peon();
	peonBlanco6.setPeonBlanco("Peon Blanco 6");
	Peon peonBlanco7= new Peon();
	peonBlanco7.setPeonBlanco("Peon Blanco 7");
	Peon peonBlanco8= new Peon();
	peonBlanco8.setPeonBlanco("Peon Blanco 8");
	
	Peon peonNegro1= new Peon();
	peonNegro1.setPeonNegro("PEON NEGRA 1");
	Peon peonNegro2= new Peon();
	peonNegro2.setPeonNegro("PEON NEGRA 2");
	Peon peonNegro3= new Peon();
	peonNegro3.setPeonNegro("PEON NEGRA 3");
	Peon peonNegro4= new Peon();
	peonNegro4.setPeonNegro("PEON NEGRA 4");
	Peon peonNegro5= new Peon();
	peonNegro5.setPeonNegro("PEON NEGRA 5");
	Peon peonNegro6= new Peon();
	peonNegro6.setPeonNegro("PEON NEGRA 6");
	Peon peonNegro7= new Peon();
	peonNegro7.setPeonNegro("PEON NEGRA 7");
	Peon peonNegro8= new Peon();
	peonNegro8.setPeonNegro("PEON NEGRA 8");

	
	Pieza piezaTablero [][] = new   Pieza[8][8];
	
	piezaTablero[0][0] = torreNegro1;
	piezaTablero[0][1] = caballoNegro1;
	piezaTablero[0][2] = alfilNegro1;
	piezaTablero[0][3] = damaNegro;
	piezaTablero[0][4] = reyNegro;
	piezaTablero[0][5] = alfilNegro1;
	piezaTablero[0][6] = caballoNegro2;
	piezaTablero[0][7] = torreNegro2;
	piezaTablero[1][0] = peonNegro1;
	piezaTablero[1][1] = peonNegro2;
	piezaTablero[1][2] = peonNegro3;
	piezaTablero[1][3] = peonNegro4;
	piezaTablero[1][4] = peonNegro5;
	piezaTablero[1][5] = peonNegro6;
	piezaTablero[1][6] = peonNegro7;
	piezaTablero[1][7] = peonNegro8;
	
	piezaTablero[6][0] = torreBlanco1;
	piezaTablero[6][1] = caballoBlanco1;
	piezaTablero[6][2] = alfilBlanco1;
	piezaTablero[6][3] = damaBlanco;
	piezaTablero[6][4] = reyBlanco;
	piezaTablero[6][5] = alfilBlanco2;
	piezaTablero[6][6] = caballoBlanco2;
	piezaTablero[6][7] = torreBlanco2;
	piezaTablero[7][0] = peonBlanco1;
	piezaTablero[7][1] = peonBlanco2;
	piezaTablero[7][2] = peonBlanco3;
	piezaTablero[7][3] = peonBlanco4;
	piezaTablero[7][4] = peonBlanco5;
	piezaTablero[7][5] = peonBlanco6;
	piezaTablero[7][6] = peonBlanco7;
	piezaTablero[7][7] = peonBlanco8;
	

	}

}
