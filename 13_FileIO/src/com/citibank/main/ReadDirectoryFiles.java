package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;

public class ReadDirectoryFiles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		
		System.out.println("enter directory path to print all file data");
		path = scanner.nextLine();
		ReadFileData readFileData = new ReadFileData();
		
		File file = new File(path);
		File[] allfiles = file.listFiles();
		int i = 0;
		for (File file2 : allfiles) {
			if(file2.isFile()) {
				String data = readFileData.readData(file2);
				System.out.println(file2.getName());
				System.out.println(data);
				System.out.println();
				i++;
			}
			
		}
		System.out.println("count of files: " + i);
	}

}
