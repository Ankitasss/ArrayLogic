package com.kodnest.swapping.logic;

import java.util.Scanner;

public class ProgramForSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("the enter numbers  are before swapping"+a+" "+b);
		int help=a;
		a=b;
		b=help;
		System.out.println("the enter numbers after perform the swapping logic"+a+" "+b);

	}

}
