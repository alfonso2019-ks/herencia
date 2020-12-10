package com.clearminds.model;

public class Persona {
	 private String identificacion;
	 private String nombre;
	 private int edad;
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String identificacion, String nombre, int edad) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
	}
	 
	public Persona() {
		
	}
	@Override
	public String toString() {
		return "Persona [identificacion=" + identificacion + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	 
}
