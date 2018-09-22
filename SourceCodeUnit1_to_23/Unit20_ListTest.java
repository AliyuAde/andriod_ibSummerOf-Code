package com.hola_labjava.basics;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

class Unit20_ListTest {

	@Test
	void test() {
		 Logger log = Logger.getLogger(Unit20_ListTest.class.getName());
		 Unit20_List<BigDecimal> sl = new Unit20_List<>();
		 sl.add(BigDecimal.ONE); log.info("SimpleList size is : " + sl.size());
		 sl.add(BigDecimal.ZERO); log.info("SimpleList size is : " + sl.size());
		 sl.clear(); log.info("SimpleList size is : " + sl.size()); 
		 
	}

}
