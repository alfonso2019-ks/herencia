package com.clearminds.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	public ServicioPersona serv;
	
	public static String leerPropiedad(String nombrePropiedad) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileReader("D:\\tallerSemillero\\herencia\\config.properties"));
		if(p.getProperty(nombrePropiedad)!=null) {
			return p.getProperty(nombrePropiedad);
		}
		return null;
	}
	
	public PersonaManager(String propiedad) throws InstanceException {
		try {
			if(leerPropiedad(propiedad)!= null) {
				String valorPropiedad = leerPropiedad(propiedad);
				Class<?> clase = Class.forName(valorPropiedad);
				serv = (ServicioPersona)clase.newInstance();
			}else {
				throw new InstanceException("No se pudo obtener la propiedad");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
}
