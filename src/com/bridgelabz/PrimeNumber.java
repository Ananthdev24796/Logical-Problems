/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number Check Prime or Not:");
		int num =input.nextInt();
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Prime Number");
		}else
		{
			System.out.println("Not A Prime Number");
		}

	}

}
