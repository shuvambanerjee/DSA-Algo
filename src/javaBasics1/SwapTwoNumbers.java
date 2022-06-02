package javaBasics1;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1  =sc.nextInt();
		System.out.println("Enter second number");
		int num2  =sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Num1 : "+num1 +" and Num2 : " +num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping");
		System.out.println("Num1 : "+num1 +" and Num2 : " +num2);
		
		sc.close();

	}

}
