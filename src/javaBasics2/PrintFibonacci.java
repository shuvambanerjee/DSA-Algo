package javaBasics2;

import java.util.Scanner;

public class PrintFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of terms you want in the fibonacci series");
		int n = sc.nextInt();
		printFibonacciSeries(n);
		sc.close();

	}

	private static void printFibonacciSeries(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" "+num2+" ");
		for(int i = 2;i<n;i++) {
			int sum = num2 + num1;
			num1 = num2;
			num2 = sum;
			System.out.print(sum+" ");
			
		}
		
	}

}
