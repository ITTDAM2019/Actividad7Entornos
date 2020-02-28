package modelo.beans;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos un objeto de cada tipo
		Persona p1 = new Profesor("35826481F", "Manuel Toscano", "C/ Las verjas Nº50", "651238459", "Quimica");
		Persona a1 = new Alumno("57896321Q", "Rebeca Manson", "C/ Condena Nº66", "689541237", "2º Bachillerato");
		Persona ad1 = new Administrativo("21596874R", "Teresa Pueblo", 
				"C/ Los Menesteres Nº90", "698745136", "Gestionar becas y matriculas");
		
		//Mostramos datos del profesor
		System.out.println(p1.toString());
		p1.trabajar();
		
		//Mostramos datos del alumno
		System.out.println(a1.toString());
		a1.trabajar();
		
		//Mostramos datos del administrativo
		System.out.println(ad1.toString());
		ad1.trabajar();
		
		//Alumno llama a profesor
		System.out.println(a1.llamar(p1) + "\n");
		
		//Ejecutamos el metodo propio de cada subclase,
		//para ello convertimos los objetos de clase Persona en objetos de cada subclase 
		System.out.println(((Profesor)p1).ponerNotas());
		System.out.println(((Alumno)a1).hacerExamen());
		System.out.println(((Administrativo)ad1).gestionarMatricula());

	}

}