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
	private Collection<Curso> participa=new ArrayList<>();
	
	
	
	
	public Collection<Curso> getMatricula() {
		return matricula;
	}
	public Collection<Curso> getParticipa() {
		return participa;
	}
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
	
	
	public int calCularPrecioCursosParticipa () {
		int precioCursosParticipa=0;
		for(Curso curso : participa) {
			precioCursosParticipa += curso.getPrecio();
			if (curso.getSeCertifica()) {
				precioCursosParticipa += 200;
			}
		}
		return precioCursosParticipa;
	}
	
	public void solicitarMatricula() {
		Random random = new Random();
		int numCursosQuierePedir = random.nextInt(4);
		Boolean estaYa = false;
//		System.out.println(numCursosQuierePedir);
		for (int i=0; i<numCursosQuierePedir;i++) {
			Curso pideCurso = new Curso(random.nextInt(4));
			pideCurso.setSeCertifica(random.nextInt(2)==0?false:true);
//			System.out.println(pideCurso);
			if (matricula.isEmpty()) {
				matricula.add(pideCurso);
//				System.out.println(pideCurso);
			}
			else {
				for (Curso curso : matricula) {
					if (pideCurso.equals(curso)) {
						estaYa=true;
					}
				}
				if (!estaYa) {
					matricula.add(pideCurso);
//					System.out.println(pideCurso);
				}
			}
		}


	
	}
	
	public void renunciarCurso (Curso cursoRenuncia) {
		for (Curso curso : participa) {
			if (curso.equals(cursoRenuncia)) {
				participa.remove(curso);
			}			
		}
	}
	
	@Override
	public String toString() {
		return "Alumno id: " + id + ", nombre: " + nombre + ", apellido " + apellido + ", edad: " + edad  ;
	}
	
	
	

	
	

}
