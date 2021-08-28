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
	damaNegro.setDamaNegro("Dama Negro");


	Torre torreb1 = new Torre();
	torreb1.setTorreBlanco("TORRE BLANCA 1");
	Torre torreb2 = new Torre();
	torreb2.setTorreBlanco("TORRE BLANCA 2");
	Torre torren1 = new Torre();
	torren1.setTorreNegro("TORRE NEGRA 1");
	Torre torren2 = new Torre();
	torren2.setTorreNegro("TORRE NEGRA 2");
	
	Alfil alfilb1 = new Alfil();
	alfilb1.setAlfilBlanca("ALFIL BLANCA 1");
	Alfil alfilb2 = new Alfil();
	alfilb2.setAlfilBlanca("ALFIL BLANCA 2");
	Alfil alfiln1 = new Alfil();
	alfiln1.setAlfilNegro("ALFIL NEGRA 1");
	Alfil alfiln2 = new Alfil();
	alfiln2.setAlfilNegro("ALFIL NEGRA 2");
	
	
	PiezaCaballo caballob1 = new PiezaCaballo();
	caballob1.setCaballoBlanca("CABALLO BALNCA 1");
	PiezaCaballo caballob2 = new PiezaCaballo();
	caballob2.setCaballoBlanca("CABALLO BALNCA 2");
	PiezaCaballo caballon1 = new PiezaCaballo();
	caballon1.setCaballoNegra("CABALLO NEGRA 1");
	PiezaCaballo caballon2 = new PiezaCaballo();
	caballon2.setCaballoNegra("CABALLO NEGRA 2");
	
	PiezaPeon peonb1= new PiezaPeon();
	peonb1.setPeonBlanca("PEON BLANCA 1");
	PiezaPeon peonb2= new PiezaPeon();
	peonb2.setPeonBlanca("PEON BLANCA 2");
	PiezaPeon peonb3= new PiezaPeon();
	peonb3.setPeonBlanca("PEON BLANCA 3");
	PiezaPeon peonb4= new PiezaPeon();
	peonb4.setPeonBlanca("PEON BLANCA 4");
	PiezaPeon peonb5= new PiezaPeon();
	peonb5.setPeonBlanca("PEON BLANCA 5");
	PiezaPeon peonb6= new PiezaPeon();
	peonb6.setPeonBlanca("PEON BLANCA 6");
	PiezaPeon peonb7= new PiezaPeon();
	peonb7.setPeonBlanca("PEON BLANCA 7");
	PiezaPeon peonb8= new PiezaPeon();
	peonb8.setPeonBlanca("PEON BLANCA 8");
	
	PiezaPeon peonn1= new PiezaPeon();
	peonn1.setPeonNegra("PEON NEGRA 1");
	PiezaPeon peonn2= new PiezaPeon();
	peonn2.setPeonNegra("PEON NEGRA 2");
	PiezaPeon peonn3= new PiezaPeon();
	peonn3.setPeonNegra("PEON NEGRA 3");
	PiezaPeon peonn4= new PiezaPeon();
	peonn4.setPeonNegra("PEON NEGRA 4");
	PiezaPeon peonn5= new PiezaPeon();
	peonn5.setPeonNegra("PEON NEGRA 5");
	PiezaPeon peonn6= new PiezaPeon();
	peonn6.setPeonNegra("PEON NEGRA 6");
	PiezaPeon peonn7= new PiezaPeon();
	peonn7.setPeonNegra("PEON NEGRA 7");
	PiezaPeon peonn8= new PiezaPeon();
	peonn8.setPeonNegra("PEON NEGRA 8");

	
	Piezas piezaTablero [][] = new   Piezas[8][8];
	
	piezaTablero[0][0] = torreb1;
	piezaTablero[0][1] = caballob1;
	piezaTablero[0][2] = alfilb1;
	piezaTablero[0][3] = reinab;
	piezaTablero[0][4] = reyb;
	piezaTablero[0][5] = alfilb2;
	piezaTablero[0][6] = caballob2;
	piezaTablero[0][7] = torreb2;
	piezaTablero[1][0] = peonb1;
	piezaTablero[1][1] = peonb2;
	piezaTablero[1][2] = peonb3;
	piezaTablero[1][3] = peonb4;
	piezaTablero[1][4] = peonb5;
	piezaTablero[1][5] = peonb6;
	piezaTablero[1][6] = peonb7;
	piezaTablero[1][7] = peonb8;
	
	piezaTablero[6][0] = torren1;
	piezaTablero[6][1] = caballon1;
	piezaTablero[6][2] = alfiln1;
	piezaTablero[6][3] = reinan;
	piezaTablero[6][4] = reyn;
	piezaTablero[6][5] = alfiln1;
	piezaTablero[6][6] = caballon2;
	piezaTablero[6][7] = torren2;
	piezaTablero[7][0] = peonn1;
	piezaTablero[7][1] = peonn2;
	piezaTablero[7][2] = peonn3;
	piezaTablero[7][3] = peonn4;
	piezaTablero[7][4] = peonn5;
	piezaTablero[7][5] = peonn6;
	piezaTablero[7][6] = peonn7;
	piezaTablero[7][7] = peonn8;

}
