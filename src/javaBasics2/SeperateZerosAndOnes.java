package javaBasics2;

import java.util.Scanner;

public class SeperateZerosAndOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numers in the array");
		int[] nums = new int[5];
		int zeroCounter = 0;
		for(int i = 0;i<nums.length ;i++) {
			nums[i] = sc.nextInt();
			if(nums[i] == 0) zeroCounter++;
		}
		
		for(int i = 0 ;i<zeroCounter ;i++) {
			nums[i] = 0;
		}
		
		for(int i = zeroCounter; i<nums.length;i++) {
			nums[i] = 1;
		}
		
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
		sc.close();

	}

}
