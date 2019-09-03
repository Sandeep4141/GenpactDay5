package com.genpact.io;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/* buffer stream should be closed 
 buffer is temp area ,so if we don't close it end of the program then
may be some garbage value will be send to the destination , so we may get wrong answer   */


public class BufferedWriterDemo {

	public static void main(String[] args) {
		BufferedReader in = null;
		in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  out = null;
		try {
			/* FileWriter fout = new FileWriter("d:\\student.txt");
			out = new BufferedWriter(fout); */
			
			out  =new BufferedWriter(new FileWriter("C:\\Users\\703247241\\Desktop\\JavaCode\\st.txt" ,true)); //true = for appending new text in the same
			System.out.println("Enter your roll number : ");
			String rollNo = in.readLine();
			out.write(rollNo , 0,rollNo.length()); //with out new line
			
			out.newLine();
			
			System.out.println("Enter name : ");
			String name =  in.readLine();
			out.write(name ,0 ,name.length());  // 0 means writing will be start from index 0 ;
			out.newLine();
			System.out.println("Enter your marks : ");
			String marks  =  in.readLine();
			
			out.write(marks , 0 ,marks.length());
			out.newLine();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
		
				try {
					in.close();
					out.close(); // this should be there 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		
		
		
		
		

	}

}
