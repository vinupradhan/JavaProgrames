package Practise;

interface Demo
{
	void disp();
	
}

class Sample1 
{
	public void disp1()
	{
		System.out.println("Hello");
	}
	
}

class Sample implements Demo, extends Sample1
{
	public void disp()
	{
		System.out.println("Hi");
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.disp();
		s.disp1();
		
	}
}
