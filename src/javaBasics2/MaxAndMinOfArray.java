package javaBasics2;

import java.util.Scanner;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter numbers in array ");
		int[] arr = new int[5];
		for(int i = 0;i<arr.length ;i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Max = " + max + " Min = " + min);
		sc.close();

	}

}
