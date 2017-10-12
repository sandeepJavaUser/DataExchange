package com.redpine.example;

public class ConstuctCheck 
{
	public static void main(String args[])
	{
	Y y=new Y(10);
	
		
		
	}
}
class Y
{
	int g=14;
	static int x=144;
	static 
	{
		System.out.println("Cal :"+x);
	}	
	Y(int a)
	{
		this.g=a;
		System.out.println("Val :"+a+" Bal :"+g);
		ten();
	}
	public void ten()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Val of x stat :"+(x++));
			
		}
		System.out.println("x :"+x);
	}
	
}