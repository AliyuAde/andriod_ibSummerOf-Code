package com.hola_labjava.basics;

import java.util.logging.Logger;

public class Unit13_Person {
Logger l = Logger.getLogger(Unit13_Person.class.getName());
	
	private String name;
	private int age;
	private int height; 
	private int weight;
	private String eyeColor;
	private String gender;
	
	public Unit13_Person(String name, int age, int height, int weight, String eyeColor, String gender) { 
		this.name = name;
		this.age = age; 
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.gender = gender;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printAudit(StringBuilder buffer) { 
		buffer.append("Name="); 
		buffer.append(getName());
		buffer.append(","); 
		buffer.append("Age=");
		buffer.append(getAge());
		buffer.append(","); 
		buffer.append("Height=");
		buffer.append(getHeight());
		buffer.append(",");
		buffer.append("Weight="); 
		buffer.append(getWeight());
		buffer.append(",");
		buffer.append("EyeColor=");
		buffer.append(getEyeColor()); 
		buffer.append(",");
		buffer.append("Gender="); 
		buffer.append(getGender());
		
	}
	
		public void printAudit(Logger l) { 
			StringBuilder sb = new StringBuilder();
			printAudit(sb); l.info(sb.toString());
			
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((eyeColor == null) ? 0 : eyeColor.hashCode());
			result = prime * result + ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + height;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + weight;
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Unit13_Person other = (Unit13_Person) obj;
			if (age != other.age)
				return false;
			if (eyeColor == null) {
				if (other.eyeColor != null)
					return false;
			} else if (!eyeColor.equals(other.eyeColor))
				return false;
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			if (height != other.height)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (weight != other.weight)
				return false;
			return true;
		}
		
	


}
