
public class Videojuego implements Entregable {

	protected String titulo;
	protected int horas_estimadas;
	protected Boolean entregado;
	protected String genero;
	protected String compañia;
	
	protected final int HORAS_ESTIMADAS_DEFAULT = 10;
	protected final boolean ENTREGADO_DEFAULT = false;
	protected final String TITULO_DEFAULT = "";
	protected final String GENERO_DEFAULT = "";
	protected final String COMPAÑIA_DEFAULT = "";
	
	public Videojuego () {
		this.titulo = TITULO_DEFAULT;
		this.horas_estimadas = HORAS_ESTIMADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = GENERO_DEFAULT;
		this.compañia = COMPAÑIA_DEFAULT;
	}
	
	public Videojuego (String titulo, int horas_estimadas) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = GENERO_DEFAULT;
		this.compañia = COMPAÑIA_DEFAULT;
	}
	
	public Videojuego (String titulo, int horas_estimadas,String genero, String compañia) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas_estimadas=" + horas_estimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
	
	public void entregar () {
		this.entregado = true; 
	}
	
	public void devolver () {
		this.entregado = false; 
	}
	
	public boolean isEntregado() {
		return this.entregado;
	}
	
	public void compareTo (Object a) {
			if(this.horas_estimadas > ((Videojuego) a).horas_estimadas) {
				System.out.println(this.titulo+ "tiene mas horas");
			}else {
				System.out.println(((Videojuego) a).titulo+ "tiene mas horas");
			}
	}
	
}
