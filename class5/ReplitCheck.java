package com.syntax.class5;
import java.util.Scanner;
public class ReplitCheck {
	  public static void main(String[]args) {
	System.out.println("Please enter 3 distinct numbers");
	Scanner in =new Scanner(System.in);
	int num1=in.nextInt();
	int num2=in.nextInt();
	int num3=in.nextInt();
	
	if(num1>num2 && num1>num3){
		System.out.println("The largest number is "+ (num1));
	}else if(num2>num1 && num2>num3){
		System.out.println("The largest number is "+ (num2));
	}else if(num3>num1 && num3>num2){
		System.out.println("The largest number is "+ (num3));
	} 

	


	  }

	}