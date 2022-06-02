package javaBasics2;

import java.util.Scanner;

public class NumbersGreaterThanAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numers in the array");
		int[] nums = new int[5];
		int totalSum = 0;
		for(int i = 0;i<nums.length ;i++) {
			nums[i] = sc.nextInt();
			totalSum += nums[i];
		}
		int average = totalSum / nums.length;
		System.out.println("Averge is : "+average);
		for(int num : nums) {
			if(num > average) {
				System.out.println(num);
			}
		}
		sc.close();

	}

}
