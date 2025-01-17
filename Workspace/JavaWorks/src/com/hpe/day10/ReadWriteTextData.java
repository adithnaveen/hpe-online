package com.hpe.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadWriteTextData {
	public static void main(String[] args) {

		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Your Name ");
			String name = br.readLine();

			System.out.println("Enter Income ");
			double income = Double.parseDouble(br.readLine());
			System.out.println("Enter Email ");
			String email = br.readLine();
			System.out.println("Your Name is " + name);
			System.out.println("Income is " + income);
			System.out.println("Email is " + email);

			File file = new File("emps.txt");
			fw = new FileWriter(file, true); 
			bw = new BufferedWriter(fw);

			bw.write("Emp Name :" + name );
			bw.newLine();
			bw.write("Emp Income:" + income);
			bw.newLine();
			bw.write("Emp Email  :" + email);
			bw.newLine();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		System.out.println("Data stored in the file... ");

	}
}
