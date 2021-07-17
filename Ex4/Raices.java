
public class Raices {

	protected int a;
	protected int b;
	protected int c;
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Double getDiscriminante () {
		Double discriminante = 0.0;
		
		discriminante = Math.pow(b, 2)-(4*a*c);
		
		return discriminante;
	}
	
	public boolean tieneRaices() {
		boolean tiene_raices;
		if(this.getDiscriminante()>0) {
			tiene_raices = true;
		}else {
			tiene_raices = false;
		}
			
		return tiene_raices;
		
	}
	
	public boolean tieneRaiz() {
		boolean tiene_raiz;
		if(this.getDiscriminante()==0) {
			tiene_raiz = true;
		}else {
			tiene_raiz = false;
		}
			
		return tiene_raiz;
		
	}
	
	public void obtenerRaices() {
		Double x1;
		Double x2;
		Double discriminante;
		
		discriminante = this.getDiscriminante();
		
		x1=((b*(-1)) + Math.sqrt(discriminante))/(2*a);
		x2=((b*(-1)) - Math.sqrt(discriminante))/(2*a);
		
		System.out.println("Resultado x1 "+x1);
		System.out.println("Resultado x2 "+x2);
		
	}
	
	public void obtenerRaiz() {
		Double x1;
		Double discriminante;
		
		discriminante = this.getDiscriminante();
		
		
		x1=((-b) + discriminante)/(2*a);
		
		System.out.println("Resultado x1 "+x1);
		
	}
	
	public void calcular() {
		if(this.tieneRaices()) {
			this.obtenerRaices();
		}else if(this.tieneRaiz()) {
			this.obtenerRaiz();
		}else {
			System.out.println("No tiene resultado");
		}
	}
	
}
