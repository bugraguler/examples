package com.syntax.class6;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		
		System.out.println("What is the day");
		Scanner in=new Scanner(System.in);
		int day=in.nextInt();
		
		switch(day) {
		case 1: 
			System.out.println("monday");
			break;
		case 2: 
			System.out.println("tue");
			break;
		case 3: 
			System.out.println("wend");
			break;
		case 4: 
			System.out.println("thur");
			break;
		default:
			System.out.println("nothingggggg");
			break;
		
		}

	}

}
