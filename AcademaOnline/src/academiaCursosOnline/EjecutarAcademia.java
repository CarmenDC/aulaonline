package academiaCursosOnline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class EjecutarAcademia {

	public static void main(String[] args) {
		
		Curso cursoJava = new Curso(0);
		Curso cursoPython = new Curso(1);
		Curso cursoSQL = new Curso(2);
		Curso cursoJASON = new Curso(3);
		
		Profesor profesor1 = new Profesor(1, "Andrés","Martín");
		Profesor profesor2 = new Profesor(2, "Javier","López");
		Profesor profesor3 = new Profesor(3, "Roberto","Ruiz");
		
		AulaOnlineCurso aulaJava = new AulaOnlineCurso(cursoJava, profesor1);
		AulaOnlineCurso aulaPython = new AulaOnlineCurso(cursoPython, profesor2);
		AulaOnlineCurso aulaSQL = new AulaOnlineCurso(cursoSQL, profesor2);
		AulaOnlineCurso aulaJASON = new AulaOnlineCurso(cursoJASON, profesor3);

		
		Collection<Alumno> alumnosTotal=CrearAlumnosAcadema(30);
		ArrayList<Alumno> alumnoFinal = new ArrayList<>();
		
		
		for (Alumno alumno : alumnosTotal) {
			System.out.println(alumno.toString());
			alumno.solicitarMatricula();
		}
		
		llenarAulas(alumnosTotal, aulaJava);
		llenarAulas(alumnosTotal, aulaJASON);
		llenarAulas(alumnosTotal, aulaSQL);
		llenarAulas(alumnosTotal, aulaPython);
		
		alumnoFinal.addAll(aulaJava.getAlumnosCurso());
		alumnoFinal.addAll(aulaPython.getAlumnosCurso());
		alumnoFinal.addAll(aulaJASON.getAlumnosCurso());
		alumnoFinal.addAll(aulaSQL.getAlumnosCurso());
		
		aulaJava.imprimirAula();
		aulaJASON.imprimirAula();
		aulaPython.imprimirAula();
		aulaSQL.imprimirAula();
		
		System.out.println("\n" + "El dinero recaudado por el total de Cursos es: " + calcularIngreso(alumnosTotal));

		Collections.sort(alumnoFinal,new OrdenarAlumnosPorEdad());
		for (Alumno alumno : alumnoFinal) {
			System.out.println(alumno.toString());
			
		}
		
	}



	private static int calcularIngreso(Collection<Alumno> alumnosCurso) {
		int suma = 0;
		for (Alumno alumno : alumnosCurso) {
			suma += alumno.calCularPrecioCursosParticipa();
		}
		return suma;
	}



	private static void llenarAulas(Collection<Alumno> alumnosTotal, AulaOnlineCurso aulaJava) {
		for (Alumno alumno : alumnosTotal) {
			if (aulaJava.getAulaLlenaBoolean()) {
				break; 
			}
			else {
				for (Curso curso : alumno.getMatricula()) {
					if (curso.getNombreCurso()==aulaJava.curso.getNombreCurso()) {
						aulaJava.añadirAlumno(alumno);
					}	
				}
			}
				
		}
	}

	private static Collection<Alumno> CrearAlumnosAcadema(int i) {
		Collection<Alumno> alumnosAcademia = new ArrayList<>();
		Random random = new Random();
		int alumnos =1;
		while (alumnos <=i) {
			if (random.nextInt(2)==0){ // profesional
				alumnosAcademia.add(new Profesional("Profesional"+alumnos,"Perez",18+random.nextInt(50),
						"empresa"+alumnos, random.nextInt(4)));
			}
			else {
				alumnosAcademia.add(new Universitario("Universitario"+alumnos,"Lopez", 18+random.nextInt(20), random.nextInt(3)));

			}
			alumnos++;
		}
		return alumnosAcademia;
		
	}

}
