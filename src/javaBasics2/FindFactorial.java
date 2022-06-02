package javaBasics2;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want factorial");
		int num = sc.nextInt();
		int res = 1;
		while (num > 0) {
			res *= num;
			num--;
		}
		System.out.println("The factorial is : " + res);
		sc.close();
	}

}
