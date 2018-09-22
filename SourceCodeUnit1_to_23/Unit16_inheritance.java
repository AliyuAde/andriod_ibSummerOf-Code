package com.hola_labjava.basics;

public abstract class Unit16_inheritance {
	private String name; 
	String friendlyVariable;
	protected Unit16_inheritance(String name) { 
		this.name = name; 
		this.friendlyVariable = name;
		} 
	protected abstract boolean validate();



public String getName() {
	return name; 
	}
public void setName(String name) {
	this.name = name; 
	}
}


