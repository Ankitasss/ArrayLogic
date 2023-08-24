package com.kodnest.swapping.logic;

import java.util.Scanner;

public class ProgramSwappingIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int [] arr= new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int a:arr) {
			System.out.print(a+" ");
			
		
		}
		System.out.println("enter 2 indexes whose elements swap");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int help=arr[x];
		arr[x]=arr[y];
		arr[y]=help;
		for(int b:arr) {
			System.out.print(b+" ");
		}
		

	}

}
