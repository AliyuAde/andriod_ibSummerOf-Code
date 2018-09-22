package com.hola_labjava.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;


class Unit5_PersonTest {

	@Test
	public void testUnit5_Person() {
		Unit5_Person p = new Unit5_Person("AliuAde A Adedigba", 42, 173, 82, "Black", "MALE");
		Logger l = Logger.getLogger(Unit5_Person.class.getName());
		l.info("Name: " + p.getName());
		l.info("Age:" + p.getAge());
		l.info("Height (cm):" + p.getHeight());
		l.info("Weight (kg):" + p.getWeight()); 
		l.info("Eye Color:" + p.getEyeColor());
		l.info("Gender:" + p.getGender());
		assertEquals("Joe Q Author", p.getName());
		assertEquals(23, p.getAge());
		assertEquals(173, p.getHeight());
		assertEquals(69, p.getWeight()); 
		assertEquals("Black", p.getEyeColor());
		assertEquals("MALE", p.getGender());
	}

}
