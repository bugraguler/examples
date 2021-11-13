package com.syntax.class3;

import java.util.Scanner;

public class Class4Task1 {

	public static void main(String[] args) {
	
		Scanner tester =new Scanner(System.in);
		System.out.println("please enter your height by inch");
		int height =tester.nextInt();
		if(height<60) {
			System.out.println("Short");
		} if(height<=72){
		if(height>=60)
			System.out.println("Medium");
		} if(height>72) {
			System.out.println("tall");
		}
			
			
		}

	}


