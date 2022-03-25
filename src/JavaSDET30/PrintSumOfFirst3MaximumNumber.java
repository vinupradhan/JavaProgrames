package JavaSDET30;

public class PrintSumOfFirst3MaximumNumber {

	public static void main(String[] args) {
		int[] a={50, 20, 40, 10, 30};
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for (int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
