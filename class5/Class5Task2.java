package com.syntax.class5;

import java.util.Scanner;

public class Class5Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		if the average score >=90 grade=A
		if the average score >= 70 and <90  grade=B
		if the average score>=50 and <70 grade=C
		if the average score<50  grade=F
		 */

		System.out.println("Hello Student!!! Can you write in order your Mid term Score? Quiz Score? and Final Score?");
		Scanner in=new Scanner(System.in);
		Double midTerm=in.nextDouble();
		Double quiz=in.nextDouble();
		Double finalscore=in.nextDouble();
		double avarage =((midTerm+quiz+finalscore)/3);
		System.out.println(avarage);
		if(avarage>=90) {
			System.out.println("Grade A wowww you genious");
		}else if(avarage>=70 && avarage<90) {
			System.out.println("Grade B are you good or you are good ");
		}else if(avarage>=50 && avarage<70){
			System.out.println("Grade C you have to work more bro");
	    }else if(avarage<50) {
	    	System.out.println("Grade F hey bro wtf");
	    }else {
	    	System.out.println("invalid value");
	    }
			
			
		}

}
