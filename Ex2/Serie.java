
public class Serie implements Entregable {

	protected String titulo;
	protected int numero_temporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	protected final int NUMERO_TEMPORADAS_DEFAULT = 3;
	protected final boolean ENTREGADO_DEFAULT = false;
	protected final String TITULO_DEFAULT = "";
	protected final String GENERO_DEFAULT = "";
	protected final String CREADOR_DEFAULT = "";
	
	public Serie () {
		this.titulo = TITULO_DEFAULT;
		this.numero_temporadas = NUMERO_TEMPORADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = GENERO_DEFAULT;
		this.creador = CREADOR_DEFAULT;
	}
	
	public Serie (String titulo, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = NUMERO_TEMPORADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = GENERO_DEFAULT;
		this.creador = creador;
	}
	
	public Serie (String titulo, int numero_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = numero_temporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero_temporadas() {
		return numero_temporadas;
	}

	public void setNumero_temporadas(int numero_temporadas) {
		this.numero_temporadas = numero_temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numero_temporadas=" + numero_temporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
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
	

	public Object compareTo(Object a) {
			if(this.numero_temporadas > ((Serie) a).numero_temporadas) {
				return this;
			}else {
				return a;
			}
	}
	
	
}
