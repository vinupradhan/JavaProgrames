package JavaSDET30;

public class PrintFirstMinimumNumber {

	public static void main(String[] args) {
		
		int[] a={20, 40, 50, 70, 30, 60};
		
		int fmax=0;
		int smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.print("1st Max "+fmax+" "+"2nd Max "+smax);
	}
}