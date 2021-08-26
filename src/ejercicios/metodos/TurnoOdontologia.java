package tareaa.pareja;

public class TurnoOdontologia {

	public String turno;

	public TurnoOdontologia() {

	}

	public void Imprimir(String datosAImprimir, String nombre, String fecha, String cedula, String hora,
			String numTurno, String Medico) {
		System.out.println("Clinica Confort Dental");
		System.out.println("orden de admision ");
		System.out.println(datosAImprimir + "nombre: " + nombre + "  su fecha de turno es:  " + fecha
				+ "   con cedula:  " + cedula + "   la hora de su turno es:  " + hora + "   el numero de turno es:  "
				+ numTurno + "    el medico que le va atender es:  " + Medico);
		System.out.println("ministerio de salud");
		System.out.println("gracias por visitarnos ");

	}

}