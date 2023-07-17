package com.citibank.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriter {
	private Reader readerOne;
	private BufferedReader readerTwo;
	
	private Writer writerOne;
	private Writer writerTwo;
	
	public Boolean writeFile(File file, String data) {
		try {
			writerOne = new FileWriter(file, true);
			writerTwo = new BufferedWriter(writerOne);
			data = "\n" + data;
			writerTwo.write(data);
			writerTwo.flush();
			writerOne.flush();
			return true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				WRITERTWO.FLUSH();
//				WRITERONE.FLUSH();
				writerTwo.close();
				writerOne.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
		
	}
	
	public String readFile(File file) {
		try {
			readerOne = new FileReader(file);
			readerTwo = new BufferedReader(readerOne);
			
			String tempData = readerTwo.readLine();
			String data = "";
			while(tempData != null) {
				data = data + tempData + "\n";
				tempData = readerTwo.readLine();
			}
			return data;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				readerOne.close();
				readerTwo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return null;
	}

}
