package com.hola_labjava.basics;

import java.util.logging.Logger;
import java.math.BigDecimal;

public class Unit15_JavaApp {
	
	 private static final Logger log = Logger.getLogger(Unit13_Employee.class.getName()); 
	 public static void main(String[] args) { 
		 Unit13_Employee e = new Unit13_Employee("AliuAde A Adedigba", 42, 173, 82, "Black", "MALE");
			 e.setName("AliuAde");
		 e.setEmployeeName("Adedigba Aliu");
		 e.setTaxpayerIdNumber("08167381819");
		 e.setSalary(BigDecimal.valueOf(60000.0));
		 e.printAudit(log); 
		 }
	 }


