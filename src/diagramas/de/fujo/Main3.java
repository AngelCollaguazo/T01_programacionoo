package diagramas.de.fujo;

import java.util.Scanner;

public class Main3 {
//Imprimir la tabla del 7 multiplicado hasta el 12
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);//TECLADO
		int i=7;
		int j=0;
		int k;
		for (j=0;j<=12;j++) {
			k=i*j;
		
			System.out.println(i+ "*"+j+"="+k);
			}
	}

}
