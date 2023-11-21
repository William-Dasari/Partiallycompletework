package com.skyscraper.main;
import java.util.Scanner;
public class SkyscraperDivideWork {
	static int saved;
	Main main=new Main();
	SkyscraperQueue queue=new SkyscraperQueue(main.maxFloors);
	
	Scanner scanner=new Scanner(System.in);
	for(int i=1;i<=maxFloors;i++) {
		System.out.println("Enter the floor size given on day : "+i);
		int currentFloor=scanner.nextInt();
		queue.enqueue(currentFloor);
	}
	public void service() 
	{
		
		for(int j=0;j<queue.arr.length;j++) 
		{
			int k=j+1;
			System.out.println("Day : "+k);
		
			if(queue.arr[j]==main.maxFloors)
			{
				System.out.println(queue.arr[j]);
				queue.dequeue();
				main.maxFloors--;
		
			}
			else if(queue.arr[j]!=main.maxFloors) 
			{
				
			
				System.out.println("no work today");
			}
		
			else
			{
				System.out.println("default");
			}
		}
	}
}
