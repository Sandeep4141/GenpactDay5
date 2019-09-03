package com.genpact.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageFile {

	public static void main(String[] args) {
		 FileInputStream fin = null;
		 FileOutputStream fout  =null;
		 
		 // there are also writer() and reader() method but these method only read and write binary data
		 
		 try {
			 fin =  new FileInputStream("C:\\Users\\703247241\\Desktop\\JavaCode\\Agile.jpg");
			 fout =  new FileOutputStream("C:\\Users\\703247241\\Desktop\\JavaCode\\my.jpg");
			 int ch;
			 while( (ch=fin.read())!=-1) {
				 fout.write(ch);
				 
			 }
			 
		 }
		 catch(FileNotFoundException f){
			 f.printStackTrace();
			 
			 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {}
		 try {
			fin.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
