
public class Espectador {

	protected String nombre;
	protected int edad;
	protected double dinero;
	
	public Espectador(String nombre,int edad,double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	public boolean tieneEdad (Pelicula a) {
		boolean tiene_edad;
		if(this.edad<a.edad_minima) {
			tiene_edad = false;
		}else {
			tiene_edad = true;
		}
		return tiene_edad;
	}
	
	public boolean tieneDinero (Cine a) {
		boolean tiene_dinero;
		if(this.dinero<a.precio_entrada) {
			tiene_dinero = false;
		}else {
			tiene_dinero = true;
		}
		return tiene_dinero;
	}
	
	public String[][] sentarAleatorio (String[][] sala,Cine a,Pelicula p){
		int f = (int) (Math.random()*7+1);
		int c = (int) (Math.random()*8+1);
		
		if(this.tieneDinero(a)&&this.tieneEdad(p)) {
			if(sala[f][c]=="X") {
				this.sentarAleatorio(sala,a,p);
			}else {
				sala[f][c]=this.nombre;
			}
		}
		
		return sala;
	}
	
}
