package com.lq.acc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStream inFile = new FileInputStream("C:\\Users\\Student\\Documents\\test.txt");
		
			Reader inStreamReader = new InputStreamReader(inFile);
			LineNumberReader lineReader = new LineNumberReader(inStreamReader);
			lineReader.lines().forEach( line -> System.out.print(line));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
