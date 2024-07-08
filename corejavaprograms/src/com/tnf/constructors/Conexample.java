package com.tnf.constructors;

public class Conexample{
	Conexample(){
	System.out.println("default con");
}
Conexample(int i)
{
	System.out.println("welcome");
	
}
Conexample (int i,int j)
{

	System.out.println("hello world");
	
}
Conexample(int i , String n){

	System.out.println("different types");
	
}
public static void main(String[] args)
{
	Conexample c1 = new Conexample();
	Conexample c2 = new Conexample(6);
	Conexample c3 = new Conexample(8,"t");
	}
}