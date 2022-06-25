package program.jav.exceptn;

import java.util.Scanner;

/*
 * You need to check the salary of the person and based on that need to return the output from the program.
if salary < 2100  then return custom exception message as "you need to work hard"
if salary is between 2100 and 5000 then return custom exception message as "your salary is somehow good"
if salary is between 5100 and 9000 then return custom exception message as "salary is very good"
Design the custom exception class in this and take salary from the user.
 * 
 */
public class CustomExceptionAssignment {

	static void validatesalary(int salary)throws SalaryException {  
	     if(salary < 2100)  
	      throw new SalaryException("you need to work hard");  
	     else if(salary >= 2100 && salary <= 5000)  
	    	 throw new SalaryException("your salary is somehow good");   
	     else if(salary >= 5100 && salary <= 9000)  
	    	 throw new SalaryException("salary is very good");
	   }  
	     
	   public static void main(String args[]){  
		   Scanner scanner = new Scanner( System.in );  
		   System.out.print("Enter the salary ");  
		     
		   int value = scanner.nextInt();
	      try{  
	        validatesalary(value);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

//This class is created for your own defined exception message
class SalaryException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	SalaryException(String s){  //2
	  super(s);  
	 }  
}


