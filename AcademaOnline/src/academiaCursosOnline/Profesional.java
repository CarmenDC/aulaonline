package academiaCursosOnline;

public class Profesional extends Alumno {
	
	private String[] puestos = {"Desarrollador","Analista","Jefe de Proyecto","Gerente"};
	
	private String empresa;
	private String nivelPuesto;
	
	
	public String getEmpresa() {
		return empresa;
	}

	public String getNivelPuesto() {
		return nivelPuesto;
	}



	public Profesional (String nombre, String apellidos, int edad, String empresa,int puesto) {
		super(nombre, apellidos, edad);
		this.empresa = empresa;
		nivelPuesto = puestos[puesto];
	}

	@Override
	public String toString() {
		return "Profesional, empresa=" + empresa + ", nivelPuesto="
				+ nivelPuesto + " " + super.toString();
	}
	
	
	
	
	

}
