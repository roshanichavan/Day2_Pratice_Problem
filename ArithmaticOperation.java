package day2Demo;

import java.util.Scanner;
public class ArithmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Calculating a+b*c: ");
		int result1 = a+b*c;
		System.out.println("Result: "+result1);
		System.out.println("Calculating c+a/b:");
		int result2  = c+a/b;
		System.out.println("Result: "+result2);
		System.out.println("Calculating a%b+c:");
		int result3 = a%b+c;
		System.out.println("Result: "+result3);
		System.out.println("Calculating a*b+c:");
		int result4 = a*b+c;
		System.out.println("Result: "+result4);
		
		if((result1<result2) && (result1<result3) && (result1<result4)){
			System.out.println(result1+" is Smaller");
		}else if((result2<result3) && (result2<result4)) {
			System.out.println(result2+" is Smaller");
		}else if((result3<result4)) {
			System.out.println(result3+" is Smaller");
		}else {
			System.out.println(result4+" is Smaller");
		}
		
		if((result1>result2) && (result1>result3) && (result1>result4)){
			System.out.println(result1+" is Greater");
		}else if((result2>result3) && (result2<result4)) {
			System.out.println(result2+" is Greater");
		}else if((result3>result4)) {
			System.out.println(result3+" is Greater");
		}else {
			System.out.println(result4+" is Greater");
		}

	}

}


