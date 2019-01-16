package academiaCursosOnline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public abstract class Alumno implements Identificable {
	
	private static int identificador;
	
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	
	private Collection<Curso> matricula=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellido, int edad) {
		super();
		this.id = identificador;
		identificador++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	public int calCularPrecioMatricula () {
		int preciomatricula=0;
		for(Curso curso : matricula) {
			preciomatricula += curso.getPrecio();
		}
		return preciomatricula;
	}
	
	public void solicitarMatricula() {
		Random random = new Random();
		for(int i =0; i<random.nextInt(3); i++) {
			Curso cursoAlumno= new Curso(random.nextInt(2));
			if (!matricula.contains(cursoAlumno)) {
				matricula.add(new Curso(random.nextInt(2)));
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	

	
	

}
