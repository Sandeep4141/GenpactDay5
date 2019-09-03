package com.genpact.exception;

public class AgeExceptionDemo {
	
	static void validateAge(int age) throws AgeException {
		
		if(age>=22 && age<=60)
			System.out.println("Valid age ");
		else {
			throw new AgeException("Not valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			validateAge(65);
		}
		catch(AgeException a) {
			System.out.println(a);
			//a.printStackTrace();
		}

	}

}
