package academiaCursosOnline;

public class Universitario extends Alumno{
	
	private static String[] universidadeStrings = {"URJC", "UPM", "COMPLUTENSE"};
	
	private String universidad;
	
	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public Universitario(String nombre, String apellidos, int edad, int numuniversidad) {
		super(nombre, apellidos, edad);
		universidad = universidadeStrings[numuniversidad];
	}

	@Override
	public String toString() {
		return super.toString() + " Universidad: " + universidad;
	}
	
	

}
