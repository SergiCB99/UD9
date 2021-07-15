
public class Television extends Electrodomestico {

	private int resolucion; //Integer sino falla el metodo precioFinal()
	private Boolean tdt;
	
	private final int RESOLUCION_DEFAULT=20;
	private final Boolean TDT_DEFAULT=false;
	
	public Television () {
		this.resolucion = RESOLUCION_DEFAULT;
		this.tdt = TDT_DEFAULT;
	}
	
	public Television (Double precio_base,Double peso) {
		this.precio_base= precio_base;
		this.peso = peso; 
	}
	
	public Television (Double precio_base, String color, char consumo_energetico, Double peso, int resolucion, Boolean tdt) {
		super(precio_base,color,consumo_energetico,peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	public int getResolucion() {
		return resolucion;
	}

	public Boolean getTdt() {
		return tdt;
	}

	public void precioFinal() {
		super.precioFinal();//Llamo al metodo de Electrodomestico
		
		if(resolucion>40) {
			precio_base=precio_base+(precio_base*0.3);
		}
		
	}
	
}
