package com.genpact.exception;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		   int num1  = 12;
		   Scanner sc = new Scanner(System.in);
		   //local variable must be initialize before use
		   int num2 =0;
		   System.out.println("Enter 1st number : ");
		   num1 = sc.nextInt();
		   System.out.println("Enter 2nd number : ");
		   num2 = sc.nextInt();
		   
		   //NullPointerException -- because name reference refer to the null object  
		 /*  String name  = null;
		   try {
		   System.out.println(name.length());
		   }
		   catch(NullPointerException n){
			   System.out.println(n);
		   }
		   *
		   */
		   
		   
		   int arr[]  = {10,11,12 ,13};
		   int result = 0;
		   //try-catch block  for catching any exception 
		   
		   try{
			/*  int num3 =0;
			*/
		   result  = num1/num2;
			   
		   System.out.println(arr[result]);
		   //int res = num1/num3;
		  
		   }
		  /* catch(ArithmeticException e)
		   {
			    //System.out.println("Please enter a valid number "); 
			    // printStackTrace will give you proper location where exception occurs .
			    e.printStackTrace();
			//   System.out.println(e);
		   }
		   
		   catch(ArrayIndexOutOfBoundsException e) {
			   e.printStackTrace();
			   
			   
		   }
		   */
		   catch(Exception e ) {
			   System.out.println(e);
		   }
		   
		   
		   //instead  of handling one-by one exception we can catch a general exception .
		   
		   
		   //finally block is executed for checking whether an exception occurred or not 
		   
		   finally {
			   
			   System.out.println("In finally block ");
		   }
		   
		   System.out.println("Result : " + result);
		   
		   
		   sc.close();
		   
		   
	}

}
