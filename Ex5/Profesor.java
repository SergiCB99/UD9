
public class Profesor extends Persona {

	protected String materia;
	protected final static String MATERIA_DEFAULT = "MATEMATICAS";
	protected boolean disponibilidad;
	
	public Profesor(String nombre,int edad,char sexo,String materia) {
		super(nombre,edad,sexo);
		this.materia = comprobarMateria(materia);
		this.disponibilidad = asistencia(disponibilidad);
	}
	
	public static boolean asistencia(boolean disponibilidad) {
		int num =(int) (Math.random()*100+0);
		
		if(num<=20) {
			disponibilidad = true;
		}else {
			disponibilidad = false;
		}
		
		return disponibilidad;
	}
	
	public static String comprobarMateria (String materia) {
		if(materia.equalsIgnoreCase("matematicas")||materia.equalsIgnoreCase("filosofia")||materia.equalsIgnoreCase("fisica")) {
			return materia;
		}else {
			return MATERIA_DEFAULT;
		}
	}
	
}
