package com.hola_labjava.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class Unit9_loopTest {

	@Test
	public void testGetfullName() {
		
		Unit9_loop p = new Unit9_loop("Aliu", "Adedigba", "AliuAde");
		
			Logger l = Logger.getLogger(Unit7_String.class.getName());
			
			for (int aa = 0; aa < 3; aa++)
		
				l.info("Full Name : " + p.getFirstName()+"  " + p.getLastName()+"  "+ p.getNickName());
		
	}
	
	
}



