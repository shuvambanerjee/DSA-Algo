package javaBasics2;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers in array");
		int[] nums = new int[5];
		int sum = 0;
		for(int i = 0;i<nums.length ;i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		System.out.println("The total sum of the array is : "+sum);
		sc.close();

	}

}
