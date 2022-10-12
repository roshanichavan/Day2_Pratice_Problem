package day2Demo;

public class ReverseIntegerUsingWhileLoop {

	public static void main(String[] args)   
	{  
	int number = 231, reverse = 0;
	
	System.out.println("The Number is: " +number);
	
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The Reverse Number is: " +reverse);  
	}  

}

