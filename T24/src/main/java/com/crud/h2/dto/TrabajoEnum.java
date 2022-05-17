package com.crud.h2.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TrabajoEnum {
	
	PROGRAMADOR ("Programador"),
	DISEÑADOR ("Diseñador"),
	ADMINISTRADOR("Administrador");
	
	private final String nombreTrabajo;
	
	
	public int setearSueldo(String trabajo) {
		
		int sueldo = 0;
		
		switch(trabajo) {
			case "Programador":
				sueldo = 10000;
				break;
			case "Diseñador":
				sueldo = 100;
				break;
				
			case "Administrador":
				sueldo = 5000;
				break;
		}
		
		return sueldo;
	}
	
//Getter and Setters
	TrabajoEnum(String nombreTrabajo) {
		this.nombreTrabajo = nombreTrabajo;
	}

	
	public String getNombreTrabajo() {
		return nombreTrabajo;
	}

	@Override
	public String toString() {
		return nombreTrabajo;
	}
	
	
}
