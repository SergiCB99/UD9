
public class Ex6App {

	public static void main(String[] args) {
		
		Espectador espectador1=new Espectador ("Sergi",21,15);
		Espectador espectador2=new Espectador ("Rocio",16,9);
		Espectador espectador3=new Espectador ("Luis",13,4);
		Espectador espectador4=new Espectador ("Anna",22,12);
		Espectador espectador5=new Espectador ("Adrian",19,17);
		
		Pelicula pelicula1 = new Pelicula ("Jackass",120,18,"Director");
		
		Cine cine1 = new Cine (pelicula1,10.5);
		
		cine1.generarSala(cine1.sala);
		
		/* Prueba para sentar aleatoriamente
		 * espectador1.sentarAleatorio(cine1.sala, cine1, pelicula1);
		espectador2.sentarAleatorio(cine1.sala, cine1, pelicula1);
		espectador3.sentarAleatorio(cine1.sala, cine1, pelicula1);
		espectador4.sentarAleatorio(cine1.sala, cine1, pelicula1);
		espectador5.sentarAleatorio(cine1.sala, cine1, pelicula1);
		*/
		
		cine1.sentarManual(espectador1, pelicula1);
		cine1.sentarManual(espectador3, pelicula1);
		cine1.sentarManual(espectador5, pelicula1);
		
		
		for(int i=0;i<cine1.sala.length;i++) {
			System.out.println();
		for(int x=0;x<cine1.sala[i].length;x++) {
			System.out.print(cine1.sala[i][x]);
		}}
		
	}
	
	
}
