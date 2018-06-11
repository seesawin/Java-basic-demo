package tw.com.seesawin.ex07.Override;

import java.net.*;
import java.io.*;

public class Override2 {
	public void aMethod() throws IOException, InstantiationException {
		URL u = new URL("http://tw.yahoo.com");
	}
}

class Override2Child extends Override2 {
	/*
	// less than parent class method allowed
	public void aMethod() throws InstantiationException {
		// URL u = new URL("http://tw.yahoo.com");
	}

	// IOException's subclass allowed
	public void aMethod() throws FileNotFoundException, EOFException {
		// URL u = new URL("http://tw.yahoo.com");
	}
	

	// IOException's superclass not allowed
	public void aMethod() throws Exception {
		// URL u = new URL("http://tw.yahoo.com");
	}
	
	// different exception not allowed
	public void aMethod() throws IllegalAccessException {
		// URL u = new URL("http://tw.yahoo.com");
	}

	// unchecked exceptioin allowed
	public void aMethod() throws RuntimeException {
		// URL u = new URL("http://tw.yahoo.com");
	}
*/
}
