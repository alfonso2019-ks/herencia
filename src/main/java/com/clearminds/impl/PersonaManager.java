package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	public ServicioPersona serv;
	
	public PersonaManager() {
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona) {
		serv = new ServicioPersonaArchivos();
		serv.insertar(persona);
	}
}
