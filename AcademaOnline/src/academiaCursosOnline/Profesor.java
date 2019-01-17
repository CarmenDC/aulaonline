package academiaCursosOnline;

public class Profesor implements Identificable {
	
	int id;
	String nombre;
	String apellidos;


	@Override
	public int getId() {
		return id;
	}

	public Profesor() {
		
	}
	
	public Profesor (int id, String nombre, String apellidos) {
		super();
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}

	@Override
	public String toString() {
		return  nombre + " " + apellidos;
	}
	
}
