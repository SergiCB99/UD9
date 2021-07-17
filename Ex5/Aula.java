
public class Aula {
	
	protected int id;
	protected Estudiante[] estudiantes;
	protected String materia_aula;
	protected Profesor profesor;
	protected boolean dar_clase;
	protected int max_alumnos;
	
	
	public Aula (int id,Estudiante[] estudiantes,String materia_aula,Profesor profesor,int max_alumnos) {
		this.id=id;
		this.estudiantes=estudiantes;
		this.materia_aula=materia_aula;
		this.profesor=profesor;
		this.max_alumnos=max_alumnos;
		
		this.dar_clase=darClase(this);
	}
	
	public static boolean darClase(Aula aula) {
		boolean dar_clase;

		if(aula.estudiantes.length>(aula.max_alumnos/2)&&aula.profesor.disponibilidad&&aula.profesor.materia.equals(aula.materia_aula)) {
			dar_clase=true;
		}else {
			dar_clase=false;
		}
		
		return dar_clase;
	}
	
	
	
}
