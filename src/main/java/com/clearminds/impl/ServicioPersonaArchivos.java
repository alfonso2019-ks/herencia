package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona{

	@Override
	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en un archivo :"+persona);
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en un archivo :"+persona);
		return true;
	}

	@Override
	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona de un archivo :"+persona);
		return true;
	}


}
