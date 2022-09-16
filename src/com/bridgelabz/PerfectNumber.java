/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number");
			int num= input.nextInt();
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum = sum+i;
				}
			}if(sum == num) {
				System.out.println("Perfect number"+num);
			}else
				System.out.println("Not Perfect Number"+num);

	}

}
