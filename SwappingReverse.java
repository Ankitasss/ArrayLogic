package com.kodnest.swapping.logic;

import java.util.Scanner;

public class SwappingReverse {

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
		for(int i=arr.length-1;i>=0;i--) {
		
			System.out.print(arr[i]+" ");
		}
	}
		
	}


