package ejercicios.ordenamiento.deber;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado alex = new Empleado();
		alex.setNombre("Alex");
		alex.setApellido("Martinez");
		alex.setEdad(27);
		alex.setSalario(1200);

		Empleado marco = new Empleado();
		marco.setNombre("Marco");
		marco.setApellido("Iza");
		marco.setEdad(23);
		marco.setSalario(1150);

		Empleado javier = new Empleado();
		javier.setNombre("Javier");
		javier.setApellido("Rodriguez");
		javier.setEdad(33);
		javier.setSalario(750);

		Empleado anita = new Empleado();
		anita.setNombre("Anita");
		anita.setApellido("Lopez");
		anita.setEdad(25);
		anita.setSalario(900);

		Empleado carmen = new Empleado();
		carmen.setNombre("Carmen");
		carmen.setApellido("Zambrano");
		carmen.setEdad(22);
		carmen.setSalario(1000);

		Empleado carlos = new Empleado();
		carlos.setNombre("Carlos");
		carlos.setApellido("Obando");
		carlos.setEdad(30);
		carlos.setSalario(800);

		Empleado maria = new Empleado();
		maria.setNombre("Maria");
		maria.setApellido("Pilatuña");
		maria.setEdad(35);
		maria.setSalario(950);

		Empleado tomas = new Empleado();
		tomas.setNombre("Tomas");
		tomas.setApellido("Muñoz");
		tomas.setEdad(45);
		tomas.setSalario(1100);

		Empleado patricia = new Empleado();
		patricia.setNombre("Patricia");
		patricia.setApellido("Aguirre");
		patricia.setEdad(40);
		patricia.setSalario(850);

		Empleado karina = new Empleado();
		karina.setNombre("Karina");
		karina.setApellido("Farinango");
		karina.setEdad(236);
		karina.setSalario(1050);

		Empleado listaEmpleados[] = new Empleado[10];
		listaEmpleados[0] = alex;
		listaEmpleados[1] = marco;
		listaEmpleados[2] = javier;
		listaEmpleados[3] = anita;
		listaEmpleados[4] = carmen;
		listaEmpleados[5] = carlos;
		listaEmpleados[6] = maria;
		listaEmpleados[7] = tomas;
		listaEmpleados[8] = patricia;
		listaEmpleados[9] = karina;

		System.out.println("****************************");
		System.out.println("* Nomina de la Empresa GPF *");
		System.out.println("****************************");
		// Vector antes de ordenar
		System.out.println("");
		System.out.println("Empleados antes de ordenar por su salario");
		System.out.println(Arrays.toString(listaEmpleados));

		// Aqui ordeno la nomina
		System.out.println("");
		Arrays.sort(listaEmpleados);
		System.out.println("Empleados despues de ordenar por su salario");
		System.out.println(Arrays.toString(listaEmpleados));

	}

}




