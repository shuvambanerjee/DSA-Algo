package javaBasics2;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		
		int smallest = findSmallestNumber(num1,num2,num3);
		System.out.println("The smallest number is : "+smallest);
		sc.close();

	}

	private static int findSmallestNumber(int num1, int num2, int num3) {
		if(num1<num2 && num1<num3) {
			return num1;
		}else if(num2<num1 && num2<num3) {
			return num2;
		}else {
			return num3;
		}
	}

}
