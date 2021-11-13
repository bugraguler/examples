package com.syntax.class3;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		String str="Abc";
		str="zyx";
		Scanner scan = new Scanner(System.in);
		String name=scan.next(); 
		System.out.println("naber"+name);
		int age=scan.nextInt();
		System.out.println("yas"+age);
		
		
	}

}
