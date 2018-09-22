package com.hola_labjava.basics;

import java.util.logging.Logger;

public class Unit18_NestedClass {
	
	private static final Logger log = Logger.getLogger(Unit18_NestedClass.class.getName());
	public void setInner(Inner inner) {
		this.inner = inner;
		
	}
	
		private Inner inner; 
		
		public Inner getInner() { return inner; 
		
		}
		
		private class Inner { 
			
			
		} public static void main(String[] args) { 
			Unit18_NestedClass outer = new Unit18_NestedClass();
			
			Inner inner = new Unit18_NestedClass.Inner(); 
			Unit18_NestedClass.setInner(inner);
			log.info("Outer/Inner: " + outer.hashCode() + "/" + outer.getInner().hashCode());
	}
		

}


