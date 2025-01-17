package com.hpe.day10;

import java.io.File;
import java.io.IOException;

public class FileOperationsEx01 {
	public static void main(String[] args) {
		// this will not create the file instead this will be only the reference 
		File file = new File("sample.txt");
		
		
		if(file.exists()) {
			System.out.println("The file exists with Name : " + file.getName());
			System.out.println("File Stored At " + file.getAbsolutePath());
			System.out.println("does file has read permission " + file.canRead());
			System.out.println("Does file has write permission " + file.canWrite());
			System.out.println("Is this the file " + file.isFile());
		}else {
			try {
				System.out.println(file.createNewFile()?"File Created" :"File Not Created") ; 
			}catch(IOException ioe) {
				System.out.println("Sorry File not create " + ioe);
			}
		}
	}
}
