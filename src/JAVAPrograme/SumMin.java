package JAVAPrograme;

public class SumMin {


	public static void main(String[] args) 
	{
		int[] arr={20, 30, 50, 10, 40};
		int sum=0;
		for (int i=0; i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Min index is: "+ sum);
	}
}
