package Practise;

public class ArmStrong {

	public static void main(String[] args) 
	{
		
		int no=153;  int sum=0;
		while(no!=0) 
		{
			int rem=no%10;
			rem=rem*rem*rem;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum); 
	}
}
