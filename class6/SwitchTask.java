package com.syntax.class6;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		System.out.println("enter your country");
		Scanner in=new Scanner(System.in);
		String country=in.next();
		String food;
		switch (country){
			case "Abd":
				food = "burger";
				break;
			case "Turkey":
				food="doner";
				break;
			default:
				food="null";
			
		}if(!food.equals("null")) {
		System.out.println("your fav is "+ food);
		}else {
			System.out.println("try another");
		}
	
			
			
		
	}

}
