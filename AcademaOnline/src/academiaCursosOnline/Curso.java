package academiaCursosOnline;

public class Curso implements Identificable {
	
	private static int identificadorCurso = 0;
	private static final int PRECIOCERTIFICACION =200; 
	private static String[] cursos= {"Java","Python","mySQL","JSON"};
	private static int[] duraciones = {200,150,240,100};
	private static int[] precios = {350,300,400,200};

	private int id;
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
		this.id = identificadorCurso;
		identificadorCurso++;
		nombreCurso=cursos[curso];
		duracion=duraciones[curso];
		precio=precios[curso];
		seCertifica=false;
	}
	
	public void setSeCertifica(Boolean seCertifica) {
		this.seCertifica = seCertifica;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Curso id=" + id + " nombreCurso=" + nombreCurso + ", duracion=" 
	+ duracion + ", coste=" + precio + ", se quiere certificar=" + seCertifica;
	}
	

}
