package JavaSDET30;

public class BubbleSortSecondMaximum {

	public static void main(String[] args) {
		int[] a={30, 40, 60, 80, 50, 70};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[2]+" ");
	}
}
