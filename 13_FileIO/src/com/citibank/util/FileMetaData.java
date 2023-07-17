package com.citibank.util;

import java.io.File;
import java.util.Date;

public class FileMetaData {
	
	public void printMetaData(File file) {
		if (file.exists()) {
			System.out.println("Parent folder =" + file.getParent());
			System.out.println("File Path = " + file.getAbsolutePath() );
			System.out.println("get path = " +file.getPath());
			System.out.println("Name of file = " + file.getName());
			System.out.println("size = " + file.length() + "bytes");
//			System.out.println("Last accessed on = " + file.lastModified());
			Date date = new Date(file.lastModified());
			System.out.println("Last accessed on = " + date);
			System.out.println("can read = " + file.canRead());
			System.out.println("can write = " + file.canWrite());
			System.out.println("can execute = " +file.canExecute());
			System.out.println("Is file = " + file.isFile());
			System.out.println("Is Directory = " +file.isDirectory());
			System.out.println("Is Hidden = " + file.isHidden());

		}
		else {
			System.out.println("File does not exist!");
		}
		
	}

}
