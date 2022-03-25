package JavaSDET30;

public class Print1stMaximumNumberwithoutUsingSorting {

	public static void main(String[] args) {
		
		int[] a={20, 40, 60, 30, 70, 50};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
