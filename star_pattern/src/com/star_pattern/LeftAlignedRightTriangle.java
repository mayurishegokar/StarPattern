package com.star_pattern;

import java.util.Scanner;

public class LeftAlignedRightTriangle {

	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.println("Please enter the number that should be treated as the row. ");
     
     int num=sc.nextInt();
     
     for(int i=1;i<=num;i++)
     {
    	 for(int j=1;j<=i;j++)
    	 {
    		 System.out.print("* ");
    	 }
    	 System.out.println();
     }

	}

}
