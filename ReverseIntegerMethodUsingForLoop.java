package day2Demo;

public class ReverseIntegerMethodUsingForLoop {

	public static void main(String[] args)   
	{  
	int number = 231, reverse = 0;  
	  
	System.out.println("The Number is: " +number);
	
	for( ;number != 0; number=number/10)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	}  
	System.out.println("The Reverse Number is: " +reverse);  
	}  

}

