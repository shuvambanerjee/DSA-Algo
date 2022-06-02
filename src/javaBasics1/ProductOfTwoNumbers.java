package javaBasics1;

import java.util.Scanner;

public class ProductOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number !");
		int num1 = sc.nextInt();
		System.out.println("Enter second number !");
		int num2 = sc.nextInt();
		System.out.println("The Product of two Numbers is : "+ (num1 * num2));
		sc.close();
	}

}
