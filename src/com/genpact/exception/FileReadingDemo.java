package com.genpact.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader in=null ;
		long start = 0;
		long end = 0;
		try {
		in = new FileReader("C:\\Users\\703247241\\Desktop\\JavaCode\\sample.txt");
	    //read return type is "int";
		int ch = in.read();
		start = System.currentTimeMillis();
		//System.out.println(ch);
		// EOF is -1 means while does not return -1 ,we need to keep reading file
		while((ch=in.read())!=-1)
		{
			//System.out.print((char)(ch));
			ch=in.read();
		    }
		end  = System.currentTimeMillis();
		}
		catch(FileNotFoundException f)
		{
			f.printStackTrace();
		} 
		catch (IOException e) {
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
		System.out.println("Total time : " + (end-start));
	}
}
	
