package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.WriteFileData;

public class WriteFileDataMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		String data;
		System.out.println("enter File/directory path to print meta data");
		path=scanner.nextLine();
		System.out.println("enter file content");
		data = scanner.nextLine();
		
		File file = new File(path);
		WriteFileData writeFileData = new WriteFileData();
		
		boolean result = writeFileData.writeData(file, data);
		if(result) {
			System.out.println(" check your file ");
		}else
			System.out.println("write operation failed");
		
		
	}

}
