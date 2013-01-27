package com.imaginarycode.plugins.seizeddrugs;

public class SeizedDrugsException extends Exception {

	private String ex;
	
	public SeizedDrugsException(String string) {
		ex = string;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4063705657227639541L;
	
	public String getMessage() {
		return ex;
	}

}
