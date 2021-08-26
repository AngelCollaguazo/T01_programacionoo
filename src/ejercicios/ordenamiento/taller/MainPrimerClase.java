package ejercicios.ordenamiento.taller;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer dia de clase
		// El profesor nos da nuestro número lista

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		danilo.setApellido("Alvarracin");
		danilo.setEdad(21);
		danilo.setNumeroLista(1);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setApellido("Aguirre");
		andres.setEdad(23);
		andres.setNumeroLista(2);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setApellido("Farinango");
		alex.setEdad(19);
		alex.setNumeroLista(22);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setApellido("Cruz");
		stefany.setEdad(23);
		stefany.setNumeroLista(10);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setApellido("Diaz");
		jhonny.setEdad(18);
		jhonny.setNumeroLista(21);



		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;

		// Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

		// Aqui ordeno la lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

	}

}





