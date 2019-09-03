package com.genpact.exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ex2 {

	public static void main(String[] args) {
		BufferedReader out = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		
		try {
		String name  =  out.readLine();   //may be readLine will throws an exception , so you need to handle that exception .
		// IOException is a checked exception . you need to catch them before compilation 
		System.out.println(name);
		System.out.println("Enter your age : ");
		
		String ag = out.readLine();
		//convert string to the number ,use Integer class for parsing 
		int newage = Integer.parseInt(ag) +10;   //try to give input as 12a , you will get an error ,NumberFormatExcetion
		System.out.println("New age is : " + newage);
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch(NumberFormatException n)
		{
			System.out.println(n);
		}

	}

}
