package ejercicio1;
import java.io.IOException;

public class DniInvalido extends IOException {

	private static final long serialVersionUID = 1L;

	public DniInvalido(){
		
	}

	@Override
	public String getMessage() {
		return "Error - El DNI solo puede contener numeros ";
	}
	
}
