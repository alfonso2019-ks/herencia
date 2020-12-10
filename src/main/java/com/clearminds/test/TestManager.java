package com.clearminds.test;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager personaManager = new PersonaManager();
		Persona persona1 = new Persona("123456", "Alfonso Castro", 22); 
		personaManager.insertarPersona(persona1);
	}

}
