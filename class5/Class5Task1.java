package com.syntax.class5;

import java.util.Scanner;

public class Class5Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August season
		 * =“Summer”. At the end of the program we should see output as “You were born
		 * is season ______“.
		 */
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the month of your birthday!!");
		String mnth = in.next();
		String seasn=null;

		if (mnth.equalsIgnoreCase("December") || mnth.equalsIgnoreCase("January")
				|| mnth.equalsIgnoreCase("February")) {
			seasn = "Winter";

		} else if (mnth.equalsIgnoreCase("March") || mnth.equalsIgnoreCase("April") || mnth.equalsIgnoreCase("May")) {
			seasn = "Spring";
			System.out.println("You were born is season " + seasn);
		} else if (mnth.equalsIgnoreCase("June") || mnth.equalsIgnoreCase("July") || mnth.equalsIgnoreCase("August")) {
			seasn = "Summer";
			System.out.println("You were born is season " + seasn);
		} else if (mnth.equalsIgnoreCase("September") || mnth.equalsIgnoreCase("October")
				|| mnth.equalsIgnoreCase("November")) {
			seasn = "Autumn";
			System.out.println("You were born is season " + seasn);
		} else {
			seasn = "invalid value";
			System.out.println(seasn);
		}
		
	}
}
