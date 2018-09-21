package com.hola_labjava.basics;

	import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

		class Unit7_StringTest {

	@Test
	public void testGetfullName() {
		
			Unit7_String p = new Unit7_String("Aliu", "Adedigba", "AliuAde");
			
				Logger l = Logger.getLogger(Unit7_String.class.getName());
			
					l.info("Full Name : " + p.getFirstName()+"  " + p.getLastName()+"  "+ p.getNickName());
			
			
		
		
	}

}
