package ejercicio1;
import java.util.Objects;

public class Persona implements Comparable<Persona> {
	//ATTRIBUTES
	private String nombre;
	private String apellido;
	private int dni;
	
	//CONSTRUCTORS
	public Persona() {
		this.nombre = " ";
		this.apellido = " ";
		this.dni =1;
	}
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public Persona(String Nombre, String Apellido,int Dni) {
		
		this.apellido = Apellido;
		this.nombre = Nombre;
		this.dni =Dni;	
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}


	//METHODS
	
	@Override
	public String toString() {
		return nombre +" - " + apellido +" - "+  dni;
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, nombre);
	}

	
	public int compareTo(Persona o) {
		
		int compare = o.apellido.compareTo(this.apellido);
		
		if(compare>0)
			return -1;
		if(compare<0)
			return 1;
		return 0;

	}
	
	
	public static boolean verificarDniInvalido(String dni) throws DniInvalido{
		if(dni.matches("[0-9]+")) {
			return true;
		}
		else {
			throw new DniInvalido();
		}
	}
	
}
