package com.clearminds.excepciones;

public class InstanceException extends ClassNotFoundException{
	public InstanceException(String mensaje) {
		super(mensaje);
	}
}
