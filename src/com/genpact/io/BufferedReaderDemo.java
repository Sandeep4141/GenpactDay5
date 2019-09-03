package com.genpact.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader in  = null;
		FileReader fin  =null;
		long start=0;
		long end =0;
		try {
			fin  = new FileReader("C:\\Users\\703247241\\Desktop\\JavaCode\\sample.txt");
			in = new BufferedReader(fin); //now in will refer to the 1st char of the file ,
			// EOF for in is NULL and for fin is -1
			start = System.currentTimeMillis();
			String s = in.readLine();
			while((s=in.readLine())!=null)
			{
				s = in.readLine();
				//System.out.println(s);
			}
			
			end =System.currentTimeMillis();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("time for reading file : " + (end-start));
		

	}

}
