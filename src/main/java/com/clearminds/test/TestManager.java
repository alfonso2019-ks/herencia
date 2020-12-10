package com.clearminds.test;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager personaManager;
		try {
			personaManager = new PersonaManager("bdd");
			Persona persona1 = new Persona("123456", "Alfonso Castro", 22); 
			personaManager.insertarPersona(persona1);
		} catch (InstanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
