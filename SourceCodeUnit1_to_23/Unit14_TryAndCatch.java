//This program will not run because the BufferReader is set to null

package com.hola_labjava.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class Unit14_TryAndCatch { 
	
	private static final Logger l = Logger.getLogger(Unit14_TryAndCatch.class.getName()); 
	public void hierarchyExample() {
		File file = new File("file.txt"); 
	}
	BufferedReader bufferedReader = null;
	try {
		bufferedReader = new BufferedReader(new FileReader(file));
	String line = bufferedReader.readLine();
	while (line != null) { 
		// Read the line
		}
	} catch (IOException e) {
		l.severe(e.getMessage());
		
	} catch (FileNotFoundException e) { 
		l.severe(e.getMessage()); 
		} catch (Exception e) { 
			l.severe(e.getMessage());
			} 
	}
}
	
	}
	}
}


