package com.hola_labjava.basics;

import java.math.BigDecimal;

public class Unit13_Employee extends Unit13_Person {
	
	
	private String taxpayerIdNumber;
	private String employeeName;
	private BigDecimal salary;
	

	public Unit13_Employee(String name, int age, int height, int weight, String eyeColor, String gender) {
		super(name, age, height, weight, eyeColor, gender);
		// TODO Auto-generated constructor stub
	}


	public String getTaxpayerIdNumber() {
		return taxpayerIdNumber;
	}


	public void setTaxpayerIdNumber(String taxpayerIdNumber) {
		this.taxpayerIdNumber = taxpayerIdNumber;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	@Override
	public void printAudit(StringBuilder buffer) {
		// TODO Auto-generated method stub
		super.printAudit(buffer);
		
		buffer.append("Taxpayer Identification Number = ");
		buffer.append(getTaxpayerIdNumber());
		
		buffer.append(",");
		buffer.append("Employee Number = ");
		buffer.append(getEmployeeName());
		buffer.append(",");
		buffer.append("Salary="); 
		buffer.append(getSalary().setScale(2).toPlainString());
	}


	@Override
	public boolean equals(Object arg0) {
		
		boolean ret= false;
		
		
		if(arg0 instanceof Unit13_Employee) {
			Unit13_Employee rhs = (Unit13_Employee)arg0;
			if(super.equals(arg0)&& getTaxpayerIdNumber().equals(rhs.getTaxpayerIdNumber())&& getEmployeeName().equals(rhs.getEmployeeName())) {
				
				 ret = true;
				
				
			}
		}
	}

}
