
public class Lavadora extends Electrodomestico {

	private int carga;//Integer sino falla el metodo precioFinal()
	
	private final int CARGA_DEFAULT=5;
	
	public Lavadora () {
		this.carga = CARGA_DEFAULT;
	}
	
	public Lavadora (Double precio_base,Double peso) {
		this.precio_base= precio_base;
		this.peso = peso;
	}
	
	public Lavadora (Double precio_base, String color, char consumo_energetico, Double peso, int carga) {
		super(precio_base,color,consumo_energetico,peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	public void precioFinal() {
		super.precioFinal();//Llamo al metodo de Electrodomestico
		if(carga>30) {
			precio_base=precio_base+50;
		}
		
		
		
	}

	
	
	
}
