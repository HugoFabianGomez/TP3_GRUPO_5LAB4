package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		ArchivoPersonas a = new ArchivoPersonas();
		
		String ruta = "Personas.txt";
		
		if(a.existe(ruta)) {
		a.leeNoDuplicados(ruta);
		}
	}
}
