package javaBasics1;

import java.util.Scanner;

public class PerimeterAndAreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		System.out.println("Enter radius of the circle !");
		System.out.println("The Area of the circle is : "+ (float) Math.PI * (radius * radius));
		System.out.println("The Perimeter of the circle is : "+ (float) (2 * Math.PI * radius));
		sc.close();
	}

}
