package javaBasics1;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year !");
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0 ) || year % 400 ==0) {
			System.out.println("Year "+year+" is a Leap Year");
		}else {
			System.out.println("Year "+year+" is a not a Leap Year");
		}
		sc.close();

	}

}
