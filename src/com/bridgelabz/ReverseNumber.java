/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0,rm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		//r is reverse
		//rm is remainder
		while(num!=0)
		{
			rm =num%10;
			r=r*10+rm;
			num=num/10;
			
			
		}
		System.out.println("Reversed number is :"+r);

	}

}
