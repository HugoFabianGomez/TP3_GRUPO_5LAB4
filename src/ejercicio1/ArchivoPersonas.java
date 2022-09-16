package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArchivoPersonas {
	
	public boolean existe(String ruta)
	{
		File archivo = new File(ruta); 
		if(archivo.exists())
		      return true;
		return false;
	}
	
	public void leeNoDuplicados(String ruta) {
        Set<String> lista = new HashSet<String>();
        Path path = Paths.get(ruta);
        
        try (Stream<String> lineas = Files.lines(path)) {
        	lista = lineas
                    .collect(Collectors.toSet());

        } catch (IOException ex) {
        } 
        lista.forEach(e -> System.out.println(e));
	}	
}
