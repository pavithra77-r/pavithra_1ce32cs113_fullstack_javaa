package com.conditional;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int x;
		x=sc.nextInt();
		if(x==0) {
			System.out.println("the given number :"+x+" is zero");
		}else if(x<0) {
			System.out.println("the given number is :"+x+" is -ve");
		}else if(x%2==0) {
			System.out.println("the given number is :"+x+" is even");
		}else {
			System.out.println("the given number is :"+x+" is odd");
		}
		sc.close();
	}
}
	
