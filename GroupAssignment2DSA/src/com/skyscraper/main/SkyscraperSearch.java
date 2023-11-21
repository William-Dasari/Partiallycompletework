package com.skyscraper.main;


public class SkyscraperSearch
{
	int j;
	int[] arr=new int[10];
	
	
	public void insertzero() 
	{
		for(int i=0;i<arr.length;i++) 
		{
		arr[i]=0;
		}
	}
	
	
	public void search(int data) {
		for( j=0;j<arr.length;j++)
		{
			if(arr[j]== data)
			{
				System.out.println("Found"+j);
				break;
			}
		}
		if(j==arr.length+1)
		{
			System.out.println("not found");
		}
	}
	
	
	public static void main(String[] args) {
		
		SkyscraperSearch ss=new SkyscraperSearch();
		
		ss.arr[2]=38;
		ss.search(38); 
			
		
		
		for(int i1=0;i1<ss.arr.length;i1++) 
		{
			System.out.println(ss.arr[i1]);
		}
		
	}
	
}
