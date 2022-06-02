package javaBasics1;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in inches ");
		float inches = sc.nextFloat();
		System.out.println(inches +" inches = "+(float) (inches / 39.3700787) +" meters");
		sc.close();

	}

}
