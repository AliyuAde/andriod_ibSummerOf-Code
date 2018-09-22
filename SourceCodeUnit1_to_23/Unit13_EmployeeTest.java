package com.hola_labjava.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class Unit13_EmployeeTest {

	@Test
	void testPrintAuditLogger() {
		Unit13_Employee e = new Unit13_Employee("AliuAde A Adedigba", 42, 173, 82, "Black", "MALE");
		e.setTaxpayerIdNumber("08167381819");
		e.setEmployeeName("Adedigba Aliu");
		e.setSalary(BigDecimal.valueOf(60000.0));
		StringBuilder sb = new StringBuilder();
		e.printAudit(sb);
		e.printAudit(Logger.getLogger(Unit13_EmployeeTest.class.getName()));
		
		
	}

}
