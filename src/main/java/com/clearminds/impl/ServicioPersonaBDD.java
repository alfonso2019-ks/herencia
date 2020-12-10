package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	@Override
	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en la BDD :"+persona);
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en la BDD :"+persona);
		return true;
	}

	@Override
	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona de la BDD :"+persona);
		return true;
	}

}
