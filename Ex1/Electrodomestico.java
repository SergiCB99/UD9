public class Electrodomestico {

	protected static Double precio_base;
	protected String color;
	protected static char consumo_energetico;
	protected static Double peso;
	
	protected final Double PRECIO_BASE_DEFAULT = 100.0;
	protected final static String COLOR_DEFAULT = "Blanco"; //Static para el metodo comprovarColor
	protected final static char CONSUMO_ENERGETICO_DEFAULT = 'F';//Static para el metodo comprovarConsumo
	protected final Double PESO_DEFAULT = 5.0;
	
	public Electrodomestico () {
		this.precio_base = PRECIO_BASE_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumo_energetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}
	
	public Electrodomestico (Double precio_base, Double peso) {
		this.precio_base = precio_base;
		this.color = COLOR_DEFAULT;
		this.consumo_energetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = peso;
	}
	
	public Electrodomestico (Double precio_base, String color, char consumo_energetico, Double peso) {
		this.precio_base = precio_base;
		this.color = comprobarColor(color);
		this.consumo_energetico = comprobarConsumo(consumo_energetico);
		this.peso = peso;
	}
	
	public Double getPrecio_base() {
		return precio_base;
	}
	
	public String getColor() {
		return color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public Double getPeso() {
		return peso;
	}

	private static String comprobarColor (String color) {
		
		if(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")) {
			return color;
		}else {
			return COLOR_DEFAULT;
		}
		
	}
	
	private static char comprobarConsumo (char consumo_energetico) {
		
		if(consumo_energetico=='A'||consumo_energetico=='B'||consumo_energetico=='C'||consumo_energetico=='D'||consumo_energetico=='E'||consumo_energetico=='F') {
			return consumo_energetico;
		}else {
			return CONSUMO_ENERGETICO_DEFAULT;
		}

	}

	public void precioFinal () { //No es static para poderlo llamar desde los otros objetos
		
		if(peso>=0&&this.peso<=19) {
			precio_base = precio_base+10;
		}else if(peso>=20&&peso<=49){
			precio_base = precio_base+50;
		}else if(peso>=50&&peso<=79){
			precio_base = precio_base+80;
		}else if(peso>=80){
			precio_base = precio_base+100;
		}
		
		if(consumo_energetico == 'A') {
			precio_base = precio_base+100;
		}else if(consumo_energetico == 'B'){
			precio_base = precio_base+80;
		}else if(consumo_energetico == 'C'){
			precio_base = precio_base+60;
		}else if(consumo_energetico == 'D'){
			precio_base = precio_base+50;
		}else if(consumo_energetico == 'E'){
			precio_base = precio_base+30;
		}else if(consumo_energetico == 'F'){
			precio_base = precio_base+10;
		}
		
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
	
	
	
}
