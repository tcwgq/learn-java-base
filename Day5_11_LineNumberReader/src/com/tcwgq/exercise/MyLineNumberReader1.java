package com.tcwgq.exercise;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader1 extends MyLineNumberReader{

	int lineNumber = 0;
	public MyLineNumberReader1(Reader in) {
		super(in);
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
	
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	@Override
	public String readLine() throws IOException {
		lineNumber ++;
		return super.readLine();
	}

}
