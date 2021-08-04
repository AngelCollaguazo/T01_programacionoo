package excel.vectores;

public class ExcelVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Declarar un vector X(8)
		System.out.println("Ejercicio N°1");
		int X[] = new int[8];
		System.out.println("");
		
		
		//2. Declarar un vector Y(3) y asignar a la posición 2 el valor de A
		System.out.println("Ejercicio N°2");
		char Y[] = new char[3];
		Y[2] = 'A';
		System.out.println(Y[2]);
		System.out.println("");
		
		
		//3. Declarar un vector A(5) asignar a la posicioón 0 el valor de 25, 
		//posición 3 el valor de 49 y a la posición 2 el valor de la posición 0
		System.out.println("Ejercicio N°3");
		int A[] = new int[5];
		A[0] = 25;
		A[3] = 49;
		A[2] = A[0];
		System.out.println(A[0]);
		System.out.println(A[3]);
		System.out.println(A[2]);
		System.out.println("");
		
		
		//4.Declarar un vector B(10), a la posición B[0] asignele el valor del vector 
		//A[3] del ejercicio  anterior
		System.out.println("Ejercicio N°4");
		int B[] = new int[10];
		B[0] = A[3];
		System.out.println(B[0]);
		System.out.println("");
		
		
		//5.Declarar un vector Z(12) y asignar a todas sus posiciones valores que 
		//inician desde 1 y son secuenciales
		System.out.println("Ejercicio N°5");
		int Z[] = new int[12];
		Z[0] = 1;
		Z[1] = 2;
		Z[2] = 3;
		Z[3] = 4;
		Z[4] = 5;
		Z[5] = 6;
		Z[6] = 7;
		Z[7] = 8;
		Z[8] = 9;
		Z[9] = 10;
		Z[10] = 11;
		Z[11] = 12;
		for(int i=0; i<12; i++) {
		System.out.println(" El valor de la posición:"+i+" es "+Z[i] );
		}
		System.out.println("");
		
		
		//6.Declarar un vector Y(10) y asignar a todas sus posiciones valores 
		//impares que inician desde 1 y  son secuenciales
		System.out.println("Ejercicio N°6");
		int Y1[] = new int[10];
		Y1[0] = 1;
		Y1[1] = 3;
		Y1[2] = 5;
		Y1[3] = 7;
		Y1[4] = 9;
		Y1[5] = 11;
		Y1[6] = 13;
		Y1[7] = 15;
		Y1[8] = 17;
		Y1[9] = 19;
		System.out.println(Y1[0]);
		System.out.println(Y1[1]);
		System.out.println(Y1[2]);
		System.out.println(Y1[3]);
		System.out.println(Y1[4]);
		System.out.println(Y1[5]);
		System.out.println(Y1[6]);
		System.out.println(Y1[7]);
		System.out.println(Y1[8]);
		System.out.println(Y1[9]);
		System.out.println("");
		
		
		//7.Declarar un vector H(10) y asignar solo a las posiciones impares 
		//letras que inician desde la A secuenciales 
	    System.out.println("Ejercicio N°7");
		char H[] = new char[10];
		H[1] = 'A';
		H[3] = 'B';
		H[5] = 'C';
		H[7] = 'D';
		H[9] = 'E';
		System.out.println(H[1]);
		System.out.println(H[3]);
		System.out.println(H[5]);
		System.out.println(H[7]);
		System.out.println(H[9]);
		System.out.println("");
		
		
		//8.Declarar un vector F(10) y en base al ejercicio anterior asignar 
		//los valores de la siguientemanera: 
		//F[0]=H[3]
		//F[3]=H[2]
		//F[4]=H[6]
		//F[7]=H[0]
		//F[8]=H[1]
		//F[9]=H[9]
		System.out.println("Ejercicio N°8");
		char F[] = new char[10];
		F[0] = H[3];
		F[3] = H[2];
		F[4] = H[6];
		F[7] = H[0];
		F[8] = H[1];
		F[9] = H[9];
		System.out.println(F[0]);
		System.out.println(F[3]);
		System.out.println(F[4]);
		System.out.println(F[7]);
		System.out.println(F[8]);
		System.out.println(F[9]);
		System.out.println("");
		
		
		//9.Declarar un vector L(15) y asignar valores en base a los siguiente: 
		//L[0]=(Promedio de 3,5,7,9)
		//L[4]=(La suma de 5,7,8 y 15)
		//L[7]=(la multiplicacion de 6, 7 y 3)
		//L[10]=(La division de 10/2)
		System.out.println("Ejercicio N°9");
		int L[] = new int[15];
		L[0] = (3+5+7+9)/4;
		L[4] = (5+7+8+15);
		L[7] = (6*7*3);
		L[10] = (10/2);
		System.out.println(L[0]);
		System.out.println(L[4]);
		System.out.println(L[7]);
		System.out.println(L[10]);
		System.out.println("");
		
		
		//10.Declarar un vector N(12) y realizar las siguientes asignaciones 
		//N[0]=(Promedio de3,10 y 9)
		//N[4]=(La suma de 7,8 y 10)
		//N[12]=(la multiplicacion de 5, 7 y 3)
		//N[20]=(La suma de 7,-3 y 8) 
		//y en la ultima posición el valor de 20/4
		System.out.println("Ejercicio N°10");
		 int N[] = new int[12];
		
		N[0] = (3+10+9)/3;
		N[4] = (7+8+10);
		// N[12] = (5*7*3);  Esta linea va a dar error
		//N[20] = (7+(-3)+8); Esta linea va a dar error
		N[11] = (20/4);
		System.out.println(N[0]);
		System.out.println(N[4]);
		System.out.println(N[11]);
	}

}
