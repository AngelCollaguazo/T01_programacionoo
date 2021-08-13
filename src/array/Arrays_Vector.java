package array;

import java.util.Arrays;

public class Arrays_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]= new int[10];
		vector[0]=1;
		vector[1]=6;
		vector[2]=8;
		vector[3]=11;
		vector[4]=15;
		vector[5]=16;
		vector[6]=14;
		vector[7]=1;
		vector[8]=0;
		vector[9]=8;
		
		//syso Ctrl + espacio
		System.out.println("Ordenamiento JAVA");
		System.out.println("El vector antes de ordenar: " +Arrays.toString(vector));
		
		//Aqui ordeno mi vector
		Arrays.sort(vector);
		
		System.out.println("El vector despues de ordenar: " +Arrays.toString(vector));

	}

}
