package com.conditional;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int size=sc.nextInt();
		if(size <=0) {
			System.out.println("invalid number");
		}
		for (int i=1;i<=size;i++) {
			if(i%2 ==0) {
				System.out.println(i + " even");
			}
			else {
				System.out.println(i + "odd");
			}
		}
	}

}
	
