
public class Ex2App {

	public static void main(String[] args) {
		
		Serie array1[] = new Serie [5];
		Videojuego array2[] = new Videojuego [5];
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Padre de familia","Seth MacFarlane");
		Serie serie3 = new Serie("Los Simpsons","Matt Groening");
		Serie serie4 = new Serie("Futurama","Matt Groening");
		Serie serie5 = new Serie("South Park","Matt Stone");
		
		array1[0] = serie1;
		array1[1] = serie2;
		array1[2] = serie3;
		array1[3] = serie4;
		array1[4] = serie5;
		
		Videojuego videojuego1 = new Videojuego();
		Videojuego videojuego2 = new Videojuego("GTA",100);
		Videojuego videojuego3 = new Videojuego("FIFA",25);
		Videojuego videojuego4 = new Videojuego("NBA",25);
		Videojuego videojuego5 = new Videojuego("COD",75);
		
		array2[0] = videojuego1;
		array2[1] = videojuego2;
		array2[2] = videojuego3;
		array2[3] = videojuego4;
		array2[4] = videojuego5;
		
		videojuego2.entregar();
		videojuego4.entregar();
		
		serie1.entregar();
		serie5.entregar();
		
		int series_entregadas = 0;
		int videojuegos_entregados = 0;
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i].isEntregado()) {
				series_entregadas++;
			}
		}
		
		for(int i=0;i<array2.length;i++) {
			if(array2[i].isEntregado()) {
				videojuegos_entregados++;
			}
		}
		
		System.out.println("Hay "+series_entregadas+" series entregadas");
		System.out.println("Hay "+videojuegos_entregados+" videojuegos entregados");
		
		int serie_larga = 0;
		int cantidad_serie = 0;
		int videojuego_largo = 0;
		int cantidad_videojuego = 0;
		Serie s = new Serie();
		Videojuego v = new Videojuego();
		
		for(int i=0;i<array1.length;i++) {
			s=(Serie) array1[i].compareTo(s);
		}
		
		for(int i=0;i<array2.length;i++) {
			v=(Videojuego) array2[i].compareTo(v);
		}
		
		System.out.println("Serie con mas temporadas "+s.toString());
		System.out.println("Videojuego con mas horas "+v.toString());
		
	}
	
}
