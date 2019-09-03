package com.genpact.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PasswordDemo {
	
	public static boolean validpass(String pass) {
		if(pass.length()>=8)
		{
			char specChar[] = {'$' ,'!' ,'#' ,'@'};
			for(int i=0 ;i<pass.length() ;i++)
			{
				for(int j=0 ;j<4 ;j++)
				{
					if(pass.charAt(i)==specChar[j])
						return true;
					
				}
			}
		}
		
		return false;
		
	}

	static void Validatepass(String pass) throws PasswordException{
		if(validpass(pass)==true)
			System.out.println("Valid password");
		else throw new PasswordException("Not valid passwrod");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your password : ");
		String pass = null;
		try {
		pass =  bf.readLine();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
		
		
		try {
			
			Validatepass(pass);
		}
		catch(PasswordException p)
		{
			p.printStackTrace();
		}
	}

}
