package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileMetaData;

public class FileMetaDataMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		System.out.println("enter File/directory path to print meta data");
		path=scanner.nextLine();
		File file = new File(path);
		
		FileMetaData fileMetaData = new FileMetaData();
		fileMetaData.printMetaData(file);
	}

}
