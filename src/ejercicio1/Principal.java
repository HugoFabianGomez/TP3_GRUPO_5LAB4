package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;



public class Principal {

	public static void main(String[] args) {
		
		ArchivoPersonas a = new ArchivoPersonas();
		
		String ruta = "Personas.txt";
		List<String> ListLineas = new ArrayList<String>();
		TreeSet<Persona> ListPersonas = new TreeSet<Persona>();
		if(a.existe(ruta)) {
			ListLineas= a.leeNoDuplicados(ruta);
				String n;			
			for(int x=0; x<ListLineas.size();x++) 
			{
				n=ListLineas.get(x);
				if (n == null) {}
				else {
						String[] datos = n.split("-");
						int cantidadDatos = datos.length;
						if(cantidadDatos > 2) {
						
											try {
											if(Persona.verificarDniInvalido(n.split("-")[2])) {
													Persona persona = new Persona(n.split("-")[0], n.split("-")[1], Integer.parseInt(n.split("-")[2]));
													ListPersonas.add(persona);
											}
											}
											catch(DniInvalido e) {
												System.out.println(e.getMessage());
											}						
										}
					}
			}			
			Iterator<Persona> it = ListPersonas.iterator();
			while(it.hasNext()) {
				Persona p = (Persona) it.next();
				System.out.println(p.toString());				
			}			
		}
	}
}
