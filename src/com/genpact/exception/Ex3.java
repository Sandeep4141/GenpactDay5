package com.genpact.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	
	//throws 
	static void input()  throws IOException ,NumberFormatException{
		BufferedReader out = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name : ");
		String name  =  out.readLine();    //either use try-catch block to handle  IOException or use throws 
		System.out.println("Your name is : " + name);
		
	    System.out.println("Enter your age : ");
		int age =  Integer.parseInt(out.readLine());
		System.out.println("Your age is : " + age);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// here main() function work as server and input() function work as client 
		// so if client throws any Exception server must handle it . so we need to add try-catch block around input() block 
		try {
		input();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch(NumberFormatException n)
		{
			System.out.println(n);
		}
		
		System.out.println("Out of catch");

	}

}
