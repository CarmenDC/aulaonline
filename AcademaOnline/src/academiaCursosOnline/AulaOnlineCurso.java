package academiaCursosOnline;

import java.util.ArrayList;
import java.util.Collection;

public class AulaOnlineCurso {
	
	Curso curso;
	
	Collection<Alumno> alumnosCurso = new ArrayList<>();
	
	Profesor profesor;
	
	Boolean aulaLlenaBoolean= false;
	
	
	

	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public Collection<Alumno> getAlumnosCurso() {
		return alumnosCurso;
	}


	public void setAlumnosCurso(Collection<Alumno> alumnosCurso) {
		this.alumnosCurso = alumnosCurso;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public Boolean getAulaLlenaBoolean() {
		return aulaLlenaBoolean;
	}


	public void setAulaLlenaBoolean(Boolean aulaLlenaBoolean) {
		this.aulaLlenaBoolean = aulaLlenaBoolean;
	}


	public AulaOnlineCurso() {
	}


	public AulaOnlineCurso(Curso curso, Profesor profesor) {
		super();
		this.curso = curso;
		this.profesor = profesor;
	}
	
	public void añadirAlumno (Alumno alumno) {
		if (alumnosCurso.size()<10) {
			alumnosCurso.add(alumno);
			alumno.getParticipa().add(curso);
		}
		else {
			setAulaLlenaBoolean(false);
			System.out.println("El curso " + curso.getNombreCurso() + " no admite más alumnos");
		}
	}

	
	public void imprimirAula() {
		System.out.println("\n" +"CURSO IMPARTIDO :" + curso.getNombreCurso());
		System.out.println("\n" + "Profesor imparte: " + profesor.toString());
		System.out.println("\n" +" ALUMNOS " +"\n");
		for (Alumno alumno : alumnosCurso) {
			System.out.println (alumno.toString());
		}
		System.out.println("");
		
 	}
	

}
