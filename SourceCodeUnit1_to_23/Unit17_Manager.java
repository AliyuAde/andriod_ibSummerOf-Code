 package com.hola_labjava.basics;
 import java.math.BigDecimal;
 import java.util.logging.Logger;

public class Unit17_Manager extends Unit13_Employee implements StackOptionEligible {
	
	private static final Logger log = Logger.getLogger(Unit17_Manager.class.getName());
		
	public void processStockOptions(int numberOfOptions, BigDecimal price) {
		log.info("I can't believe I got "+ numberOfOptions +" option at $"+ price.toPlainString()+ "");
		
	}
	
	
	
	

}
