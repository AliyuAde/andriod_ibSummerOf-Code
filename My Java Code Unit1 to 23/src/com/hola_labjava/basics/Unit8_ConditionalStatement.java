package com.hola_labjava.basics;

public class Unit8_ConditionalStatement {
	
	public int getHeight() {
		int ret = height; 
		// If locale of the computer this code is running on is U.S., 
		if (Locale.getDefault().equals(Locale.US))
			ret /= 2.54;// convert from cm to inches
		return ret;
		
	}
	}

}
