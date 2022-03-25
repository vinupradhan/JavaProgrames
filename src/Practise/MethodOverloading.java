package Practise;

public class MethodOverloading {

	static void disp(int a, String b)
	{
		System.out.println(a+" "+b);
	}
	static void disp(String c, int d)
	{
		System.out.println(c+" "+d);
	}

	public static void main(String[] args) {
		
		MethodOverloading.disp(123, "Hello");
		MethodOverloading.disp("People", 4201);
	}
}
