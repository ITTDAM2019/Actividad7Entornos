package modelo.beans;

public class Administrativo extends Persona {
	
	//Propiedad
	private String tareas;
	
	//Sobrecargamos el constructor de la clase Padre
	public Administrativo (String nif, String nombre, String direccion, String telefono, String tareas) {
		super (nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}
	
	//Métodos
	@Override
	public void trabajar() {	
		System.out.println("El administrativo " + this.getNombre() + " va a realizar estas tareas: " + this.tareas);
	}
	
	String gestionarMatricula() {
		String cadena;
		cadena = "El administrativo " + this.getNombre() + " va a gestionar una matrícula";
		return cadena;
	}

	//Click derecho, Source, Generate toString()...
	@Override
	public String toString() {
		return "Administrativo [Nif=" + getNif() + ", Nombre=" + getNombre()
				+ ", Direccion=" + getDireccion() + ", Telefono=" + getTelefono() + "] Tareas: " + tareas;
	}

	//Métodos getter y setter
	public String getTareas() {
		return tareas;
	}
	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
}