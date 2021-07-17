import java.util.Scanner;

public class Cine {

	protected Pelicula pelicula;
	protected Double precio_entrada;
	protected String[][] sala;
	
	public Cine (Pelicula pelicula,Double precio_entrada) {
		this.sala=new String[8][9];
		this.pelicula = pelicula;
		this.precio_entrada=precio_entrada;
	}
	
	public String[][] generarSala (String [][] sala){
		for(int i=0;i<sala.length;i++) {
		for(int x=0;x<sala[i].length;x++) {
			sala[i][x]="X";
		}}
		return sala;
	}
	
	public boolean estaLibre (int f, int c) {
		boolean estaLibre;
		if(this.sala[f][c]=="X") {
			estaLibre = true;
		}else {
			estaLibre = false;
		}
		
		return estaLibre;
		
	}
	
	public String[][] sentarManual (Espectador e,Pelicula p){
		Scanner teclado = new Scanner(System.in);
		int f;
		int c;
		
		if(e.tieneDinero(this)==false&&e.tieneEdad(p)==false) {
			System.out.println(e.nombre+" no cumples los requisitos");
		}else {
		
			System.out.println("Fila");
			f=teclado.nextInt();
			
			System.out.println("Columna");
			c=teclado.nextInt();
		
			if(estaLibre(f,c)) {
				this.sala[f][c] = e.nombre;
			}else {
				System.out.println("Asiento ocupado busca otro");
				sentarManual(e,p);
			}
		}
			
			
		return sala;
	}
	
	
	
	
	
}
