package academiaCursosOnline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class EjecutarAcademia {

	public static void main(String[] args) {
		
		Curso cursoJava = new Curso(0);
		Curso cursoPython = new Curso(1);
		Curso cursoSQL = new Curso(2);
		Curso cursoJASON = new Curso(3);
		
		System.out.println (cursoJava);
		System.out.println (cursoPython);
		System.out.println (cursoSQL);
		System.out.println (cursoJASON);
		
		Collection<Alumno> alumnosTotal=CrearAlumnosAcadema(40);
	
		
		for (Alumno alumno: alumnosTotal) {
			System.out.println(alumno.toString());
		}
		
		

	}

	private static Collection<Alumno> CrearAlumnosAcadema(int i) {
		Collection<Alumno> alumnosAcademia = new ArrayList<>();
		Random random = new Random();
		int alumnos =0;
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
