
public class Estudiante extends Persona {

	protected int nota_media;
	protected boolean novillos;
	
	public Estudiante (String nombre,int edad,char sexo,int nota_media) {
		super(nombre,edad,sexo);
		this.edad=comprobarEdad(edad);
		this.nota_media=comprobarMedia(nota_media);
		this.novillos = asistencia(novillos);
	}
	
	public static boolean asistencia(boolean novillos) {
		int num =(int) (Math.random()*100+0);
		
		if(num<=50) {
			novillos = true;
		}else {
			novillos = false;
		}
		
		return novillos;
	}
	
	public static int comprobarEdad(int edad) {
		if(edad>0&&edad<18) {
			return edad;
		}else {
			return (int) (Math.random()*17+1);
		}
	}
	
	
	public static int comprobarMedia(int nota_media) {
		if(nota_media>=0&&nota_media<10) {
			return nota_media;
		}else {
			return (int) (Math.random()*10+1);
		}
	}
	
}
