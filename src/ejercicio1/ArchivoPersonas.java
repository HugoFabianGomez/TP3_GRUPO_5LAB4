package ejercicio1;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ArchivoPersonas {
	
	public boolean existe(String ruta)
	{
		File archivo = new File(ruta); 
		if(archivo.exists())
		      return true;
		return false;
	}
	
	public List<String> leeNoDuplicados(String ruta) {
		List<String> ListLinea = new ArrayList<String>();
		
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
		
			String linea = "";
			while (linea != null) {
				linea = miBuffer.readLine();
				ListLinea.add(linea);
			}
			miBuffer.close();
			entrada.close();
			
		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		return ListLinea;
		

	}	
}
