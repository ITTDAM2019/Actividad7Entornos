package modelo.beans;

public class Alumno extends Persona{
	
	private String curso;
	
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public Alumno() {
		super();
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Alumno [ nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + ", curso= " + curso + "]";
	}

	@Override
	public void trabajar() {
		System.out.println("El alumno " + nombre + " va a estudiar para el curso " + curso);
		
	}
	
	public String hacerExamen() {
		return ("El alumno " + nombre + " va a hacer su examen");
	}

	

}
