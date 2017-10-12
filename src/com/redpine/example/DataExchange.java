 package com.redpine.example;

public class DataExchange 
{
	private int h=10;
public static void main(String args[])
{	
	int g;	
	B b=new B();
	g=b.getA();
	System.out.println("Val :"+g);	
}
public int getH() {
	return h;
}
/*public void setH(int h) {
	this.h = h;
}*/
}
class B extends DataExchange
{
	private int a=1000;
	int c=new DataExchange().getH();
	/*B()
	{
		setA(this.a);
		System.out.println("C aval "+c);
	}
	public void setA(int d)
	{
		b=d;
	}*/
	public int getA()
	{
	   return a;	
	}
}
