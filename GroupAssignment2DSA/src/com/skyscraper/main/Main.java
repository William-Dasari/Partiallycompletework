package com.skyscraper.main;

import java.util.Scanner;
public class Main{
	static int maxFloors;
	public static void main(String[] args) {
		
		//User Enters the total number of floors to be built
		
		System.out.println("Enter total no of floors int the building : ");
		Scanner scanner=new Scanner(System.in);
		 maxFloors = scanner.nextInt();
		
		 
		 
		 //Size of floors received as day wise;
		 
		
		System.out.println("The order of construction is as follows ");
		
		SkyscraperDivideWork work=new SkyscraperDivideWork();
		work.service();
		
		scanner.close();
	}
}