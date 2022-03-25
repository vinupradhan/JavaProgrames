package Practise;

public class Recursive 
{
	public static void printname(int a)
	{
		System.out.println("Vinay");
		printname(a);
	}
	
	public static void main(String[] args) 
	{
		printname(100);
	}
}
