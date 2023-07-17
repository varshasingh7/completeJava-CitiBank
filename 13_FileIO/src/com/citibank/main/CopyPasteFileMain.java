package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;
import com.citibank.util.WriteFileData;

public class CopyPasteFileMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		String newPath;
		System.out.println("enter path or file to copy its content");
		path=scanner.nextLine();
		File file = new File(path);
		
		ReadFileData readFileData = new ReadFileData();
		String data = readFileData.readData(file);
		
		
		System.out.println("enter path where you want to paste the file");
		newPath=scanner.nextLine();
		
		File file2 = new File(newPath + "/copy.txt");
		WriteFileData writeFileData = new WriteFileData();
		
		
		boolean result = writeFileData.writeData(file2, data);
		if(result) {
			System.out.println(" check your file ");
		}else
			System.out.println("write operation failed");
		
		
		
	}

}
