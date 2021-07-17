
public class Ex5App {

	public static void mostrarNotasHombres(Aula aula) {
		if(aula.dar_clase) {
			System.out.println("Notas hombres");
			for(int i = 0;i<aula.estudiantes.length;i++) {
				if(aula.estudiantes[i].sexo=='H' && aula.estudiantes[i].nota_media >= 5 ) {
					System.out.println(aula.estudiantes[i].nombre+" tiene un "+aula.estudiantes[i].nota_media);
				}
			}
		}else {
			System.out.println("No se puede dar clase");
		}
	}
	
	public static void mostrarNotasMujeres(Aula aula) {
		if(aula.dar_clase) {
			System.out.println("Notas mujeres");
			for(int i = 0;i<aula.estudiantes.length;i++) {
				if(aula.estudiantes[i].sexo=='M' && aula.estudiantes[i].nota_media >= 5 ) {
					System.out.println(aula.estudiantes[i].nombre+" tiene un "+aula.estudiantes[i].nota_media);
				}
			}
		}else {
			System.out.println("No se puede dar clase");
		}
	}
	
	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Sergi",21,'H',7);
		Estudiante estudiante2 = new Estudiante("Rocio",16,'M',9);
		Estudiante estudiante3 = new Estudiante("Luis",15,'H',8);
		Estudiante estudiante4 = new Estudiante("Izan",16,'H',4);
		Estudiante estudiante5 = new Estudiante("Adrian",18,'H',7);
		Estudiante estudiante6 = new Estudiante("Katia",18,'M',4);
		
		Profesor profesor1 = new Profesor("Jose",35,'H',"matematicas");
		Profesor profesor2 = new Profesor("Araceli",35,'M',"filosofia");
		
		Estudiante [] estudiantes1 = new Estudiante[6];
		
		estudiantes1[0]=estudiante1;
		estudiantes1[1]=estudiante2;
		estudiantes1[2]=estudiante3;
		estudiantes1[3]=estudiante4;
		estudiantes1[4]=estudiante5;
		estudiantes1[5]=estudiante6;
		
		Aula aula1 = new Aula(1,estudiantes1,"matematicas",profesor1,10);
		Aula aula2 = new Aula(2,estudiantes1,"matematicas",profesor2,10);
		
		System.out.println("Aula 1");
			mostrarNotasHombres(aula1);
			mostrarNotasMujeres(aula1);
			
		System.out.println("Aula 2");
			mostrarNotasHombres(aula2);
			mostrarNotasMujeres(aula2);
			
		
	}
	
}
