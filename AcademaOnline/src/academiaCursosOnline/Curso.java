package academiaCursosOnline;

public class Curso {
	
	private static final int PRECIOCERTIFICACION =200; 
	private static String[] cursos= {"Java","Python","mySQL","JSON"};
	private static int[] duraciones = {200,150,240,100};
	private static int[] precios = {350,300,400,200};

	private int duracion;
	private int precio;
	
	private Boolean seCertifica;
	private String nombreCurso;
	
	
	

	public int getDuracion() {
		return duracion;
	}

	public int getPrecio() {
		return precio;
	}

	public Boolean getSeCertifica() {
		return seCertifica;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public Curso() {
	}

	public Curso(int curso) {
		super();

		nombreCurso=cursos[curso];
		duracion=duraciones[curso];
		precio=precios[curso];
		seCertifica=false;
	}
	
	public void setSeCertifica(Boolean seCertifica) {
		this.seCertifica = seCertifica;
	}


	@Override
	public String toString() { 
		return "Curso " + nombreCurso + ", duracion=" 
	+ duracion + ", coste=" + precio + ", se quiere certificar=" + seCertifica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreCurso == null) ? 0 : nombreCurso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (nombreCurso == null) {
			if (other.nombreCurso != null)
				return false;
		} else if (!nombreCurso.equals(other.nombreCurso))
			return false;
		return true;
	}
	
	
	

}
