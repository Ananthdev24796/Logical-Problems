/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class StopWatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double elapsedTime=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Start Time");
		double startTime = input.nextDouble();
		System.out.println("Enter the End Time");
		double endTime = input.nextDouble();
		
		elapsedTime=endTime-startTime;
		System.out.println(elapsedTime);
	}

}
