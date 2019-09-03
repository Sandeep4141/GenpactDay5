package com.genpact.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fin = null;
		FileWriter out= null;
		try {
			fin = new FileReader("C:\\Users\\703247241\\Desktop\\JavaCode\\sample.txt");
			// if newfile is already there data will be over write otherwise create a newfile .
			out  = new FileWriter("C:\\Users\\703247241\\Desktop\\JavaCode\\newsample.txt");
			
			int ch;
			while((ch=fin.read())!=-1)
			{
				out.write(ch);
			}
			
			System.out.println("File is copied");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				fin.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
